/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Account;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author Admin
 */
public class ChangeView extends javax.swing.JFrame {

      /**
       * Creates new form RegisterView
       */
      public ChangeView() {
            initComponents();
      }

      /**
       * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
       */
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            txtUs = new javax.swing.JTextField();
            jPass1 = new javax.swing.JPasswordField();
            jPass2 = new javax.swing.JPasswordField();
            btnHome = new javax.swing.JButton();
            btnDoiMk = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Cập Nhật Tài Khoản");

            jLabel1.setText("Tên Tài Khoản :");

            jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(153, 153, 255));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("Change Password");
            jLabel2.setToolTipText("");
            jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jLabel2.setFocusCycleRoot(true);

            jLabel3.setText("Mật Khẩu :");

            jLabel4.setText("Mật Khẩu Mới : ");

            btnHome.setText("Home");

            btnDoiMk.setText("Đổi Mật Khẩu");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                      .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(txtUs)
                                                      .addComponent(jPass1)
                                                      .addComponent(jPass2)))
                                          .addGroup(layout.createSequentialGroup()
                                                .addGap(128, 128, 128)
                                                .addComponent(btnDoiMk)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)))))
                        .addContainerGap())
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(txtUs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jPass2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(btnDoiMk, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(43, Short.MAX_VALUE))
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

      /**
       * @param args the command line arguments
       */
//      public static void main(String args[]) {
//            /* Set the Nimbus look and feel */
//            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//             */
//            try {
//                  for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                        if ("Nimbus".equals(info.getName())) {
//                              javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                              break;
//                        }
//                  }
//            } catch (ClassNotFoundException ex) {
//                  java.util.logging.Logger.getLogger(ChangeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            } catch (InstantiationException ex) {
//                  java.util.logging.Logger.getLogger(ChangeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            } catch (IllegalAccessException ex) {
//                  java.util.logging.Logger.getLogger(ChangeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//                  java.util.logging.Logger.getLogger(ChangeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            }
//            //</editor-fold>
//            //</editor-fold>
//
//            /* Create and display the form */
//            java.awt.EventQueue.invokeLater(new Runnable() {
//                  public void run() {
//                        new ChangeView().setVisible(true);
//                  }
//            });
//      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton btnDoiMk;
      private javax.swing.JButton btnHome;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JPasswordField jPass1;
      private javax.swing.JPasswordField jPass2;
      private javax.swing.JTextField txtUs;
      // End of variables declaration//GEN-END:variables

     
      
      
      public JPasswordField getjPass1() {
            return jPass1;
      }

      public JPasswordField getjPass2() {
            return jPass2;
      }

      public JTextField getTxtUs() {
            return txtUs;
      }

      public javax.swing.JButton getBtnDoiMk() {
            return btnDoiMk;
      }

      public void setBtnDoiMk(javax.swing.JButton btnDoiMk) {
            this.btnDoiMk = btnDoiMk;
      }

      public javax.swing.JButton getBtnHome() {
            return btnHome;
      }

      public void setBtnHome(javax.swing.JButton btnHome) {
            this.btnHome = btnHome;
      }
}
