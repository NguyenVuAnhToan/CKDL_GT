package com.toannva2008110136.tuan04.lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tong = 0 ;
        ArrayList<Double> list = new ArrayList<Double>();
        while(true){ 
            System.out.printf("Nhập 1 con số: ");
            Double x = scan.nextDouble(); 
            scan.nextLine();
            list.add(x);
            tong += x; 
            System.out.print("Nhập thêm (Y/N)? "); 
            if(scan.nextLine().equals("N")){ 
                break; 
            }     
        } 
        scan.close();
        System.out.println("Các số vừa nhập là :" );
        for (double i : list){
            System.out.println(i + " ");
        }
        System.out.println("tổng là :"+ tong);
    }
}
