/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author COMPUTER
 */
public class UserHomeForm extends javax.swing.JFrame {

    /**
     * Creates new form AdminHoneForm
     */
    public UserHomeForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel32 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon img = new ImageIcon("\\src\\images\\pexels-pixabay-460621.jpg");
                g.drawImage(img.getImage(), 0, 0, this);
            }
        };
        jPanel6 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel32.setBackground(new java.awt.Color(255, 255, 204));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/settings.png"))); // NOI18N

        jPanel28.setBackground(new java.awt.Color(255, 255, 204));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Độc giả", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cv.png"))); // NOI18N
        jButton15.setText("Thay đổi thông tin cá nhân");
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setPreferredSize(new java.awt.Dimension(135, 97));
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book (1).png"))); // NOI18N
        jButton16.setText("Mượn/trả sách");
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setPreferredSize(new java.awt.Dimension(157, 97));
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password.png"))); // NOI18N
        jButton17.setText("Đổi mật khẩu");
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setPreferredSize(new java.awt.Dimension(231, 97));
        jButton17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout (1).png"))); // NOI18N
        jButton18.setText("Đăng xuất");
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton18.setIconTextGap(10);
        jButton18.setPreferredSize(new java.awt.Dimension(115, 97));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel.png"))); // NOI18N
        jButton19.setText("Thoát");
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton19.setIconTextGap(10);
        jButton19.setPreferredSize(new java.awt.Dimension(97, 97));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/help.png"))); // NOI18N
        jButton20.setText("Báo lỗi/Trợ giúp");
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/notification.png"))); // NOI18N
        jButton21.setText("Thông báo");
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel31.setBackground(new java.awt.Color(255, 255, 204));
        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Thống kê", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 102, 0));
        jPanel6.setLayout(null);

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/customer.png"))); // NOI18N
        jPanel6.add(jLabel57);
        jLabel57.setBounds(10, 60, 70, 70);

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel58.setText("Số người đăng ký");
        jPanel6.add(jLabel58);
        jLabel58.setBounds(50, 10, 170, 30);

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel59.setText("100");
        jPanel6.add(jLabel59);
        jLabel59.setBounds(150, 70, 100, 50);

        jPanel29.setBackground(new java.awt.Color(102, 255, 51));
        jPanel29.setLayout(null);

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/books.png"))); // NOI18N
        jPanel29.add(jLabel60);
        jLabel60.setBounds(10, 60, 70, 70);

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel61.setText("Số lượng sách");
        jPanel29.add(jLabel61);
        jLabel61.setBounds(60, 10, 140, 30);

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel62.setText("100");
        jPanel29.add(jLabel62);
        jLabel62.setBounds(150, 70, 100, 50);

        jPanel30.setBackground(new java.awt.Color(0, 255, 204));
        jPanel30.setLayout(null);

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/borrow-book.png"))); // NOI18N
        jPanel30.add(jLabel63);
        jLabel63.setBounds(10, 60, 70, 70);

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel64.setText("Số sách được mượn");
        jPanel30.add(jLabel64);
        jLabel64.setBounds(40, 10, 190, 30);

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel65.setText("100");
        jPanel30.add(jLabel65);
        jLabel65.setBounds(150, 70, 100, 50);

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book.png"))); // NOI18N
        jLabel1.setText("Thư viện sách");
        jLabel1.setIconTextGap(10);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(578, 578, 578)
                        .addComponent(jLabel11))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserHomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
