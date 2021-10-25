package com.toannva2008110136.kiemTraGiuaKy;

public class Apple {
    int id;
    double khoiLuong;
    String mauSac;

    public Apple(int id, double khoiLuong, String mauSac) {
        this.id = id;
        this.khoiLuong = khoiLuong;
        this.mauSac = mauSac;
    }

    public void inThongTin(){
        System.out.println("id Apple là :" + id  +" || " + " có khối lượng là: "  + khoiLuong  +" || " + "mau sac là :" + mauSac);
    }

}
