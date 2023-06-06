/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysach;

import Account.LoginController;
import Account.LoginView;
import Account.Menu.MenuController;
import Account.Menu.MenuView;
import Account.LoginModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class LoaiController {

      LoaiSachView view;
      QLLoaiSachModel model;

      public LoaiController(LoaiSachView view, QLLoaiSachModel model) {
            this.view = view;
            this.model = model;
            init();
            view.setLocationRelativeTo(null);
            view.setVisible(true);
      }

      public void init() {
            showTableLoai(model.getAllLoai());
            view.getBtnDelete().setEnabled(false);
            view.getBtnEdit().setEnabled(false);
            view.getBtnNew().setEnabled(true);
            view.getTblLoai().addMouseListener(tableListenenr());
            view.getBtnAdd().addActionListener(themListener());
            view.getBtnDelete().addActionListener(xoaListener());
            view.getBtnEdit().addActionListener(editListener());
            view.getBtnNew().addActionListener(newListener());
            view.getBtnSearch().addActionListener(searchListener());
            view.getCbxSapXep().addItemListener(sapXep());
            view.getBtnLogout().addActionListener(logoutListener());
            view.getBtnExit().addActionListener(exitListener());
      }

      //hiện bảng thông tin loại sach
      public void showTableLoai(ArrayList<LoaiSach> dsLoai) {
            DefaultTableModel tableModel = (DefaultTableModel) view.getTblLoai().getModel();
            tableModel.setRowCount(0);

            for (LoaiSach loai : dsLoai) {
                  tableModel.addRow(new Object[]{loai.getMaLoai(),
                        loai.getTenLoai()});
            }
            view.getTblLoai().setModel(tableModel);
      }

      public LoaiController() {
      }

      //sự kiện mouseclick
      public MouseAdapter tableListenenr() {
            return new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        int index = view.getTblLoai().getSelectedRow();
                        //lay gia tri cua tung cot moi dong
                        String maLoai = view.getTblLoai().getValueAt(index, 0).toString();
                        String tenLoai = view.getTblLoai().getValueAt(index, 1).toString();

                        //xuat gia tri ra bang txt
                        view.getTxtMaLoai().setText(maLoai);
                        view.getTxtTenLoai().setText(tenLoai);

                        //chuyển txtMaLoai qua chỉ đọc
                        view.getTxtMaLoai().setEnabled(false);
                        //tat them
                        view.getBtnAdd().setEnabled(false);
                        //bat xóa sửa mới
                        view.getBtnDelete().setEnabled(true);
                        view.getBtnEdit().setEnabled(true);
                        view.getBtnNew().setEnabled(true);

                  }
            };

      }

      private ActionListener themListener() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        LoaiSach loai = new LoaiSach();
                        loai.setMaLoai(view.getTxtMaLoai().getText());
                        loai.setTenLoai(view.getTxtTenLoai().getText());

                        if (model.addLoai(loai) == false) {
                              JOptionPane.showMessageDialog(view, "Mời nhập lại mã!!!");
                        } else if (view.getTxtMaLoai().getText().equals("") || view.getTxtTenLoai().getText().equals("")) {
                              JOptionPane.showMessageDialog(view, "Thông tin Không được để trống");
                        } else {
                              try {
                                    
                                    JOptionPane.showMessageDialog(view, "Thêm thông tin thành công");
                              } catch (Exception ex) {
                              }
                        }
                        showTableLoai(model.getAllLoai());
                  }
            };
      }

      //Xóa 1 cuốn sách
      private ActionListener xoaListener() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        String maLoai = view.getTxtMaLoai().getText();
                        if (!(maLoai.equals(""))) {
                              int confirm = JOptionPane.showConfirmDialog(view,
                                      "Bạn có muốn xóa Môn Học có mã '" + maLoai + "' ?");
                              if (confirm == 0) {
                                    try {
                                          JOptionPane.showMessageDialog(view, "Xóa Thành công loại Có mã :" + maLoai);
                                          model.xoaLoai(maLoai);
                                    } catch (Exception ex) {
                                          JOptionPane.showMessageDialog(view, ex.toString());
                                    }
                              }
                        }
                        showTableLoai(model.getAllLoai());
                        view.getTxtMaLoai().setText("");
                        view.getTxtTenLoai().setText("");
                        view.getTxtMaLoai().setEnabled(true);
                        view.getBtnDelete().setEnabled(false);
                        view.getBtnEdit().setEnabled(false);

                  }
            };
      }

      //sửa thông tin sách theo mã
      private ActionListener editListener() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        LoaiSach loai = new LoaiSach();
                        loai.setMaLoai(view.getTxtMaLoai().getText());
                        loai.setTenLoai(view.getTxtTenLoai().getText());
                        if (model.suaLoai(loai) == false) {
                              JOptionPane.showMessageDialog(view, "Sửa không thành công");
                        } else {
                              try {
                                    JOptionPane.showMessageDialog(view, "Cập nhật thông tin sách thành công");
                                    showTableLoai(model.getAllLoai());
                              } catch (Exception ex) {
                                    JOptionPane.showMessageDialog(view, ex.toString());
                              }
                        }

                  }
            };
      }

      //làm mới JFrame hiển thị
      private ActionListener newListener() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        showTableLoai(model.getAllLoai());
                        view.getTxtMaLoai().setText("");
                        view.getTxtTenLoai().setText("");
                        view.getTxtSearch().setText("");
                        view.getTxtMaLoai().setEnabled(true);
                        view.getBtnAdd().setEnabled(true);
                        view.getBtnDelete().setEnabled(false);
                        view.getBtnEdit().setEnabled(false);

                  }
            };
      }

      //tìm kiếm 
      private ActionListener searchListener() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        String ma = view.getTxtSearch().getText();
                        ArrayList<LoaiSach> dsLoai = new ArrayList<>();
                        dsLoai = model.searchByName(ma);
                        if (ma == null) {
                              JOptionPane.showMessageDialog(view, "Nhập tên loại muốn tìm");
                        } else if (dsLoai.isEmpty()) {
                              JOptionPane.showMessageDialog(view, "Không tìm thấy loại ");
                        } else {
                              try {
                                    view.getBtnNew().setEnabled(true);
                                    showTableLoai(dsLoai);
                              } catch (Exception ex) {
                                    JOptionPane.showMessageDialog(view, ex.toString());
                              }
                        }
                  }
            };
      }

      //sắp xếp
      private ItemListener sapXep() {
            return new ItemListener() {
                  @Override
                  public void itemStateChanged(ItemEvent e) {
                        int sx = view.getCbxSapXep().getSelectedIndex();
                        switch (sx) {
                              case 1:
                                    showTableLoai(model.sortLoaiByCode());
                                    break;
                              case 2:
                                    showTableLoai(model.sortLoaiByCodeAndName());
                                    break;
                              default:
                                    showTableLoai(model.getAllLoai());
                                    break;
                        }
                  }
            };
      }

      public LoaiSachView getView() {
            return view;
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

      //thoat ra menu
      private ActionListener exitListener() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        JOptionPane.showConfirmDialog(view, "Thoát ra menu ???");
                        view.setVisible(false);
                        MenuView frameMenu = new MenuView();
                        MenuController control = new MenuController(frameMenu);
                  }
            };
      }

      public void setView(LoaiSachView view) {
            this.view = view;
      }

      public QLLoaiSachModel getModel() {
            return model;
      }

      public void setModel(QLLoaiSachModel model) {
            this.model = model;
      }

//      public static void main(String[] args) {
//            QLLoaiSachModel model = new QLLoaiSachModel();
//            LoaiSachView view = new LoaiSachView();
//            LoaiController controll = new LoaiController(view, model);
//      }
}
