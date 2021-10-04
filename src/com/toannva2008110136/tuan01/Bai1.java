package com.toannva2008110136.tuan01;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // nhập từ bàn phím
        Scanner scan = new Scanner(System.in);
        // nhập họ tên
        System.out.println("Họ và tên");
        String hoten = scan.nextLine();
        //nhập điểm TB
        System.out.println("Điểm TB ");
        Double diemTB = scan.nextDouble();
        
        System.out.println("=========================");
        // xuất ra màn hình
        System.out.printf("%f:%s điểm ", hoten, diemTB);
        scan.close();


    }
}




