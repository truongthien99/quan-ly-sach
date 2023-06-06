/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QLLoaiSachDao {
     public static Connection c;

    public static Connection getConnect() throws Exception {
        if (c == null) {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsach", "root", "");
        }
        return c;
    }
    //them du vao 1 sach
    public static boolean themLoaiSach(LoaiSach loai) {
        int kq = -1;
        //cau lenh sql them sach
        String sqpInsert = "INSERT INTO loaisach VALUES (?, ?)";
        try {

            //ket noi sql
            Connection con = getConnect();

            //
            PreparedStatement ps = con.prepareStatement(sqpInsert);

            //them cac du lieu cho sach
            ps.setString(1, loai.getMaLoai());
            ps.setString(2, loai.getTenLoai());
            

            //
            kq = ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //them thanh cong kq =1 return true nguoc lai false
        return (kq == 1) ? true : false;
    }
    //Sua loai sach theo ma 
    public static boolean suaLoaiSach(LoaiSach loai) {
        int kq = -1;
        try {
            String sqpUpdate = "UPDATE `loaisach` SET `tenLoai` = ? WHERE `loaisach`.`maLoai` = ?;";
            Connection con = getConnect();
            PreparedStatement ps = con.prepareStatement(sqpUpdate);

            //
            ps.setString(1, loai.getTenLoai());
            ps.setString(2, loai.getMaLoai());
           

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
    //Xoa loai sach theo maLoai
    public static boolean xoaLoaiSach(String ma) {
        int kq = -1;
        try {
            //cau lenh sql xoa 1 sach
            String sqpDelete = "DELETE FROM loaisach WHERE maLoai = ?";
            
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
    public static ArrayList<LoaiSach> getAllLoai() {
            ArrayList<LoaiSach> dskq = new ArrayList<>();
            String sqpSelect = "SELECT * FROM loaisach";
            Connection con;
            try {
                  con = getConnect();
                  //
                  PreparedStatement ps = con.prepareStatement(sqpSelect);

                  //
                  ResultSet rs = ps.executeQuery();
                  //
                  while (rs.next()) {
                        dskq.add(new LoaiSach(rs.getString(1), rs.getString(2)));
                  }
                  rs.close();
                  ps.close();
            } catch (Exception ex) {
                  ex.printStackTrace();
            }
            return dskq;
      }
    //tim loai sach theo ten
    public static ArrayList<LoaiSach> searchByName(String name){
          ArrayList<LoaiSach> dskq = new ArrayList<>();
          String sqpFindType = "SELECT * FROM `loaisach` WHERE `tenLoai` LIKE CONCAT('%', ?, '%')";
          Connection con;
          try {
                con = getConnect();
                PreparedStatement ps = con.prepareStatement(sqpFindType);
                
                ps.setString(1, name);
                
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                        dskq.add(new LoaiSach(rs.getString(1), rs.getString(2)));
                  }
                  rs.close();
                  ps.close();
                
                
          } catch (Exception e) {
                e.printStackTrace();
          }
          return dskq;
    }
    //
    public static ArrayList<LoaiSach> sortLoaiByName() {
            ArrayList<LoaiSach> dskq = new ArrayList<>();
            String sqpSelect = "SELECT * FROM `loaisach` ORDER BY `tenLoai`";
            Connection con;
            try {
                  con = getConnect();
                  //
                  PreparedStatement ps = con.prepareStatement(sqpSelect);

                  //
                  ResultSet rs = ps.executeQuery();
                  //
                  while (rs.next()) {
                        dskq.add(new LoaiSach(rs.getString(1), rs.getString(2)));
                  }
                  rs.close();
                  ps.close();
            } catch (Exception ex) {
                  ex.printStackTrace();
            }
            return dskq;
      }
    public static ArrayList<LoaiSach> sortLoaiByNameAndCode() {
            ArrayList<LoaiSach> dskq = new ArrayList<>();
            String sqpSelect = "SELECT * FROM `loaisach` ORDER BY `tenLoai`,`maLoai`";
            Connection con;
            try {
                  con = getConnect();
                  //
                  PreparedStatement ps = con.prepareStatement(sqpSelect);

                  //
                  ResultSet rs = ps.executeQuery();
                  //
                  while (rs.next()) {
                        dskq.add(new LoaiSach(rs.getString(1), rs.getString(2)));
                  }
                  rs.close();
                  ps.close();
            } catch (Exception ex) {
                  ex.printStackTrace();
            }
            return dskq;
      }
}
