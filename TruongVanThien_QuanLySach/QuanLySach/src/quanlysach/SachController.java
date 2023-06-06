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
public class SachController {

      SachView frameSach;
      QLSachModel modelSach;

      public SachController(SachView frameSach, QLSachModel modelSach) {
            this.frameSach = frameSach;
            this.modelSach = modelSach;
            init();
            frameSach.setLocationRelativeTo(null);
            frameSach.setVisible(true);
      }

      public void init() {
            showTableSach(modelSach.getAllSach());
            frameSach.getBtnDel().setEnabled(false);
            frameSach.getBtnEdit().setEnabled(false);
            frameSach.getTblSach().addMouseListener(tableListenenr());
            frameSach.getBtnAdd().addActionListener(themListener());
            frameSach.getBtnDel().addActionListener(xoaListener());
            frameSach.getBtnEdit().addActionListener(editListener());
            frameSach.getBtnNew().addActionListener(newListener());
            frameSach.getBtnSearch().addActionListener(searchListener());
            frameSach.getCbxSapXep().addItemListener(sapXepListener());
            frameSach.getBtnExit().addActionListener(exitListener());
            frameSach.getBtnLog().addActionListener(logoutListener());
      }

      //hiện bảng thông tin sach
      public void showTableSach(ArrayList<Sach> dsSach) {
            DefaultTableModel tableModel = (DefaultTableModel) frameSach.getTblSach().getModel();
            tableModel.setRowCount(0);

            for (Sach sach : dsSach) {
                  tableModel.addRow(new Object[]{sach.getMaSach(),
                        sach.getTenSach(), sach.getNhaXuatBan(), sach.getDonGia(), sach.getMaLoai()});
            }
            frameSach.getTblSach().setModel(tableModel);
      }

      //thêm 1 cuốn sách
      private ActionListener themListener() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        Sach sach = new Sach();
                        String maSach = frameSach.getTxtMaSach().getText();
                        String tenSach = frameSach.getTxtNameSach().getText();
                        String nhaXB = frameSach.getTxtNXB().getText();
                        double gia = Double.parseDouble(frameSach.getTxtGia().getText());
                        String maLoai = frameSach.getTxtMaLoai().getText();
                        sach.setMaSach(maSach);
                        sach.setTenSach(tenSach);
                        sach.setNhaXuatBan(nhaXB);
                        sach.setDonGia(gia);
                        sach.setMaLoai(maLoai);
                        if (modelSach.addSach(sach) == false) {
                              JOptionPane.showMessageDialog(frameSach, "Mã Sách không được trùng nhau!!!");
                        } else if (maSach.equals("") || tenSach.equals("") || nhaXB.equals("") || frameSach.getTxtGia().getText().equals("") || maLoai.equals("")) {
                              JOptionPane.showMessageDialog(frameSach, "Thông tin không được để trống!!!");
                        } else {
                              try {
                                    
                                    JOptionPane.showMessageDialog(frameSach, "Thêm thông tin thành công");
                              } catch (Exception ex) {
                                    JOptionPane.showMessageDialog(frameSach, ex.toString());
                              }
                        }
                        showTableSach(modelSach.getAllSach());
                  }
            };
      }

      //sự kiện mouseclick
      public MouseAdapter tableListenenr() {
            return new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        //chon dong
                        int index = frameSach.getTblSach().getSelectedRow();
                        //lay gia tri cua tung cot moi dong
                        String maSach = frameSach.getTblSach().getValueAt(index, 0).toString();
                        String tenSach = frameSach.getTblSach().getValueAt(index, 1).toString();
                        String nXB = frameSach.getTblSach().getValueAt(index, 2).toString();
                        String giaTien = frameSach.getTblSach().getValueAt(index, 3).toString();
                        String maLoai = frameSach.getTblSach().getValueAt(index, 4).toString();
                        //xuat gia tri ra bang txt
                        frameSach.getTxtMaSach().setText(maSach);
                        frameSach.getTxtNameSach().setText(tenSach);
                        frameSach.getTxtNXB().setText(nXB);
                        frameSach.getTxtGia().setText(giaTien);
                        frameSach.getTxtMaLoai().setText(maLoai);

                        //chuyển txtMaSach qua chỉ đọc
                        frameSach.getTxtMaSach().setEnabled(false);
                        //tat them
                        frameSach.getBtnAdd().setEnabled(false);
                        //bat xóa sửa mới
                        frameSach.getBtnDel().setEnabled(true);
                        frameSach.getBtnEdit().setEnabled(true);
                        frameSach.getBtnNew().setEnabled(true);

                  }
            };

      }

      //Xóa 1 cuốn sách
      private ActionListener xoaListener() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        String maSach = frameSach.getTxtMaSach().getText();
                        if (!(maSach.equals(""))) {
                              int confirm = JOptionPane.showConfirmDialog(frameSach,
                                      "Bạn có muốn xóa Môn Học có mã '" + maSach + "' ?");
                              if (confirm == 0) {
                                    try {
                                          modelSach.xoaSach(maSach);
                                          JOptionPane.showMessageDialog(frameSach, "Xóa Thành công!!");
                                    } catch (Exception ex) {
                                          JOptionPane.showMessageDialog(frameSach, ex.toString());
                                    }
                              }
                        }
                        showTableSach(modelSach.getAllSach());
                        frameSach.getTxtMaSach().setText("");
                        frameSach.getTxtNameSach().setText("");
                        frameSach.getTxtNXB().setText("");
                        frameSach.getTxtGia().setText("");
                        frameSach.getTxtMaLoai().setText("");
                        frameSach.getBtnDel().setEnabled(false);
                        frameSach.getBtnEdit().setEnabled(false);

                  }
            };
      }

      //sửa thông tin sách theo mã
      private ActionListener editListener() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        Sach sach = new Sach();
                        sach.setMaSach(frameSach.getTxtMaSach().getText());
                        sach.setTenSach(frameSach.getTxtNameSach().getText());
                        sach.setNhaXuatBan(frameSach.getTxtNXB().getText());
                        double gia = Double.parseDouble(frameSach.getTxtGia().getText());
                        sach.setDonGia(gia);
                        sach.setMaLoai(frameSach.getTxtMaLoai().getText());
                        if (modelSach.suaSach(sach) == false) {
                              JOptionPane.showMessageDialog(frameSach, "Sửa không thành công");
                        } else {
                              try {
                                    
                                    JOptionPane.showMessageDialog(frameSach, "Cập nhật thông tin sách thành công");
                                    showTableSach(modelSach.getAllSach());
                              } catch (Exception ex) {
                                    JOptionPane.showMessageDialog(frameSach, ex.toString());
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
                        showTableSach(modelSach.getAllSach());
                        frameSach.getTxtMaSach().setText("");
                        frameSach.getTxtNameSach().setText("");
                        frameSach.getTxtNXB().setText("");
                        frameSach.getTxtGia().setText("");
                        frameSach.getTxtMaLoai().setText("");
                        frameSach.getTxtSearch().setText("");
                        frameSach.getTxtMaSach().setEnabled(true);
                        frameSach.getBtnAdd().setEnabled(true);
                        frameSach.getBtnDel().setEnabled(false);
                        frameSach.getBtnEdit().setEnabled(false);
                  }
            };
      }

      //tìm kiếm 
      private ActionListener searchListener() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        String ma = frameSach.getTxtSearch().getText();
                        ArrayList<Sach> dsSach = new ArrayList<>();
                        dsSach = modelSach.searchByName(ma);
                        if (ma == null) {
                              JOptionPane.showMessageDialog(frameSach, "Nhập tên Sách muốn tìm");
                        } else if (dsSach == null) {
                              JOptionPane.showMessageDialog(frameSach, "Không tìm thấy sách ");
                        } else {
                              try {
                                    frameSach.getBtnNew().setEnabled(true);
                                    showTableSach(dsSach);
                              } catch (Exception ex) {
                                    JOptionPane.showMessageDialog(frameSach, ex.toString());
                              }

                        }
                  }
            };
      }

      //sắp xếp 
      public ItemListener sapXepListener() {
            return new ItemListener() {
                  @Override
                  public void itemStateChanged(ItemEvent e) {
                        int sx = frameSach.getCbxSapXep().getSelectedIndex();
                        switch (sx) {
                              case 1:
                                    showTableSach(modelSach.sortSachByGia());
                                    break;
                              case 2:
                                    showTableSach(modelSach.sortSachByGiaAndTen());
                                    break;
                              default:
                                    showTableSach(modelSach.getAllSach());
                                    break;
                        }
                  }
            };
      }
//đăng xuất 

      private ActionListener logoutListener() {
            return new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        JOptionPane.showConfirmDialog(frameSach, "Đăng Xuất???");
                        frameSach.setVisible(false);
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
                        JOptionPane.showConfirmDialog(frameSach, "Thoát ra menu???");
                        frameSach.setVisible(false);
                        MenuView frameMenu = new MenuView();
                        MenuController control = new MenuController(frameMenu);
                  }
            };
      }

      public SachController() {
      }

      public SachView getFrameSach() {
            return frameSach;
      }

      public void setFrameSach(SachView frameSach) {
            this.frameSach = frameSach;
      }

      public QLSachModel getModelSach() {
            return modelSach;
      }

      public void setModelSach(QLSachModel modelSach) {
            this.modelSach = modelSach;
      }

//      public static void main(String[] args) {
//            QLSachModel model = new QLSachModel();
//            SachView view = new SachView();
//            SachController controll = new SachController(view, model);
//      }
}
