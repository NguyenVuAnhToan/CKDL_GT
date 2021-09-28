package com.toannva2008110136.tuan02.lab1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double canh;
        System.out.println("nhập cạnh của khối lập phương:");
        canh = scanner.nextDouble();
        scanner.close();
        System.out.println("thể tích khối lập phương là :"+ Math.pow(canh,3));
    
        }
    }
    
    

