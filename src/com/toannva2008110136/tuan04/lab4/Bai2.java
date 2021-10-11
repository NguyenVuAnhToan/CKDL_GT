package com.toannva2008110136.tuan04.lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 { 
    ArrayList <String> danhSachHoVaTen ;
    public static void main(String[] args) {
        
        System.out.println("=====Menu=====");
        System.out.println("1.Nhập danh sách họ tên");
        System.out.println("2.Xuất danh sách vừa nhập");
        System.out.println("3.Xuất danh ngẫu nhiên  ");
        System.out.println("4.Sắp xếp giảm dần và xuất danh sách");
        System.out.println("5.Tìm và xóa họ tên nhập từ bàn phím ");
        System.out.println("Kết thúc");
        int suLuaChon;
        Scanner bienNhap =  new Scanner(System.in);
        Main hoTen = new Main();
        hoTen.lish = new ArrayList<String>();
        do {
            System.out.print("xin mời lựa chọn chức năng: ");
            
            suLuaChon = bienNhap.nextInt();
        
            switch(suLuaChon){
                case 1 :
                    hoTen.nhap();
                    break;

                case 2 :
                    hoTen.xuat();
                    break;
                case 3:
                    hoTen.xuatNgauNhien();
                    break;
                case 4 :
                    hoTen.sapXep();
                    break;
                case 5:
                    hoTen.timVaXoa();
                    break;
                default:
                    System.out.println("tạm biệt ! ");
            }
        }   while (suLuaChon >= 1 && suLuaChon <= 5  );
        bienNhap.close();
    }
    
    void nhap (){
        Scanner scan =  new Scanner(System.in);
        while(true){ 
            System.out.printf("Nhập họ và tên ");
            String x = scan.nextLine(); 
            danhSachHoVaTen.add(x);    
            System.out.print("Nhập thêm (Y/N)? "); 
            if(scan.nextLine().equals("N")){ 
                break; 
            }     
        } 
        scan.close();
    }
     
    void xuat(){
        System.out.println("Danh sách họ và tên :" );
        for (String i : danhSachHoVaTen){
            System.out.println(i);
        }
    }
    void xuatNgauNhien(){
        System.out.println("xuất ngẫu nhiên: ");
        Collections.shuffle(danhSachHoVaTen);
        xuat();
    }
    void sapXep(){
        System.out.println("Sắp xếp giảm dần ");
        Collections.sort(danhSachHoVaTen);
        Collections.reverse(danhSachHoVaTen);
    }
    void timVaXoa(){
        System.out.println("Nhập họ tên: ");
        Scanner scanner =  new Scanner(System.in);
        String hoTen = scanner.nextLine();
        danhSachHoVaTen.remove(hoTen);
        System.out.println("Danh sách sau khi xóa");
        xuat();
        scanner.close();
    }


}
