package com.toannva2008110136.baiTapThem;

public class NhanVien {
    String tenNhanVien;
    int luong;
    String diaChi;
    String boPhanLamViec;
    String ngaySinh;

    NhanVien(){
        //Hàm tạo mặc định
    }
    NhanVien(String ten, int l, String DC, String BP, String NS){
        tenNhanVien = ten;
        luong = l;
        diaChi = DC;
        boPhanLamViec = BP;
        ngaySinh = NS;
    }
    void inThongTin(){
        System.out.println("Tên nhân viên: "+tenNhanVien);
        System.out.printf(" Lương: "+luong+" đồng\n");
        System.out.println("Địa chỉ: "+diaChi);
        System.out.println("Bộ phận làm việc: "+boPhanLamViec);
        System.out.println("Ngày sinh: "+ngaySinh);
    }
}
