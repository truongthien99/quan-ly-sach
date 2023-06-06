/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

import Account.Menu.MenuController;
import Account.Menu.MenuView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class LoginController {

      LoginModel modelLogin;
      LoginView frameLogin;

      public LoginModel getModelAccout() {
            return modelLogin;
      }

      public void setModelAccout(LoginModel modelAccout) {
            this.modelLogin = modelAccout;
      }

      public LoginView getFrameAccout() {
            return frameLogin;
      }

      public void setFrameAccout(LoginView frameAccout) {
            this.frameLogin = frameAccout;
      }

      public LoginController() {
      }

      public LoginController(LoginModel modelAccout, LoginView frameAccout) {
            this.modelLogin = modelAccout;
            this.frameLogin = frameAccout;
            frameAccout.setLocationRelativeTo(null);
            init();

            frameAccout.setVisible(true);

      }

      public void init() {
            frameLogin.getBtnDN().addActionListener(dangNhap());
            frameLogin.getBtnDK().addActionListener(dangKy());
            frameLogin.getBtnDoiMK().addActionListener(doiMatKhau());

      }

      private ActionListener dangNhap() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        Account ac = new Account();
                        ac.setUserName(frameLogin.getTxtUser().getText());
                        ac.setPassword(String.valueOf(frameLogin.getTxtPass().getPassword()));
                        if (frameLogin.getTxtUser().getText().equals("") || String.valueOf(frameLogin.getTxtPass().getPassword()).equals("")) {
                              JOptionPane.showMessageDialog(frameLogin, "Vui lòng nhập tên tài khoản và mật khẩu");
                        } else if (modelLogin.dangNhap(ac) == false) {
                              JOptionPane.showMessageDialog(frameLogin, "sai tên đăng nhập hoặc mật khẩu");
                        } else {
                              JOptionPane.showMessageDialog(frameLogin, "đăng nhập thành công");
                              try {
                                    frameLogin.setVisible(false);
                                    MenuView view = new MenuView();
                                    MenuController control = new MenuController(view);
                              } catch (Exception ex) {
                                    JOptionPane.showMessageDialog(frameLogin, ex.toString());
                              }
                        }

                  }
            };
      }

      private ActionListener dangKy() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        frameLogin.setVisible(false);
                        LoginModel model = new LoginModel();
                        RegisterView view = new RegisterView();
                        RegisterController controll = new RegisterController(model, view);
                  }
            };
      }

      private ActionListener doiMatKhau() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        frameLogin.setVisible(false);
                        LoginModel model = new LoginModel();
                        ChangeView view = new ChangeView();
                        ChangeController control = new ChangeController(view, model);
                  }
            };
      }

      public static void main(String[] args) {
            LoginModel model = new LoginModel();
            LoginView view = new LoginView();
            LoginController controller = new LoginController(model, view);
      }
}
