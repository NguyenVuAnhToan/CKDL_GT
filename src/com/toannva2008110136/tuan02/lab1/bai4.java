package com.toannva2008110136.tuan02.lab1;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("nhập hệ số a:");
            a = scan.nextInt();
        
        System.out.println("nhập hệ số b:");
            b = scan.nextInt();

        System.out.println("nhập hệ số c:");
            c = scan.nextInt();
        scan.close();
        float delta;
        delta = (b * b) - (4 * a * c);

        System.out.println("căn delta là : " + Math.sqrt(delta) );
        

    }
}


