package com.toannva2008110136.tuan03.lab3;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        int n;
        boolean kiemTra = true;
        Scanner N = new Scanner(System.in);
        System.out.print("Nhập số n = ");
        n = N.nextInt();
        for(int i = 2;i < n - 1;i++){
            if(n % i == 0){
                kiemTra = false;
                break;
            }
        }
        if(kiemTra == true)
            System.out.printf("%d là số nguyên tố.", n);
        else    
            System.out.printf("%d không phải là số nguyên tố.", n);
        N.close();
     }
    
}

