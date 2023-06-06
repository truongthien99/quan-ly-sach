/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class RegisterController {

      LoginModel modelLogin;
      RegisterView frameRegister;

      public RegisterController() {
      }

      public RegisterController(LoginModel modelLogin, RegisterView frameRegister) {
            this.modelLogin = modelLogin;
            this.frameRegister = frameRegister;
            frameRegister.setVisible(true);
            frameRegister.setLocationRelativeTo(null);
            init();

      }

      public void init() {
            frameRegister.getBtnDK().addActionListener(DangKyListener());
            frameRegister.getBtnHome().addActionListener(HomeListenner());
      }

      private ActionListener DangKyListener() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        Account ac = new Account();
                        String user = frameRegister.getTxtUs().getText();
                        String Pass1 = String.valueOf(frameRegister.getTxtPass1().getPassword());
                        String Pass2 = String.valueOf(frameRegister.getTxtPass2().getPassword());
                        ac.setUserName(user);
                        ac.setPassword(Pass1);
                        if (Pass1.equals(Pass2) == false) {
                              JOptionPane.showMessageDialog(frameRegister, "Nhập Mật Nhập lại không trùng nhau vui lòng nhập lại!!!");
                              frameRegister.getTxtPass2().setText("");
                              frameRegister.getTxtPass1().setText("");
                        }else if(user.equals("")|| Pass1.equals("")||Pass2.equals("")){
                              JOptionPane.showConfirmDialog(frameRegister, "Nhập thông tin đăng ký!!!");
                        }
                        else if (modelLogin.dangKy(ac) == false) {
                              JOptionPane.showMessageDialog(frameRegister, "tên Tài khoản đã được tạo vui lòng nhập tên tài khoản khác!!!");

                        } else {
                              JOptionPane.showMessageDialog(frameRegister, "đăng Ký thành công");
                              try {
                                    frameRegister.setVisible(false);
                                    LoginModel model = new LoginModel();
                                    LoginView view = new LoginView();
                                    LoginController controller = new LoginController(model, view);
                              } catch (Exception ex) {
                                    JOptionPane.showConfirmDialog(frameRegister, ex.toString());
                              }
                        }
                  }
            };
      }

      private ActionListener HomeListenner() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        frameRegister.setVisible(false);
                        LoginModel model = new LoginModel();
                        LoginView view = new LoginView();
                        LoginController controller = new LoginController(model, view);
                  }
            };
      }

      public LoginModel getModelLogin() {
            return modelLogin;
      }

      public void setModelLogin(LoginModel modelLogin) {
            this.modelLogin = modelLogin;
      }

      public RegisterView getFrameRegister() {
            return frameRegister;
      }

      public void setFrameRegister(RegisterView frameRegister) {
            this.frameRegister = frameRegister;
      }

//      public static void main(String[] args) {
//            LoginModel model = new LoginModel();
//            RegisterView view = new RegisterView();
//            RegisterController controll = new RegisterController(model, view);
//      }
}
