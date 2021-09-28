package com.toannva2008110136.tuan02.lab1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float dai , rong;
        System.out.println("nhập chiều dai:");
        dai = scan.nextFloat();
        System.out.println("Nhập chiều rộng:");
        rong = scan.nextFloat();
        scan.close();
    
        System.out.println("%f chu vi HCN là:" + (dai+rong)*2);
        System.out.println("%f Diện tích HCN là: " + (dai*rong));
        System.out.println("%f Cạnh nhỏ nhất là: " + Math.min(dai,rong));
    }   
}


