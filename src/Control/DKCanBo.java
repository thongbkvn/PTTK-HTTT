
package Control;

import Entity.DanhMuc;
import Entity.HeThong;
import Entity.DiaBan;
import Database.Connect;
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
     public static void themHoNgheo( String tench, String xom, String xa, String dantoc, String phanloai, String thunhap, String sonk, int namngheo, String nuocsach, String nguyennhan, boolean trangthai,String nhao )
    {
        String sql ="insert into dbo.tbHoNgheo (TenCH, Xom, IDXa, IDDanToc, IDPhanLoai, ThuNhapTB, SoNK, NamNgheo, IDNuoc, IDnguyenhan, TrangThai, IDNhaO) "
               + "values (N'"+tench+"',N'"+xom+"',N'"+xa+"',N'"+dantoc+"',N'"+phanloai+"',N'"+thunhap+"',N'"+sonk+"',"+namngheo+",N'"+nuocsach+"',N'"+nguyennhan+"',"+trangthai+",N'"+nhao+"')";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm hộ nghèo thành công","Thông báo",1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Xảy ra lỗi không thể thêm hộ nghèo ","Thông báo",2);
        }
            
    }
     
     public static void themKhauNgheo(int idhongheo, String hoten, int idquanhe, boolean gt, int namsinh, int dantoc, int nghenghiep, int doituong ){
         String sql = "insert into dbo.tbKhauNgheo (IDHoNgheo, HoTen, IDQuanHeCH, GioiTinh, NamSinh, IDDanToc, IDNgheNghiep, IDDoiTuong)"
                 + "Values("+idhongheo+", '"+hoten+"',"+ idquanhe+", '"+ gt+"', "+ namsinh+" ,"+ dantoc+", "+nghenghiep+", "+doituong+")";
          try {
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm khẩu nghèo thành công","Thông báo",1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Xảy ra lỗi không thể thêm khẩu nghèo ","Thông báo",2);
        }
     }
     
     public static void layThongTinHeThong()
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

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Xảy ra lỗi hệ thống ","Thông báo",2);
        }
     }
     
     public static int layIDHoNgheoVuaThem(int maxa) {
         String sql;
         try {
             Statement st = conn.createStatement();
             sql = "SELECT MAX(dbo.tbHoNgheo.IDHoNgheo) FROM dbo.tbHoNgheo WHERE dbo.tbHoNgheo.maxa = " + maxa;
             rs = st.executeQuery(sql);
             return rs.getInt(1);
         } catch (Exception ex) {
             return 0;
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
             JOptionPane.showMessageDialog(null, "Không thể lấy thông tin khu vực của địa bàn", "Thông Báo Lỗi", 2);
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
            JOptionPane.showMessageDialog(null, "Không thể lấy địa bàn ","Thông báo",2);
            return null;
        }
     }
     
}
