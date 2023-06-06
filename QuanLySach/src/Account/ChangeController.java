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
public class ChangeController {

      ChangeView frameChange;
      LoginModel modelChange;

      public ChangeController(ChangeView frameChange, LoginModel modelChange) {
            this.frameChange = frameChange;
            this.modelChange = modelChange;
            init();
            frameChange.setVisible(true);
            frameChange.setLocationRelativeTo(null);

      }

      public void init() {
            frameChange.getBtnHome().addActionListener(home());
            frameChange.getBtnDoiMk().addActionListener(doiMatKhau());
      }

      private ActionListener home() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        frameChange.setVisible(false);
                        LoginModel model = new LoginModel();
                        LoginView view = new LoginView();
                        LoginController controller = new LoginController(model, view);
                  }
            };
      }

      private ActionListener doiMatKhau() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        String user = frameChange.getTxtUs().getText();
                        String oldPass = String.valueOf(frameChange.getjPass1().getPassword());
                        String newPass = String.valueOf(frameChange.getjPass2().getPassword());
                        if (user.equals("") || oldPass.equals("") || newPass.equals("")) {
                              JOptionPane.showMessageDialog(frameChange, "Thông TIn không Được Để Trống");
                        } else if (modelChange.doiMatKhau(user, oldPass, newPass) == true) {
                              try {
                                    frameChange.getTxtUs().setText("");
                                    frameChange.getjPass1().setText("");
                                    frameChange.getjPass2().setText("");

                                    JOptionPane.showMessageDialog(frameChange, "Đổi Thông Tin Thành Công");
                              } catch (Exception ex) {
                                    JOptionPane.showMessageDialog(frameChange, ex.toString());
                              }
                        } else {
                              JOptionPane.showMessageDialog(frameChange, "Đổi Thông Tin Không Thành Công");
                        }

                  }
            };
      }

      public ChangeController() {
      }

      public ChangeView getFrameChange() {
            return frameChange;
      }

      public void setFrameChange(ChangeView frameChange) {
            this.frameChange = frameChange;
      }

      public LoginModel getModelChange() {
            return modelChange;
      }

      public void setModelChange(LoginModel modelChange) {
            this.modelChange = modelChange;
      }
}
