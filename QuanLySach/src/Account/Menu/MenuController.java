/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account.Menu;

import Account.LoginController;
import Account.LoginView;
import Account.LoginModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import quanlysach.LoaiController;
import quanlysach.LoaiSachView;
import quanlysach.QLLoaiSachModel;
import quanlysach.QLSachModel;
import quanlysach.SachController;
import quanlysach.SachView;

/**
 *
 * @author Admin
 */
public class MenuController {

      MenuView view;

      public MenuController(MenuView view) {
            this.view = view;
            init();
            view.setLocationRelativeTo(null);
            view.setVisible(true);
      }

      public MenuController() {

      }

      public void init() {
            view.getBtnSach().addActionListener(sachListener());
            view.getBtnLoaiSach().addActionListener(loaiListener());
            view.getBtnLog().addActionListener(logoutListener());
      }

      //Chuyển đến chức năng qaurn lý sách
      private ActionListener sachListener() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        view.setVisible(false);
                        SachView frameSach = new SachView();
                        QLSachModel model = new QLSachModel();
                        SachController controller = new SachController(frameSach, model);
                  }
            };
      }

      //chuyển đến chức năng quản lý loại
      private ActionListener loaiListener() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        view.setVisible(false);
                        LoaiSachView frameLoai = new LoaiSachView();
                        QLLoaiSachModel model = new QLLoaiSachModel();
                        LoaiController controller = new LoaiController(frameLoai, model);
                  }
            };
      }

      //đăng xuất 
      private ActionListener logoutListener() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        JOptionPane.showConfirmDialog(view, "Đăng Xuất???");
                        view.setVisible(false);
                        LoginView frameAcc = new LoginView();
                        LoginModel model = new LoginModel();
                        LoginController controller = new LoginController(model, frameAcc);
                  }
            };
      }

      public MenuView getView() {
            return view;
      }

      public void setView(MenuView view) {
            this.view = view;
      }

//      public static void main(String[] args) {
//            MenuView view = new MenuView();
//            MenuController controller = new MenuController(view);
//      }
}
