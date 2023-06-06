/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysach;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QLSachModel {
    //them sach
    public static boolean addSach(Sach sach){
          return QLSachDAO.themSach(sach);
    }
    public static boolean suaSach(Sach sach){
          return QLSachDAO.suaSach(sach);
    }
    //xoa sach
    public static boolean xoaSach(String ma){
          return QLSachDAO.xoaSach(ma);
    }
    //
    public static ArrayList<Sach> getAllSach(){
          return QLSachDAO.getAllSach();
    }
    //
    public static ArrayList<Sach> searchByMaLoai(String ma){
          return QLSachDAO.searchByMaLoai(ma);
    }
    //
    public static ArrayList<Sach> searchByName(String ma){
          return QLSachDAO.searchByName(ma);
    }
    //
    public static ArrayList<Sach> sortSachByGia(){
          return QLSachDAO.sortSachByGia();
    }
    //
    public static ArrayList<Sach> sortSachByGiaAndTen(){
          return QLSachDAO.sortSachByGiaAndTen();
    }
     
}
