package com.toannva2008110136.tuan02.lab2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
    
        double soDien;
        Scanner scanner = new Scanner(System.in);
        System.out.println("%dNhập số điện đã sử dụng: ");
        soDien = scanner.nextDouble();
        
        scanner.close();
        if (soDien < 50){
            System.out.println("số tiền điện phải đóng là :" + soDien * 1000);
        }   else if (soDien > 50){
                System.out.println("số tiền điện phải đóng là :" +  50*1000 + (soDien - 50)*1200 );
            }

    }
}

