/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class QLSachDAO {

    public static Connection c;

    public static Connection getConnect() throws Exception {
        if (c == null) {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsach", "root", "");
        }
        return c;
    }

    //them du vao 1 sach
    public static boolean themSach(Sach sach) {
        int kq = -1;
        //cau lenh sql them sach
        String sqpInsert = "INSERT INTO sach VALUES (?, ?, ?, ?, ?)";
        try {

            //ket noi sql
            Connection con = getConnect();

            //
            PreparedStatement ps = con.prepareStatement(sqpInsert);

            //them cac du lieu cho sach
            ps.setString(1, sach.getMaSach());
            ps.setString(2, sach.getTenSach());
            ps.setString(3, sach.getNhaXuatBan());
            ps.setDouble(4, sach.getDonGia());
            ps.setString(5, sach.getMaLoai());

            //
            kq = ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //them thanh cong kq =1 return true nguoc lai false
        return (kq == 1) ? true : false;
    }

    //sua sach
    public static boolean suaSach(Sach sach) {
        int kq = -1;
        try {
            String sqpUpdate = "UPDATE sach SET tenSach = ?, nhaXuatBan = ?, donGia = ?, maLoai = ? WHERE maSach = ?";
            Connection con = getConnect();
            PreparedStatement ps = con.prepareStatement(sqpUpdate);

            //
            ps.setString(1, sach.getTenSach());
            ps.setString(2, sach.getNhaXuatBan());
            ps.setDouble(3, sach.getDonGia());
            ps.setString(4, sach.getMaLoai());
            ps.setString(5, sach.getMaSach());

            //
            kq = ps.executeUpdate();

            //
            ps.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //sua thanh cong kq =1 return true nguoc lai false
        return (kq == 1) ? true : false;
    }

    //Xoa sach theo maSach
    public static boolean xoaSach(String ma) {
        int kq = -1;
        try {
            //cau lenh sql xoa 1 sach
            String sqpDelete = "DELETE FROM sach WHERE maSach = ?";
            
            //ket noi SQl
            Connection con = getConnect();
            PreparedStatement ps = con.prepareStatement(sqpDelete);

            //them tt maSach can Xoa
            ps.setString(1, ma);
            
            
            kq = ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         //xoa thanh cong kq =1 return true nguoc lai false
        return (kq == 1) ? true : false;
    }
   //lay tat ca sach
    public static ArrayList<Sach> getAllSach() {
            ArrayList<Sach> dskq = new ArrayList<>();
            String sqpSelect = "SELECT * FROM sach";
            Connection con;
            try {
                  con = getConnect();
                  //
                  PreparedStatement ps = con.prepareStatement(sqpSelect);

                  //
                  ResultSet rs = ps.executeQuery();
                  //
                  while (rs.next()) {
                        dskq.add(new Sach(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5)));
                  }
                  rs.close();
                  ps.close();
            } catch (Exception ex) {
                  ex.printStackTrace();
            }
            return dskq;
      }
    //tim sach theo ma loai
    public static ArrayList<Sach> searchByMaLoai(String ma){
          ArrayList<Sach> dskq = new ArrayList<>();
          String sqpFindType = "SELECT * FROM `sach` WHERE `maLoai` LIKE ?";
          Connection con;
          try {
                con = getConnect();
                PreparedStatement ps = con.prepareStatement(sqpFindType);
                
                ps.setString(1, ma);
                
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                        dskq.add(new Sach(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5)));
                  }
                  rs.close();
                  ps.close();
                
                
          } catch (Exception e) {
                e.printStackTrace();
          }
          return dskq;
    }
    //tim sach theo ten sach
    public static ArrayList<Sach> searchByName(String name){
          ArrayList<Sach> dskq = new ArrayList<>();
//          "SELECT * FROM `tbl_nhanvien` WHERE tbl_nhanvien.tenNV LIKE CONCAT('%', ?, '%')"
          String sqpFindType = "SELECT * FROM `sach` WHERE sach.tenSach LIKE CONCAT('%', ?, '%')";
          Connection con;
          try {
                con = getConnect();
                PreparedStatement ps = con.prepareStatement(sqpFindType);
                
                ps.setString(1, name);
                
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                        dskq.add(new Sach(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5)));
                  }
                  rs.close();
                  ps.close();
                
                
          } catch (Exception e) {
                e.printStackTrace();
          }
          return dskq;
    }

    //sap xep danh sach theo gia tien
    public static ArrayList<Sach> sortSachByGia() {
            ArrayList<Sach> dskq = new ArrayList<>();
            String sqpSelect = "SELECT * FROM `sach` ORDER BY `donGia`";
            Connection con;
            try {
                  con = getConnect();
                  //
                  PreparedStatement ps = con.prepareStatement(sqpSelect);

                  //
                  ResultSet rs = ps.executeQuery();
                  //
                  while (rs.next()) {
                        dskq.add(new Sach(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5)));
                  }
                  rs.close();
                  ps.close();
            } catch (Exception ex) {
                  ex.printStackTrace();
            }
            return dskq;
      }
    //sắp cếp theooo giá rồi theo tên
    public static ArrayList<Sach> sortSachByGiaAndTen() {
            ArrayList<Sach> dskq = new ArrayList<>();
            String sqpSelect = "SELECT * FROM `sach` ORDER BY `donGia` , `tenSach`";
            Connection con;
            try {
                  con = getConnect();
                  //
                  PreparedStatement ps = con.prepareStatement(sqpSelect);

                  //
                  ResultSet rs = ps.executeQuery();
                  //
                  while (rs.next()) {
                        dskq.add(new Sach(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5)));
                  }
                  rs.close();
                  ps.close();
            } catch (Exception ex) {
                  ex.printStackTrace();
            }
            return dskq;
      }
      
}
