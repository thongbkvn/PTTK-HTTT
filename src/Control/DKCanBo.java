
package Control;

import Entity.DanhMuc;
import Entity.HeThong;
import Entity.DiaBan;
import Database.Connect;
import Entity.HoNgheo;
import Entity.KhauNgheo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class DKCanBo {
    public static Connection conn = Connect.getConnect();
    public  static PreparedStatement pst = null;
    public static ResultSet rs=null;
    
    public static int themHoNgheo(HoNgheo hoNgheo) {
        try {
            String sql = "INSERT INTO dbo.tbHoNgheo(TenCH, Xom, IDXa, IDDanToc, IDPhanLoai, ThuNhapTB, IDNuoc, IDnguyenNhan, IDNhaO, TrangThai) "
                    + "VALUES(N'"+hoNgheo.getTenCH()+"', N'" + hoNgheo.getXom() + "', " + hoNgheo.getIdXa() + ", " + hoNgheo.getIdDanToc() + "," 
                    + hoNgheo.getIdPhanLoai() + ", " + hoNgheo.getThuNhapTB() + ", " + hoNgheo.getIdNuoc() + ", " + hoNgheo.getIdNguyenNhan() + ", "
                    + hoNgheo.getIdNhaO() + ", " + (hoNgheo.isTrangThai()?1:0)  + ")";
            pst = conn.prepareStatement(sql, new String[] {"IDHoNgheo"});
            pst.executeUpdate();
            
            rs = pst.getGeneratedKeys();
            rs.next();
            int idHoNgheo = rs.getInt(1);
            
            for (KhauNgheo khauNgheo : hoNgheo.getListKN()) {
                themKhauNgheo(khauNgheo, idHoNgheo);
            }
            return idHoNgheo;
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi, không thể thêm hộ nghèo vào cơ sở dữ liệu", "Thông báo lỗi", 2);
            return -1;
        }
    }
     
    public static void themKhauNgheo(KhauNgheo khauNgheo, int idHoNgheo) {
        try {
            String sql = "INSERT INTO dbo.tbKhauNgheo(IDHoNgheo, HoTen, IDQuanHeCH, GioiTinh, NamSinh, IDDanToc, IDNgheNghiep, IDDoiTuong) "
                    + "VALUES (" + idHoNgheo +", N'" + khauNgheo.getHoTen() + "', " + khauNgheo.getIdQuanHeCH() + ", " + (khauNgheo.isGioiTinh()?1:0) + ", "
                    + khauNgheo.getNamSinh() + ", " + khauNgheo.getIdDanToc() + ", " + khauNgheo.getIdNgheNghiep() + ", " + khauNgheo.getIdDoiTuong() + ")";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi, không thể thêm khẩu nghèo vào cơ sở dữ liệu", "Thông báo lỗi", 2);
        }
    }
   
    public static boolean suaHoNgheo(HoNgheo hoNgheo, int idHoNgheo) {
        try {
            String sql = "UPDATE dbo.tbHoNgheo SET " 
                    + "TehCH=N'"+hoNgheo.getTenCH()+"', XOM = N'" + hoNgheo.getXom() + "',IDXa = " + hoNgheo.getIdXa() + ", IDDanToc = " + hoNgheo.getIdDanToc() 
                    + ",IDPhanLoai = " + hoNgheo.getIdPhanLoai() + ", ThuNhapTB = " + hoNgheo.getThuNhapTB() + ", IDNuoc = " + hoNgheo.getIdNuoc() 
                    + ", IDNguyenNhan = " + hoNgheo.getIdNguyenNhan() + ", IDNhaO = " + hoNgheo.getIdNhaO() + ", TrangThai = " + (hoNgheo.isTrangThai()?1:0) 
                    + " WHERE IDHoNgheo = " + idHoNgheo;
            pst = conn.prepareStatement(sql, new String[] {"IDHoNgheo"});
            pst.executeUpdate();
            
            sql = "DELETE FROM dbo.tbKhauNgheo WHERE IDHoNgheo = " + idHoNgheo;
            pst = conn.prepareStatement(sql, new String[] {"IDHoNgheo"});
            pst.executeUpdate();
            
            for (KhauNgheo khauNgheo : hoNgheo.getListKN()) {
                themKhauNgheo(khauNgheo, idHoNgheo);
            }
            return true;
            
        } catch (Exception ex) {
            return false;
        }
    }
    public  static boolean themVaoDanhSachHN(int idHoNgheo, int NamNgheo) {
        try {
            String sql = "INSERT INTO dbo.tbDanhSachHN(IDHoNgheo, NamNgheo) VALUES("+idHoNgheo + ", " + NamNgheo+")";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public static void xoaKhoiDanhSachHN(int idHoNgheo, int namNgheo) {
        try {
            String sql = "DELETE FROM dbo.DanhSachHN WHERE IDHoNgheo = " + idHoNgheo + " AND NamNgheo = " + namNgheo;
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (Exception ex) {
        }
    }
    
    public static HoNgheo layThongTinHN(int idHoNgheo) {
        try {
            String sql = "SELECT TenCH, Xom, IDXa, IDDanToc, IDPhanLoai, ThuNhapTB, IDNuoc, IDnguyenNhan, TrangThai, IDNhaO "
                    + "FROM dbo.tbHoNgheo WHERE dbo.tbHoNgheo.IDHoNgheo = " + idHoNgheo;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            rs.next();
            
            HoNgheo hn;
            
            hn = new HoNgheo(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), (rs.getInt(9) != 0), rs.getInt(10));
           
            sql = "SELECT HoTen, IDQuanHeCH, GioiTinh, IDDanToc, IDNgheNghiep, IDDoiTuong, NamSinh "
                    + "FROM dbo.tbKhauNgheo WHERE dbo.tbKhauNgheo.IDHoNgheo = " + idHoNgheo;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                hn.getListKN().add(new KhauNgheo(rs.getString(1), rs.getInt(2), (rs.getInt(3)!=0), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7)));
            }
            
            return hn;
        } catch (Exception ex) {
            return null;
        }
    }
    
     public static boolean layThongTinHeThong()
     {
         
         try {
              HeThong.namNgheo = Calendar.getInstance().get(Calendar.YEAR);
             String sql = "SELECT  NgheoNT, CanNgheoNT, NgheoTT, CanNgheoTT "
                 + "FROM dbo.tbHeThong WHERE dbo.tbHeThong.Nam =" + HeThong.namNgheo;
             Statement st = conn.createStatement();
             rs = st.executeQuery(sql);
             while(rs.next())
             {
                 HeThong.ngheoNT = rs.getInt(1);
                 HeThong.canNgheoNT = rs.getInt(2);
                 HeThong.ngheoTT = rs.getInt(3);
                 HeThong.canNgheoTT = rs.getInt(4);
                 break;
             }
             
             
             sql = "select * from dbo.tbDoiTuong";
             rs = st.executeQuery(sql);
             while (rs.next())
             {
                 HeThong.dmDoiTuong.add(new DanhMuc(rs.getInt(1), rs.getString(2)));
             }
             
             sql = "select * from dbo.tbQuanHe";
             rs = st.executeQuery(sql);
             while (rs.next())
             {
                 HeThong.dmQuanHe.add(new DanhMuc(rs.getInt(1), rs.getString(2)));
             }
             

             sql = "select * from dbo.tbDanToc";
             rs = st.executeQuery(sql);
             while (rs.next())
             {
                 HeThong.dmDanToc.add(new DanhMuc(rs.getInt(1), rs.getString(2)));
             }

             
             sql = "select * from dbo.tbNgheNghiep";
             rs = st.executeQuery(sql);
             while (rs.next())
             {
                 HeThong.dmNgheNghiep.add(new DanhMuc(rs.getInt(1), rs.getString(2)));
             }
             
             sql = "select * from dbo.tbKhuVuc";
             rs = st.executeQuery(sql);
             while (rs.next())
             {
                 HeThong.dmKhuVuc.add(new DanhMuc(rs.getInt(1), rs.getString(2)));
             }
             
             sql = "select * from dbo.tbPhanLoai";
             rs = st.executeQuery(sql);
             while (rs.next())
             {
                 HeThong.dmPhanLoai.add(new DanhMuc(rs.getInt(1), rs.getString(2)));
             }
             
             sql = "select * from dbo.tbNhaO";
             rs = st.executeQuery(sql);
             while (rs.next())
             {
                 HeThong.dmNhaO.add(new DanhMuc(rs.getInt(1), rs.getString(2)));
             }
             
             sql = "select * from dbo.tbNuoc";
             rs = st.executeQuery(sql);
             while (rs.next())
             {
                 HeThong.dmNuoc.add(new DanhMuc(rs.getInt(1), rs.getString(2)));
             }
             
             sql = "select * from dbo.tbNguyenNhan";
             rs = st.executeQuery(sql);
             while (rs.next())
             {
                 HeThong.dmNguyenNhan.add(new DanhMuc(rs.getInt(1), rs.getString(2)));
             }
             return true;
        } catch (SQLException ex) {
            return false;
        }
     }
     
   
     
     public static DanhMuc layKhuVuc(int maxXa) {
         String sql;
         try {
             Statement st =conn.createStatement();
             sql = "SELECT dbo.tbXa.IDKhuVuc, TenKhuVuc FROM dbo.tbXa, dbo.tbKhuVuc "
                     + "WHERE dbo.tbXa.IDKhuVuc = dbo.tbKhuVuc.IDKhuVuc AND IDXa = " + maxXa;
             rs = st.executeQuery(sql);
             rs.next();
             
             return new DanhMuc(rs.getInt(1), rs.getString(2));
         } catch (Exception ex) {
             return null;
         }
         }
            
             
     
     public static DiaBan layDiaBan(int cap, int ma)
     {
         String sql;
        try {
            
             Statement st = conn.createStatement();
             String tinh = "", huyen = "", xa = "";
             if (cap == 1)
             {
                sql = "SELECT dbo.tbTinh.TenTinh from dbo.tbTinh";
                rs = st.executeQuery(sql);
                while(rs.next())
                {
                    tinh = rs.getString(1);
                    break;
                }
                return new DiaBan(cap, tinh, "", "");

             }
             else if (cap == 2)
             {
                 sql = "SELECT dbo.tbTinh.TenTinh, dbo.tbHuyen.TenHuyen from dbo.tbTinh, dbo.tbHuyen WHERE dbo.tbHuyen.IDTinh = dbo.tbTinh.IDTinh";
                 rs = st.executeQuery(sql);
                while(rs.next())
                {
                    tinh = rs.getString(1);
                    huyen = rs.getString(2);
                    break;
                }
                return new DiaBan(cap, tinh, huyen, "");
             }
             else
             {
                sql ="SELECT     dbo.tbTinh.TenTinh, dbo.tbHuyen.TenHuyen,  dbo.tbXa.TenXa FROM      dbo.tbXa, dbo.tbHuyen, dbo.tbTinh WHERE  dbo.tbXa.IDHuyen=dbo.tbHuyen.IDHuyen AND dbo.tbHuyen.IDTinh = dbo.tbTinh.IDTinh AND dbo.tbXa.IDXa = " + ma;
                rs = st.executeQuery(sql);
                while(rs.next())
                {
                    tinh = rs.getString(1);
                    huyen = rs.getString(2);
                    xa = rs.getString(3);
                    break;
                }
                return new DiaBan(cap, tinh, huyen, xa);
             }
             
        } catch (Exception ex) {
            return null;
        }
     }

    
     
}
