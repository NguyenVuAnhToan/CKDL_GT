package com.toannva2008110136.baiTapThem;

public class Cow {
    double canNang;
    String mauSac;
    String gioiTinh;
    
    Cow(){
        //Hàm tạo mặc định
    }

    Cow(double CN, String mau, String gt){
        canNang = CN;
        mauSac = mau;
        gioiTinh = gt;
    }
    
    void inThongTin(){
        System.out.println("Cân nặng: "+canNang);
        System.out.println("Màu: "+mauSac);
        System.out.println("Giới Tính: "+gioiTinh);
    }
}
