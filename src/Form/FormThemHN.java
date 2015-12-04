package Form;

import Entity.DanhMuc;
import Entity.KhauNgheo;
import Entity.CanBo;
import Entity.HeThong;
import Entity.DiaBan;
import Control.DKCanBo;
import Entity.HoNgheo;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public final class FormThemHN extends javax.swing.JFrame {

    private static CanBo userInfo;
    private static JFrame father;
    private static HoNgheo hoNgheo;
    private static final ArrayList<KhauNgheo> listkn = new ArrayList<>();
    private static boolean themMoi = true;

    public FormThemHN(CanBo userInfo, JFrame father) {
        FormThemHN.father = father;
        FormThemHN.userInfo = userInfo;
        initComponents();
        loadComBox();
        txtnamngheo.setText("" + HeThong.namNgheo);
        loadDiaBan();
        btchinhsua.setEnabled(false);

        xemDanhSachKN();

        if (userInfo.isTrangThai() == false) {
            btchinhsua.setVisible(false);
            btthemhn.setVisible(false);
            btthemkn.setVisible(false);
            JOptionPane.showMessageDialog(null, "Bạn hiện không có quyền thêm, liên hệ cấp quản trị cao hơn để biết thêm thông tin", "Thông báo", 2);
        }
    }

    public void loadComBox() {
        for (DanhMuc i : HeThong.dmDanToc) {
            cbxdantocch.addItem(i.id + "." + i.ten);
        }
        for (DanhMuc i : HeThong.dmDoiTuong) {
            cbxdoituong.addItem(i.id + "." + i.ten);
        }
        for (DanhMuc i : HeThong.dmKhuVuc) {
            cbxkhuvuc.addItem(i.id + "." + i.ten);
        }
        for (DanhMuc i : HeThong.dmNgheNghiep) {
            cbxnghenghiep.addItem(i.id + "." + i.ten);
        }
        for (DanhMuc i : HeThong.dmNguyenNhan) {
            cbxnguyennhan.addItem(i.id + "." + i.ten);
        }
        for (DanhMuc i : HeThong.dmNhaO) {
            cbxnhao.addItem(i.id + "." + i.ten);
        }
        for (DanhMuc i : HeThong.dmNuoc) {
            cbxnuoc.addItem(i.id + "." + i.ten);
        }
        for (DanhMuc i : HeThong.dmPhanLoai) {
            cbxphanloai.addItem(i.id + "." + i.ten);
        }
        for (DanhMuc i : HeThong.dmQuanHe) {
            cbxquanhe.addItem(i.id + "." + i.ten);
        }
        for (DanhMuc i : HeThong.dmDanToc) {
            cbxdantockn.addItem(i.id + "." + i.ten);
        }
    }

    public void loadDiaBan() {
        DiaBan db = DKCanBo.layDiaBan(userInfo.getCapQL(), userInfo.getDiaBanQL());
        txthuyen.setText(db.getHuyen());
        txtxa.setText(db.getXa());
        cbxkhuvuc.setSelectedIndex(userInfo.getIdKhuVuc() - 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdanhsachkn = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txthotench = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtmahn = new javax.swing.JTextField();
        txtxom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtxa = new javax.swing.JTextField();
        txthuyen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxkhuvuc = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cbxdantocch = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cbxphanloai = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtthunhap = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtnamngheo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbxnuoc = new javax.swing.JComboBox();
        cbDaCapThe = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        cbxnhao = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        cbxnguyennhan = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txthotenkn = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cbxquanhe = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        cbxgioitinh = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cbxdantockn = new javax.swing.JComboBox();
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
        txtnamsinhkn = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbdanhsachkn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbdanhsachkn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdanhsachknMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbdanhsachkn);

        jLabel2.setText("Mã hộ nghèo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Tên chủ hộ");

        txthotench.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txthotenchFocusLost(evt);
            }
        });

        jLabel5.setText("Thôn/Xóm");

        txtmahn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmahnFocusLost(evt);
            }
        });

        jLabel3.setText("Xã");

        jLabel7.setText("Huyện");

        txtxa.setEditable(false);
        txtxa.setBackground(new java.awt.Color(204, 204, 204));
        txtxa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtxa.setEnabled(false);
        txtxa.setFocusable(false);

        txthuyen.setEditable(false);
        txthuyen.setBackground(new java.awt.Color(204, 204, 204));
        txthuyen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txthuyen.setEnabled(false);
        txthuyen.setFocusable(false);

        jLabel6.setText("Khu Vực");

        cbxkhuvuc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbxkhuvuc.setEnabled(false);
        cbxkhuvuc.setFocusable(false);
        cbxkhuvuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxkhuvucActionPerformed(evt);
            }
        });

        jLabel8.setText("Dân Tộc");

        jLabel9.setText("Phân Loại");

        cbxphanloai.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbxphanloai.setEnabled(false);
        cbxphanloai.setFocusable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Thu nhập");

        txtthunhap.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtthunhap.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtthunhapFocusLost(evt);
            }
        });

        jLabel12.setText("Năm nghèo");

        txtnamngheo.setEditable(false);
        txtnamngheo.setBackground(new java.awt.Color(204, 204, 204));
        txtnamngheo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtnamngheo.setEnabled(false);
        txtnamngheo.setFocusable(false);

        jLabel13.setText("Nước sạch");

        cbDaCapThe.setText("Đã cấp thẻ");

        jLabel14.setText("Nhà ở");

        jLabel15.setText("Nguyên nhân nghèo");

        jLabel16.setBackground(new java.awt.Color(0, 0, 153));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("KHẨU NGHÈO");

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
        btchinhsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btchinhsuaActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Quay lại");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btthemhn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btthemhn.setText("Thêm mới");
        btthemhn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthemhnActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Hủy");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel24.setText("000 VNĐ/Người/Tháng");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("THÊM HỘ NGHÈO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btthemkn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btchinhsua, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btthemhn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cbxkhuvuc, javax.swing.GroupLayout.Alignment.TRAILING, 0, 128, Short.MAX_VALUE)
                                                .addComponent(txtmahn, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(cbxnhao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtnamngheo, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(txthotenkn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbxdantockn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbxquanhe, 0, 139, Short.MAX_VALUE)
                                            .addGap(19, 19, 19))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(cbxnuoc, javax.swing.GroupLayout.Alignment.LEADING, 0, 154, Short.MAX_VALUE)
                                                .addComponent(txthotench, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cbxdantocch, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(34, 34, 34)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cbxnguyennhan, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(203, 203, 203)
                                                    .addComponent(cbDaCapThe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(txtxom)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtxa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(txtthunhap, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txthuyen, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(cbxphanloai, javax.swing.GroupLayout.Alignment.TRAILING, 0, 139, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(0, 55, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(cbxdoituong, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(cbxgioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(66, 66, 66)
                                                    .addComponent(jLabel20)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtnamsinhkn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(54, 54, 54)
                                    .addComponent(cbxnghenghiep, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txthotench, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtmahn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtxom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(txtxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxkhuvuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cbxdantocch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtthunhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel9)
                    .addComponent(cbxphanloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cbxnuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cbxnhao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(cbxnguyennhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtnamngheo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDaCapThe))
                .addGap(25, 25, 25)
                .addComponent(jLabel16)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txthotenkn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cbxquanhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(cbxgioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtnamsinhkn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(cbxdantockn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(cbxnghenghiep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(cbxdoituong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btthemkn)
                    .addComponent(btchinhsua)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1084, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxkhuvucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxkhuvucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxkhuvucActionPerformed

    private String getIDStr(JComboBox cbx) {
        return cbx.getSelectedItem().toString().split("\\.")[0];
    }

    private int getIDInt(JComboBox cbx) {
        return Integer.parseInt(cbx.getSelectedItem().toString().split("\\.")[0]);
    }
    private void btthemhnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemhnActionPerformed
        // TODO add your handling code here:
        try {
            if (txthotench.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Chưa nhập họ tên chủ hộ");
                return;
            }

            if (txtxom.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Chưa nhập xóm");
                return;
            }

            if (txtthunhap.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Chưa nhập mức thu nhập");
                return;
            }

            HoNgheo hoNgheo = new HoNgheo(txthotench.getText(), txtxom.getText(), userInfo.getDiaBanQL(), getIDInt(cbxdantocch), getIDInt(cbxphanloai), Integer.parseInt(txtthunhap.getText()) * 1000, getIDInt(cbxnuoc), getIDInt(cbxnguyennhan), cbDaCapThe.isSelected() ? true : false, getIDInt(cbxnhao));
            for (KhauNgheo kn : listkn) {
                hoNgheo.themKN(kn);
            }

            if (themMoi) {
                int idHoNgheo = DKCanBo.themHoNgheo(hoNgheo);
                if (idHoNgheo >= 0) {
                    if (DKCanBo.themVaoDanhSachHN(idHoNgheo, HeThong.namNgheo)) {
                        JOptionPane.showMessageDialog(this, "Đã thêm thành công hộ nghèo, mã hộ nghèo là:  " + idHoNgheo, "Thêm hộ nghèo thành công", 1);
                        txtmahn.setText("" + idHoNgheo);
                        listkn.clear();
                    }
                }
            }
            else {
                int idHoNgheo = Integer.parseInt(txtmahn.getText());
                if (!DKCanBo.themVaoDanhSachHN(idHoNgheo, HeThong.namNgheo)) {
                    JOptionPane.showMessageDialog(this, "Hộ nghèo đã được thêm lại từ trước.", "Thất bại", 1);
                }
                else {
                    if (DKCanBo.suaHoNgheo(hoNgheo, idHoNgheo))
                        JOptionPane.showMessageDialog(this, "Đã thêm hộ nghèo cũ thành công", "Thành công", 1);
                    else  {
                        DKCanBo.xoaKhoiDanhSachHN(idHoNgheo, HeThong.namNgheo);
                        JOptionPane.showMessageDialog(this, "Kiểm tra lại thông tin hộ nghèo", "Thất bại", 1);
                    }
                }
                
            }

        } catch (HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Đã có lỗi xảy ra, không thể thêm hộ nghèo", "Thông báo lỗi", 2);
        }
    }//GEN-LAST:event_btthemhnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        father.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btthemknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemknActionPerformed
        // TODO add your handling code here:
        if (txthotenkn.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập tên khẩu nghèo");
            return;
        }
        if (txtnamsinhkn.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập năm sinh khẩu nghèo");
            return;
        }

        try {
            if (Integer.parseInt(txtnamsinhkn.getText()) < HeThong.namNgheo - 130) {
                JOptionPane.showMessageDialog(this, "Năm sinh khẩu nghèo không hợp lệ");
                return;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Năm sinh phải là số");
            txtnamsinhkn.setText("");
            return;
        }

        KhauNgheo khauNgheo = new KhauNgheo(txthotenkn.getText(), getIDInt(cbxquanhe), (getIDInt(cbxgioitinh) == 1), getIDInt(cbxdantocch),
                getIDInt(cbxnghenghiep), getIDInt(cbxdoituong), Integer.parseInt(txtnamsinhkn.getText()));
        listkn.add(khauNgheo);
        xemDanhSachKN();
    }//GEN-LAST:event_btthemknActionPerformed

    private void txtthunhapFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtthunhapFocusLost
        // TODO add your handling code here:
        int tn = 0;
        try {
            tn = Integer.parseInt(txtthunhap.getText()) * 1000;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Thu nhập phải là số nguyên theo đơn vị VNĐ");
            txtthunhap.setText("");
            return;
        }

        if (tn < 0) {
            JOptionPane.showMessageDialog(this, "Thu nhập không hợp lệ");
            txtthunhap.setText("");
            return;
        }

        if (userInfo.getIdKhuVuc() == 1) {
            if (tn > HeThong.canNgheoNT) {
                JOptionPane.showMessageDialog(this, "Thu nhập không nằm trong đối tượng hộ nghèo hoặc cận nghèo");
                txtthunhap.setText("");
            } else if (tn <= HeThong.ngheoNT) {
                cbxphanloai.setSelectedIndex(0); //Ngheo NT
            } else {
                cbxphanloai.setSelectedIndex(1); //Can Ngheo NT
            }
        } else if (tn > HeThong.canNgheoTT) {
            JOptionPane.showMessageDialog(this, "Thu nhập không nằm trong đối tượng hộ nghèo hoặc cận nghèo");
            txtthunhap.setText("");
        } else if (tn <= HeThong.ngheoTT) {
            cbxphanloai.setSelectedIndex(2);
        } else {
            cbxphanloai.setSelectedIndex(3);
        }

    }//GEN-LAST:event_txtthunhapFocusLost

    private void txthotenchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthotenchFocusLost
        // TODO add your handling code here:
        txthotenkn.setText(txthotench.getText());
        cbxquanhe.setSelectedIndex(0);
    }//GEN-LAST:event_txthotenchFocusLost

    private void txtmahnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmahnFocusLost
        // TODO add your handling code here:
        if (txtmahn.getText().equals("")) {
            themMoi = false;
            btthemhn.setText("Them Mới");
            //lbkieuthem.setText("Thêm hộ nghèo mới");
        }

        try {
            int idHoNgheo = Integer.parseInt(txtmahn.getText());
            HoNgheo hoNgheo = DKCanBo.layThongTinHN(idHoNgheo);
            hienThiHoNgheo(hoNgheo, idHoNgheo);
            themMoi = false;
            btthemhn.setText("Thêm Cũ");
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_txtmahnFocusLost

    private void tbdanhsachknMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdanhsachknMouseClicked
        // TODO add your handling code here:
        int index = tbdanhsachkn.getSelectedRow();
        KhauNgheo khauNgheo = listkn.get(index);
        hienThiKhauNgheo(khauNgheo);
        btchinhsua.setEnabled(true);
    }//GEN-LAST:event_tbdanhsachknMouseClicked

    private void btchinhsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btchinhsuaActionPerformed
        // TODO add your handling code here:
        if (txthotenkn.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập tên khẩu nghèo");
            return;
        }
        if (txtnamsinhkn.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập năm sinh khẩu nghèo");
            return;
        }

        try {
            if (Integer.parseInt(txtnamsinhkn.getText()) < HeThong.namNgheo - 130) {
                JOptionPane.showMessageDialog(this, "Năm sinh khẩu nghèo không hợp lệ");
                return;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Năm sinh phải là số");
            txtnamsinhkn.setText("");
            return;
        }

        KhauNgheo khauNgheo = new KhauNgheo(txthotenkn.getText(), getIDInt(cbxquanhe), (getIDInt(cbxgioitinh) == 1), getIDInt(cbxdantocch),
                getIDInt(cbxnghenghiep), getIDInt(cbxdoituong), Integer.parseInt(txtnamsinhkn.getText()));
        
        int index = tbdanhsachkn.getSelectedRow();
        listkn.set(index, khauNgheo);
        xemDanhSachKN();
        tbdanhsachkn.clearSelection();
        btchinhsua.setEnabled(false);
    }//GEN-LAST:event_btchinhsuaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int index = tbdanhsachkn.getSelectedRow();
        listkn.remove(index);
        xemDanhSachKN();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        xoaHienThi();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void hienThiKhauNgheo(KhauNgheo khauNgheo) {
        txthotenkn.setText(khauNgheo.getHoTen());
        cbxquanhe.setSelectedIndex(khauNgheo.getIdQuanHeCH() - 1);
        cbxgioitinh.setSelectedIndex(khauNgheo.isGioiTinh()?0:1);
        txtnamsinhkn.setText(""+khauNgheo.getNamSinh());
        cbxdantockn.setSelectedIndex(khauNgheo.getIdDanToc()-1);
        cbxnghenghiep.setSelectedIndex(khauNgheo.getIdNgheNghiep() - 1);
        cbxdoituong.setSelectedIndex(khauNgheo.getIdDoiTuong() - 1);
    }
    
    private void xoaHienThi() {
        txthotenkn.setText("");
        cbxquanhe.setSelectedIndex(0);
        cbxgioitinh.setSelectedIndex(0);
        txtnamsinhkn.setText("");
        cbxdantockn.setSelectedIndex(0);
        cbxnghenghiep.setSelectedIndex(0);
        cbxdoituong.setSelectedIndex(0);
        
        txtmahn.setText("");
        txthotench.setText("");
        txtxom.setText("");
        txtxa.setText("");
        txthuyen.setText("");
        cbxkhuvuc.setSelectedIndex(0);
        cbxdantocch.setSelectedIndex(0);
        txtthunhap.setText("");
        cbxphanloai.setSelectedIndex(0);
        cbxnhao.setSelectedIndex(0);
        cbxnuoc.setSelectedIndex(0);
        cbxnguyennhan.setSelectedIndex(0);
        txtnamngheo.setText("");
        cbDaCapThe.setSelected(false);

        listkn.clear();
        xemDanhSachKN();
    }
    public void hienThiHoNgheo(HoNgheo hoNgheo, int idHoNgheo) {
        if (idHoNgheo != 0) {
            txtmahn.setText("" + idHoNgheo);
        }
        txthotench.setText(hoNgheo.getTenCH());
        txtxom.setText(hoNgheo.getXom());
        DiaBan db = DKCanBo.layDiaBan(3, hoNgheo.getIdXa());
        txtxa.setText(db.getXa());
        txthuyen.setText(db.getHuyen());
        cbxkhuvuc.setSelectedIndex(userInfo.getIdKhuVuc() - 1);
        cbxdantocch.setSelectedIndex(hoNgheo.getIdDanToc() - 1);
        txtthunhap.setText("" + hoNgheo.getThuNhapTB() / 1000);
        cbxphanloai.setSelectedIndex(hoNgheo.getIdPhanLoai() - 1);
        cbxnhao.setSelectedIndex(hoNgheo.getIdNhaO() - 1);
        cbxnuoc.setSelectedIndex(hoNgheo.getIdNuoc() - 1);
        cbxnguyennhan.setSelectedIndex(hoNgheo.getIdNguyenNhan() - 1);
        txtnamngheo.setText("" + HeThong.namNgheo);
        cbDaCapThe.setSelected(hoNgheo.isTrangThai());

        listkn.clear();
        listkn.addAll(hoNgheo.getListKN());
        xemDanhSachKN();
    }

    public void xemDanhSachKN() {
        Vector cols = new Vector();
        cols.addElement("Họ Tên");
        cols.addElement("Giới Tính");
        cols.addElement("Năm Sinh");
        cols.addElement("QH Với Chủ Hộ");
        cols.addElement("Đối tượng");
        cols.addElement("Nghề Nghiệp");

        Vector data = new Vector();
        for (KhauNgheo i : listkn) {
            Vector user = new Vector();
            user.addElement(i.getHoTen());
            user.addElement(i.isGioiTinh() ? "Nam" : "Nữ");
            user.addElement("" + i.getNamSinh());

            //-1 vi danh muc bat dau tu 0
            user.addElement(HeThong.dmQuanHe.get(i.getIdQuanHeCH() - 1).ten);
            user.addElement(HeThong.dmDoiTuong.get(i.getIdDoiTuong() - 1).ten);
            user.addElement(HeThong.dmNgheNghiep.get(i.getIdNgheNghiep() - 1).ten);

            data.add(user);
        }

       
        tbdanhsachkn.setModel(new MyTableModel(data, cols));
    }

    /**
     * is.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormThemHN(userInfo, father).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btchinhsua;
    private javax.swing.JButton btthemhn;
    private javax.swing.JButton btthemkn;
    private javax.swing.JCheckBox cbDaCapThe;
    private javax.swing.JComboBox cbxdantocch;
    private javax.swing.JComboBox cbxdantockn;
    private javax.swing.JComboBox cbxdoituong;
    private javax.swing.JComboBox cbxgioitinh;
    private javax.swing.JComboBox cbxkhuvuc;
    private javax.swing.JComboBox cbxnghenghiep;
    private javax.swing.JComboBox cbxnguyennhan;
    private javax.swing.JComboBox cbxnhao;
    private javax.swing.JComboBox cbxnuoc;
    private javax.swing.JComboBox cbxphanloai;
    private javax.swing.JComboBox cbxquanhe;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbdanhsachkn;
    private javax.swing.JTextField txthotench;
    private javax.swing.JTextField txthotenkn;
    private javax.swing.JTextField txthuyen;
    private javax.swing.JTextField txtmahn;
    private javax.swing.JTextField txtnamngheo;
    private javax.swing.JTextField txtnamsinhkn;
    private javax.swing.JTextField txtthunhap;
    private javax.swing.JTextField txtxa;
    private javax.swing.JTextField txtxom;
    // End of variables declaration//GEN-END:variables
}

class MyTableModel extends DefaultTableModel {
    @Override
    public boolean isCellEditable(int row, int column){  
          return false;  
      }
    public MyTableModel(Vector data, Vector cols) {
        super(data,cols);
    }
}