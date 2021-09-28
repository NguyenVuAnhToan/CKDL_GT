package com.toannva2008110136.tuan02.lab2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        float a, b, c;
        // double x1, x2;

        Scanner scan = new Scanner(System.in);
        System.out.println("nhập hệ số a");
        a = scan.nextFloat();
        System.out.println("nhập hệ số b");
        b = scan.nextFloat();
        System.out.println("nhập hệ số c");
        c = scan.nextFloat();
        if (a==0){
            // bx + c = 0
            if(b==0){
                if (c == 0) {
                    System.out.println("PT có vô số nghiệm");
                } else {
                    System.out.println("PT vô nghiệm");
                }
            } else {
                
                System.out.println("PT có nghiệm x= " + (-c/b));
            }
        }else { // phương trình bậc 2 
            float delta = b * b - 4 * a * c ;
            if (delta < 0){
                System.out.println("PT vô nghiệm");
            }else if (delta == 0 ){
                System.out.println("PT có nghiệp kép x="+ (-b/(2*a)));
            }else if (delta > 0){
                System.out.println("PT có 2 nghiêm phân biệt");
                System.out.println("x1 = "+ (-b+ Math.sqrt(delta))/ 2 * a);
                System.out.println("x2 = "+ (-b- Math.sqrt(delta))/ 2 * a);
            }
        }
        scan.close();
    }
}   


