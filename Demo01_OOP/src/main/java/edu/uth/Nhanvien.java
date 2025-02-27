package edu.uth;

import edu.uth.interfaces.ITienthuong;

public abstract class Nhanvien {
    protected String maso;
    protected String hoten;
    protected  double luongCB;
    protected ITienthuong phuongthucTinhThuong;

    public Nhanvien(String maso, String hoten, double luongCB) {
        this.maso = maso;
        this.hoten = hoten;
        this.luongCB = luongCB;
    }

    public Nhanvien() {
    }

    @Override
    public String toString() {
        return "Nhanvien{" +
                "maso='" + maso + '\'' +
                ", hoten='" + hoten + '\'' +
                ", luongCB=" + luongCB +
                '}';
    }
    public double getTienthuong(){
        return luongCB;
    }

    public String getMaso() {
        return maso;
    }

    public String getHoten() {
        return hoten;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public ITienthuong getPhuongthucTinhThuong() {
        return phuongthucTinhThuong;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    public void setPhuongthucTinhThuong(ITienthuong phuongthucTinhThuong) {
        this.phuongthucTinhThuong = phuongthucTinhThuong;
    }
}
