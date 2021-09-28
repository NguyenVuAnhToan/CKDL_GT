package com.toannva2008110136.tuan02.lab2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        float a, b;
        // double x;
        Scanner scan = new Scanner(System.in);
        System.out.println("nhập hệ số a");
        a = scan.nextFloat();
        System.out.println("nhập hệ số b");
        b = scan.nextFloat();
        
        scan.close();
    
        if (a==0);{
            if(b==0){
                System.out.println("Phương trình có vô số nghiệm");
            
            }else {
                // System.out.println("phương trình vô nghiệm");
                // else {
                    
                //     System.out.println("phương trình có nghiệm x= " + (-b/a));}
            }
            
                
        }
    }
}

