/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

/**
 *
 * @author Admin
 */
public class Account {
      // Thuoc tinh
    private String userName;
    private String password;

    // Ham khoi tao khong tham so
    public Account(){
        
    }

    // Ham khoi tao co doi so
    public Account(String userName, String password){
        this.userName=userName;
        this.password=password;
        
    }

    // Cac ham getter va setter
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}

