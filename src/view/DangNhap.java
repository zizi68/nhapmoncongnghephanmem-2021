/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import hash.MD5;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ketnoi.KetNoiSQL;
import model.QuyDinh;
import table.DocGhiFile;

/**
 *
 * @author COMPUTER
 */
public class DangNhap extends javax.swing.JFrame {

    private static String maNguoiDung;
    private QuyDinh qd = QuyDinh.layThongTinQuyDinh();

    public static String getMaNguoiDung() {
        return maNguoiDung;
    }

    /**
     * Creates new form NewJFrame
     */
    public DangNhap() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog_QuyDinh = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_QuyDinh = new javax.swing.JTextArea();
        jButton_TroVe = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton_XuatFilePDF = new javax.swing.JButton();
        jPanelBackground = new javax.swing.JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon img = new ImageIcon("images\\pexels-janko-ferlic-590493.jpg");
                g.drawImage(img.getImage(), 0, 0, jPanelBackground);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldMaNguoiDung = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMatKhau = new javax.swing.JPasswordField();
        jButton_DangNhap = new javax.swing.JButton();
        jButton_Thoat = new javax.swing.JButton();
        jLabelForgotPassword = new javax.swing.JLabel();
        jLabel_ThongTinQuyDinh = new javax.swing.JLabel();

        jDialog_QuyDinh.setTitle("Quy định");

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jTextArea_QuyDinh.setEditable(false);
        jTextArea_QuyDinh.setColumns(20);
        jTextArea_QuyDinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea_QuyDinh.setLineWrap(true);
        jTextArea_QuyDinh.setRows(5);
        jTextArea_QuyDinh.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea_QuyDinh);

        jButton_TroVe.setBackground(new java.awt.Color(153, 255, 153));
        jButton_TroVe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_TroVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/return.png"))); // NOI18N
        jButton_TroVe.setText("Trở về");
        jButton_TroVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TroVeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 0));
        jLabel11.setText("QUY ĐỊNH THƯ VIỆN");

        jButton_XuatFilePDF.setBackground(new java.awt.Color(153, 255, 153));
        jButton_XuatFilePDF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_XuatFilePDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pdf.png"))); // NOI18N
        jButton_XuatFilePDF.setText("Xuất file PDF");
        jButton_XuatFilePDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XuatFilePDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_XuatFilePDF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jButton_TroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_TroVe, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_XuatFilePDF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog_QuyDinhLayout = new javax.swing.GroupLayout(jDialog_QuyDinh.getContentPane());
        jDialog_QuyDinh.getContentPane().setLayout(jDialog_QuyDinhLayout);
        jDialog_QuyDinhLayout.setHorizontalGroup(
            jDialog_QuyDinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog_QuyDinhLayout.setVerticalGroup(
            jDialog_QuyDinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chương trình quản lý thư viện");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book.png"))); // NOI18N
        jLabel1.setText("Thư viện sách");
        jLabel1.setIconTextGap(10);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 255, 51));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setText("Mật khẩu");

        jLabel3.setBackground(new java.awt.Color(0, 255, 51));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 0));
        jLabel3.setText("Mã người dùng");

        jTextFieldMaNguoiDung.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(0, 255, 51));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 0));
        jLabel4.setText("Đăng nhập");

        jTextFieldMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jButton_DangNhap.setBackground(new java.awt.Color(0, 153, 0));
        jButton_DangNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_DangNhap.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DangNhap.setText("Đăng nhập");
        jButton_DangNhap.setBorder(null);
        jButton_DangNhap.setPreferredSize(new java.awt.Dimension(40, 16));
        //jButton1.setContentAreaFilled(false);
        jButton_DangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DangNhapActionPerformed(evt);
            }
        });

        jButton_Thoat.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Thoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Thoat.setForeground(new java.awt.Color(0, 204, 51));
        jButton_Thoat.setText("Thoát");
        jButton_Thoat.setBorder(null);
        jButton_Thoat.setPreferredSize(new java.awt.Dimension(40, 16));
        //jButton2.setContentAreaFilled(false);
        jButton_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThoatActionPerformed(evt);
            }
        });

        jLabelForgotPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelForgotPassword.setForeground(new java.awt.Color(153, 255, 153));
        jLabelForgotPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelForgotPassword.setText("Quên mật khẩu?");
        jLabelForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelForgotPasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelForgotPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelForgotPasswordMouseExited(evt);
            }
        });

        jPanel1.setBackground(new Color(0, 0, 0, 70));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 169, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(148, 148, 148))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(jTextFieldMaNguoiDung))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldMaNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelForgotPassword)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel_ThongTinQuyDinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/information.png"))); // NOI18N
        jLabel_ThongTinQuyDinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ThongTinQuyDinhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap(349, Short.MAX_VALUE)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel_ThongTinQuyDinh)
                        .addContainerGap())))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_ThongTinQuyDinh)
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String showQuyDinh() {
        String str = "";
        str = str + "\n- Độc giả truy cập vào phần mềm để tra cứu sách bằng tài khoản đã được cung cấp và có thể thay đổi mật khẩu sau khi đăng nhập."
                + "\n- Độc giả chọn tài liệu theo nhu cầu cá nhân, mỗi đầu sách chỉ được mượn 1 quyển."
                + "\n   Số sách được mượn không quá " + qd.getSoSachMuonToiDa() + " quyển. Độc giả được mượn sách tối đa " + qd.getSoNgayMuonToiDa() + " ngày tính từ ngày mượn sách."
                + "\n- Độc giả có trách nhiệm trả tài liệu đúng hạn cho thư viện, thanh toán các khoản phạt, bồi thường (nếu có)."
                + "\n   Độc giả có trách nhiệm bảo quản tài liệu của Thư viện, các trường hợp làm mất, gây hư hỏng,... phải bồi thường theo quy định của Thư viện."
                + "\n   Độc giả mượn sách đến hạn trả sách mà chưa trả sẽ bị phạt " + qd.getTienPhatQuaHan() + "/ngày trễ."
                + "\n   Làm hỏng hoặc mất sách sẽ bị phạt " + qd.getTienPhatHongMat() * 100 + "% giá trên bìa sách."
                + "\n- Độc giả phải trả sách mượn quá hạn mới được tiếp tục mượn sách."
                + "\n\n\n\n\t\t\t\t\t\t" + qd.getNgayThayDoi();
        return str;
    }

    private void jButton_DangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DangNhapActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM NGUOIDUNG WHERE MANGUOIDUNG = ? AND MATKHAU = ?";
        maNguoiDung = jTextFieldMaNguoiDung.getText();
        String matKhau = String.valueOf(jTextFieldMatKhau.getPassword());
        try (
                Connection con = KetNoiSQL.layKetNoi();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, maNguoiDung);
            ps.setString(2, MD5.encrypt(matKhau));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dispose();
                String maVaiTro = rs.getString(11);
                if (maVaiTro.equalsIgnoreCase("VT01")) {
                    new TrangChuDocGia().setVisible(true);
                } else if (maVaiTro.equalsIgnoreCase("VT02")) {
                    new TrangChuThuThu().setVisible(true);
                } else if (maVaiTro.equalsIgnoreCase("VT03")) {
                    new TrangChuThuKho().setVisible(true);
                } else if (maVaiTro.equalsIgnoreCase("VT04")) {
                    new TrangChuAdmin().setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Mã người dùng hoặc mật khẩu không chính xác! Vui lòng thử lại.");
            }
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton_DangNhapActionPerformed

    private void jButton_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton_ThoatActionPerformed

    private void jLabelForgotPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelForgotPasswordMouseEntered
        // TODO add your handling code here:
        jPanel1.setOpaque(false);
        jLabelForgotPassword.setForeground(Color.GREEN);
    }//GEN-LAST:event_jLabelForgotPasswordMouseEntered

    private void jLabelForgotPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelForgotPasswordMouseExited
        // TODO add your handling code here:
        jPanel1.setOpaque(true);
        jLabelForgotPassword.setForeground(new Color(153, 255, 153));
    }//GEN-LAST:event_jLabelForgotPasswordMouseExited

    private void jLabelForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelForgotPasswordMouseClicked
        // TODO add your handling code here:
        jPanel1.setOpaque(true);
        jLabelForgotPassword.setForeground(new Color(153, 255, 153));
        JOptionPane.showMessageDialog(this, "Vui lòng liên hệ thủ thư thư viện và cung cấp mã độc giả để reset mật khẩu!", "Quên mật khẩu", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabelForgotPasswordMouseClicked

    private void jLabel_ThongTinQuyDinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ThongTinQuyDinhMouseClicked
        // TODO add your handling code here:
        jDialog_QuyDinh.pack();
        jDialog_QuyDinh.setLocationRelativeTo(this);
        jDialog_QuyDinh.setVisible(true);
        jTextArea_QuyDinh.setText(showQuyDinh());

    }//GEN-LAST:event_jLabel_ThongTinQuyDinhMouseClicked

    private void jButton_TroVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TroVeActionPerformed
        // TODO add your handling code here:
        jDialog_QuyDinh.dispose();
    }//GEN-LAST:event_jButton_TroVeActionPerformed

    private void jButton_XuatFilePDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XuatFilePDFActionPerformed
        // TODO add your handling code here:
        String paragraph = "                    " + jLabel11.getText()
                + "\n     " + jTextArea_QuyDinh.getText();
        DocGhiFile.xuatFilePDF("QuyDinh.pdf", paragraph);
        JOptionPane.showMessageDialog(jDialog_QuyDinh, "Xuất file PDF thành công!");
    }//GEN-LAST:event_jButton_XuatFilePDFActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DangNhap;
    private javax.swing.JButton jButton_Thoat;
    private javax.swing.JButton jButton_TroVe;
    private javax.swing.JButton jButton_XuatFilePDF;
    private javax.swing.JDialog jDialog_QuyDinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelForgotPassword;
    private javax.swing.JLabel jLabel_ThongTinQuyDinh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_QuyDinh;
    private javax.swing.JTextField jTextFieldMaNguoiDung;
    private javax.swing.JPasswordField jTextFieldMatKhau;
    // End of variables declaration//GEN-END:variables
}
