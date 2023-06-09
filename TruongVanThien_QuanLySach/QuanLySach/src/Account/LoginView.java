/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Account;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class LoginView extends javax.swing.JFrame {

      /**
       * Creates new form SingUpView
       */
      public LoginView() {
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
            txtUser = new javax.swing.JTextField();
            jLabel4 = new javax.swing.JLabel();
            btnDK = new javax.swing.JButton();
            btnDN = new javax.swing.JButton();
            btnDoiMK = new javax.swing.JButton();
            txtPass = new javax.swing.JPasswordField();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Đăng Nhập");
            setName("SingUpView"); // NOI18N
            setSize(new java.awt.Dimension(400, 400));

            jLabel1.setText("User Name : ");

            jLabel2.setText("PassWord : ");

            jLabel4.setBackground(new java.awt.Color(153, 204, 255));
            jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText("Login");
            jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            btnDK.setText("Đăng Ký");

            btnDN.setText("Đăng Nhập");

            btnDoiMK.setText("Đổi Mật Khẩu");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                          .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                          .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                          .addComponent(txtPass)))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(btnDN)
                                    .addGap(47, 47, 47)
                                    .addComponent(btnDK)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                    .addComponent(btnDoiMK)
                                    .addGap(11, 11, 11)))
                        .addContainerGap())
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(txtPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(btnDN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(btnDK, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(btnDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(67, Short.MAX_VALUE))
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

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
                  java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

//            /* Create and display the form */
//            java.awt.EventQueue.invokeLater(new Runnable() {
//                  public void run() {
//                        new SingUpView().setVisible(true);
//                  }
//            });
            //</editor-fold>

//            /* Create and display the form */
//            java.awt.EventQueue.invokeLater(new Runnable() {
//                  public void run() {
//                        new SingUpView().setVisible(true);
//                  }
//            });
            //</editor-fold>

//            /* Create and display the form */
//            java.awt.EventQueue.invokeLater(new Runnable() {
//                  public void run() {
//                        new SingUpView().setVisible(true);
//                  }
//            });
            //</editor-fold>

//            /* Create and display the form */
//            java.awt.EventQueue.invokeLater(new Runnable() {
//                  public void run() {
//                        new SingUpView().setVisible(true);
//                  }
//            });
            //</editor-fold>

//            /* Create and display the form */
//            java.awt.EventQueue.invokeLater(new Runnable() {
//                  public void run() {
//                        new SingUpView().setVisible(true);
//                  }
//            });
            //</editor-fold>

//            /* Create and display the form */
//            java.awt.EventQueue.invokeLater(new Runnable() {
//                  public void run() {
//                        new SingUpView().setVisible(true);
//                  }
//            });
            //</editor-fold>

//            /* Create and display the form */
//            java.awt.EventQueue.invokeLater(new Runnable() {
//                  public void run() {
//                        new SingUpView().setVisible(true);
//                  }
//            });
            //</editor-fold>

//            /* Create and display the form */
//            java.awt.EventQueue.invokeLater(new Runnable() {
//                  public void run() {
//                        new SingUpView().setVisible(true);
//                  }
//            });
      }

      public JButton getBtnDK() {
            return btnDK;
      }

      public void setBtnDK(JButton btnDK) {
            this.btnDK = btnDK;
      }

      public JButton getBtnDN() {
            return btnDN;
      }

      public void setBtnDN(JButton btnDN) {
            this.btnDN = btnDN;
      }

      public JButton getBtnDoiMK() {
            return btnDoiMK;
      }

      public void setBtnDoiMK(JButton btnDoiMK) {
            this.btnDoiMK = btnDoiMK;
      }

      public JPasswordField getTxtPass() {
            return txtPass;
      }

      public void setTxtPass(JPasswordField txtPass) {
            this.txtPass = txtPass;
      }


    

      public JTextField getTxtUser() {
            return txtUser;
      }

      public void setTxtUser(JTextField txtUser) {
            this.txtUser = txtUser;
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton btnDK;
      private javax.swing.JButton btnDN;
      private javax.swing.JButton btnDoiMK;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JPasswordField txtPass;
      private javax.swing.JTextField txtUser;
      // End of variables declaration//GEN-END:variables
}
