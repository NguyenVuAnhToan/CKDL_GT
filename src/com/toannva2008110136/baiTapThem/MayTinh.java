package com.toannva2008110136.baiTapThem;

public class MayTinh {
    String nhaSanXuat;
    int namSanXuat;
    String heDieuHanh;
    String RAM;
    String CPU;
    int gia;
    int namBaoHanh;

    MayTinh(){
        //Hàm tạo mặc định
    }

    MayTinh(String NSX, int nam, String HDH, String r, String c, int g, int NBH){
        nhaSanXuat = NSX;
        namSanXuat = nam;
        heDieuHanh = HDH;
        RAM = r;
        CPU = c;
        gia = g;
        namBaoHanh = NBH;
    }

    void inThongTin(){
        System.out.println("Nhà sản xuất: "+nhaSanXuat);
        System.out.println("Năm sản xuất: "+namSanXuat);
        System.out.println("Hệ điều hành: "+heDieuHanh);
        System.out.println("RAM: "+RAM);
        System.out.println("CPU: "+CPU);
        System.out.println("Giá bán: "+ gia +" đồng");
        System.out.println("Năm bảo hành: "+namBaoHanh);
    }
}
