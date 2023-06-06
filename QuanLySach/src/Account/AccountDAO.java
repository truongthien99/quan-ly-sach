/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class AccountDAO {
      //dang nhap
      public static boolean kiemTraDangNhap(Account acc) {
        try {
            String sqpCheck = "SELECT * FROM account WHERE userName = ? AND Password = ?";
            Connection con = DataBaseUltil.getConnection();
            PreparedStatement ps = con.prepareStatement(sqpCheck);

            //
            ps.setString(1, acc.getUserName());
            ps.setString(2, acc.getPassword());

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
            rs.close();
            ps.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
      //dang ky
      public static boolean dangKy(Account ac){
        int kq = -1;
        try {
            String sqpInsert = "INSERT INTO account VALUES (?, ?)";
            Connection con = DataBaseUltil.getConnection();
            //
            PreparedStatement ps = con.prepareStatement(sqpInsert);

            //
            ps.setString(1, ac.getUserName());
            ps.setString(2, ac.getPassword());
            

            kq = ps.executeUpdate();
            ps.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //them thanh cong return true 
        return (kq == 1) ? true : false;
    }
      public static boolean doiMatKhau (String username, String oldPass, String newPass){
          int kq = -1;
        try {
            String sqpUpdate = "UPDATE `account` SET `Password` = ? WHERE `account`.`userName` = ? AND Password = ?;";
            Connection con = DataBaseUltil.getConnection();
            PreparedStatement ps = con.prepareStatement(sqpUpdate);

            //
            ps.setString(1, newPass);
            ps.setString(2, username);
            ps.setString(3, oldPass);

            kq = ps.executeUpdate();

            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return (kq == 1) ? true : false;
    }
}