
package Main;
import Oject.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import qlhongheo.*;


public class formThemHN extends javax.swing.JFrame {

    private static CanBo userInfo;
    private static JFrame father;
    private static ArrayList<KhauNgheo> listkn = new ArrayList<KhauNgheo>();

    public formThemHN(CanBo userInfo, JFrame father) {
        this.father = father;
        this.userInfo = userInfo;
        initComponents();
        loadComBox();
        this.txtnamngheo.setText(""+HeThong.NamNgheo);
        loadDiaBan(); 
        xemKhauNgheo();
    }
    public void loadComBox()
    {
        for (DanhMuc i : HeThong.dmDanToc) {
            this.cbxdantoc.addItem(i.ID + "." + i.ten);
        }
        for (DanhMuc i : HeThong.dmChinhSach) {
            this.cbxdoituong.addItem(i.ID + "." + i.ten);
        }
        for (DanhMuc i : HeThong.dmKhuVuc) {
            this.cbxkhuvuc.addItem(i.ID + "." + i.ten);
        }
        for (DanhMuc i : HeThong.dmNgheNghiep) {
            this.cbxnghenghiep.addItem(i.ID + "." + i.ten);
        }
        for (DanhMuc i : HeThong.dmNguyenNhan) {
            this.cbxnguyennhan.addItem(i.ID + "." + i.ten);
        }
        for (DanhMuc i : HeThong.dmNhaO) {
            this.cbxnhao.addItem(i.ID + "." + i.ten);
        }
        for (DanhMuc i : HeThong.dmNuoc) {
            this.cbxnuoc.addItem(i.ID + "." + i.ten);
        }
         for (DanhMuc i : HeThong.dmPhanLoai) {
            this.cbxphanloai.addItem(i.ID + "." + i.ten);
        }
          for (DanhMuc i : HeThong.dmQuanHe) {
            this.cbxquanhe.addItem(i.ID + "." + i.ten);
        }
          for (DanhMuc i : HeThong.dmDanToc) {
            this.cbxdt2.addItem(i.ID + "." + i.ten);
        }
    }
    public void loadDiaBan()
    {
        DiaBan db = dkcanbo.layDiaBan(userInfo.getCapQL(), userInfo.getDiaBanQL());
        this.txthuyen.setText(db.getHuyen());
        this.txtxa.setText(db.getXa());
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbkhaungheo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtchuho = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtmahn = new javax.swing.JTextField();
        txtthon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtxa = new javax.swing.JTextField();
        txthuyen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxkhuvuc = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cbxdantoc = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cbxphanloai = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtthunhap = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtsokhau = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtnamngheo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbxnuoc = new javax.swing.JComboBox();
        checkthe = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        cbxnhao = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        cbxnguyennhan = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cbxquanhe = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        cbxgioitinh = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cbxdt2 = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        cbxnghenghiep = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        cbxdoituong = new javax.swing.JComboBox();
        btthemkn = new javax.swing.JButton();
        btchinhsua = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btthemhn = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        txtnamsinh = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbkhaungheo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbkhaungheo);

        jLabel1.setText("HỆ THỐNG QUẢN LÝ HỘ NGHÈO");

        jLabel2.setText("Mã hộ nghèo");

        jLabel4.setText("Tên chủ hộ");

        jLabel5.setText("Thôn/Xóm");

        jLabel3.setText("Xã");

        jLabel7.setText("Huyện");

        txtxa.setEditable(false);

        txthuyen.setEditable(false);

        jLabel6.setText("Khu Vực");

        cbxkhuvuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxkhuvucActionPerformed(evt);
            }
        });

        jLabel8.setText("Dân Tộc");

        jLabel9.setText("Phân loại hộ nghèo");

        jLabel10.setText("Thu nhập bình quân");

        jLabel11.setText("Số nhân khẩu");

        jLabel12.setText("Năm nghèo");

        txtnamngheo.setEditable(false);

        jLabel13.setText("Nước sạch");

        checkthe.setText("Đã cấp thẻ");

        jLabel14.setText("Nhà ở");

        jLabel15.setText("Nguyên nhân nghèo");

        jLabel16.setBackground(new java.awt.Color(0, 0, 153));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("Khẩu nghèo");

        jLabel17.setText("Họ tên");

        jLabel18.setText("Quan hệ với chủ hộ");

        jLabel19.setText("Giới tính");

        cbxgioitinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1.Nam", "2.Nữ" }));

        jLabel20.setText("Năm Sinh");

        jLabel21.setText("Dân tộc");

        jLabel22.setText("Nghề nghiệp");

        jLabel23.setText("Đối tượng chính sách");

        btthemkn.setText("Thêm khẩu nghèo");
        btthemkn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthemknActionPerformed(evt);
            }
        });

        btchinhsua.setText("Chỉnh sửa");

        jButton3.setText("Xóa");

        jButton4.setText("Quay lại");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btthemhn.setText("Thêm hộ nghèo");
        btthemhn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthemhnActionPerformed(evt);
            }
        });

        jButton6.setText("Hủy");

        jButton7.setText("Tìm kiếm");

        jButton9.setText("Báo cáo danh sách");

        jButton10.setText("Báo cáo số liệu");

        jButton11.setText("Cập nhật");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btthemkn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btchinhsua, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtsokhau)
                                                .addComponent(cbxkhuvuc, 0, 128, Short.MAX_VALUE)
                                                .addComponent(txtmahn))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                                        .addComponent(cbxnhao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxdt2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxquanhe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtchuho, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbxdantoc, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtnamngheo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtthon, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtxa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txthuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbxdoituong, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbxgioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(87, 87, 87))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbxnuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(checkthe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbxphanloai, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(cbxnguyennhan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(32, 32, 32)
                                        .addComponent(txtthunhap, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(cbxnghenghiep, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(136, 136, 136)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtnamsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btthemhn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtchuho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtmahn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtthon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(txtxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxkhuvuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cbxdantoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cbxphanloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtthunhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtsokhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtnamngheo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cbxnuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkthe))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbxnhao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(cbxnguyennhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jButton10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cbxquanhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(cbxgioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jButton11)
                    .addComponent(txtnamsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(cbxdt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(cbxnghenghiep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(cbxdoituong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btthemkn)
                    .addComponent(btchinhsua)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(btthemhn)
                    .addComponent(jButton6))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxkhuvucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxkhuvucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxkhuvucActionPerformed

    private String getID(JComboBox cbx)
    {
       return cbx.getSelectedItem().toString().split("\\.")[0];
    }
    
    private int getIDInt(JComboBox cbx)
    {
        return Integer.parseInt(cbx.getSelectedItem().toString().split("\\.")[0]);
    }
    private void btthemhnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemhnActionPerformed
        // TODO add your handling code here:
      dkcanbo.themHoNgheo(this.txtchuho.getText(), this.txtthon.getText(),this.txtxa.getText(), getID(this.cbxkhuvuc),getID(this.cbxdantoc) ,getID(this.cbxphanloai), this.txtthunhap.getText(), this.txtsokhau.getText(),HeThong.NamNgheo , getID(this.cbxnuoc), getID(this.cbxnguyennhan), this.checkthe.isSelected(), getID(this.cbxnhao));
      int IDHoNgheo = dkcanbo.layIDHoNgheoVuaThem(userInfo.getDiaBanQL());
    }//GEN-LAST:event_btthemhnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        father.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btthemknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemknActionPerformed
        // TODO add your handling code here:
        listkn.add(new KhauNgheo(this.txthoten.getText(), getIDInt(this.cbxquanhe), getIDInt(this.cbxgioitinh)==1?true:false, getIDInt(this.cbxdantoc),
                getIDInt(this.cbxnghenghiep), getIDInt(this.cbxdoituong), Integer.parseInt(this.txtnamsinh.getText())));
        xemKhauNgheo();
    }//GEN-LAST:event_btthemknActionPerformed

    public void xemKhauNgheo() {
        Vector cols = new Vector();
        cols.addElement("Họ Tên");
        cols.addElement("Giới Tính");
        cols.addElement("Năm Sinh");
        cols.addElement("QH Với Chủ Hộ");
        cols.addElement("Đối tượng");
        cols.addElement("Nghề Nghiệp");
        
        Vector data = new Vector();
        for (KhauNgheo i: listkn)
        {
            Vector user = new Vector();
            user.addElement(i.getHoTen());
            user.addElement(i.isGioiTinh()?"Nam":"Nữ");
            user.addElement(""+i.getNamSinh());
            user.addElement(HeThong.dmQuanHe.get(i.getIdQuanHeCH()).ten);
            user.addElement(HeThong.dmChinhSach.get(i.getIdChinhSach()).ten);
            user.addElement(HeThong.dmNgheNghiep.get(i.getIdNgheNghiep()).ten);

            data.add(user);
        }
        
        this.tbkhaungheo.setModel(new DefaultTableModel(data, cols));
    }
    /**is.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formThemHN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formThemHN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formThemHN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formThemHN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formThemHN(userInfo, father).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btchinhsua;
    private javax.swing.JButton btthemhn;
    private javax.swing.JButton btthemkn;
    private javax.swing.JComboBox cbxdantoc;
    private javax.swing.JComboBox cbxdoituong;
    private javax.swing.JComboBox cbxdt2;
    private javax.swing.JComboBox cbxgioitinh;
    private javax.swing.JComboBox cbxkhuvuc;
    private javax.swing.JComboBox cbxnghenghiep;
    private javax.swing.JComboBox cbxnguyennhan;
    private javax.swing.JComboBox cbxnhao;
    private javax.swing.JComboBox cbxnuoc;
    private javax.swing.JComboBox cbxphanloai;
    private javax.swing.JComboBox cbxquanhe;
    private javax.swing.JCheckBox checkthe;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbkhaungheo;
    private javax.swing.JTextField txtchuho;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txthuyen;
    private javax.swing.JTextField txtmahn;
    private javax.swing.JTextField txtnamngheo;
    private javax.swing.JTextField txtnamsinh;
    private javax.swing.JTextField txtsokhau;
    private javax.swing.JTextField txtthon;
    private javax.swing.JTextField txtthunhap;
    private javax.swing.JTextField txtxa;
    // End of variables declaration//GEN-END:variables
}
