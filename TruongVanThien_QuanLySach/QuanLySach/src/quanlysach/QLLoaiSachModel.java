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
public class QLLoaiSachModel {
      //them sach
    public static boolean addLoai(LoaiSach loai){
          return QLLoaiSachDao.themLoaiSach(loai);
    }
    public static boolean suaLoai(LoaiSach loai){
          return QLLoaiSachDao.suaLoaiSach(loai);
    }
    //xoa sach
    public static boolean xoaLoai(String ma){
          return QLLoaiSachDao.xoaLoaiSach(ma);
    }
    //
    public static ArrayList<LoaiSach> getAllLoai(){
          return QLLoaiSachDao.getAllLoai();
    }
    //
    public static ArrayList<LoaiSach> searchByName(String name){
          return QLLoaiSachDao.searchByName(name);
    }
    
    //
    public static ArrayList<LoaiSach> sortLoaiByCode(){
          return QLLoaiSachDao.sortLoaiByName();
    }
    //
    public static ArrayList<LoaiSach> sortLoaiByCodeAndName(){
          return QLLoaiSachDao.sortLoaiByNameAndCode();
    }
     
}
