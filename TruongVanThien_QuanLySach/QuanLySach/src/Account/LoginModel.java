/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

/**
 *
 * @author Admin
 */
public class LoginModel {
      public static boolean dangNhap(Account acc) {
            return AccountDAO.kiemTraDangNhap(acc);
      }
      public static boolean dangKy(Account ac){
            return AccountDAO.dangKy(ac);
      }
              
      public static boolean doiMatKhau (String username, String oldPass, String newPass){
            return AccountDAO.doiMatKhau(username, oldPass, newPass);
      }
}
