package com.toannva2008110136.kiemTraGiuaKy;
import java.util.Scanner;
import java.util.ArrayList;
public class appleTestDrive {
    static ArrayList<Apple> appleList;
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        nhap();
        tim();
        inDanhSach();
        scanner.close();
    }



  static void nhap() {
        appleList = new ArrayList<Apple>();
        while(true){
            System.out.print("Nhap id: ");
            int id = scanner.nextInt();
            System.out.print("Nhap khoi luong: ");
            double khoiLuong = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("mau sac: ");
            String mauSac = scanner.nextLine();
            appleList.add(new Apple(id, khoiLuong, mauSac));
            System.out.print("Nhập thêm (Y/N)? ");
            String luaChon = scanner.nextLine();
            if(luaChon.equals("N") || luaChon.equals("n")){ 
                break; 
            }
        }   
    }
    static void inDanhSach(){
        for(Apple apple:appleList) {
            apple.inThongTin();
        }
    }
    static void tim() {
        while(true){
          System.out.print("Màu sắc bạn muốn tìm là :");
          String mauSac = scanner.nextLine();
    
          ArrayList<Apple> danhSach = new ArrayList<Apple>();
          for(Apple apple:appleList) {
                if (apple.mauSac.equals(mauSac)) {
                    danhSach.add(apple);
                }
          }
          if (danhSach.size() == 0) {
            System.out.print("Apple màu " + mauSac + "không có trong danh sách !");
          } else {
                System.out.print("Tìm thấy " + danhSach.size() + " Apple co mau " + mauSac + "\n");
                for(Apple apple:danhSach) {
                    apple.inThongTin();
                }
          }
          System.out.println("Bạn có muốn tìm tiếp màu sắc: ");
          System.out.print("Tìm tiếp (Y/N)? ");
          String luaChon = scanner.nextLine();
            if(luaChon.equals("N") || luaChon.equals("n")){ 
                break; 
            }
        }
    }
}
