package edu.uth.implementClass;

import edu.uth.*;
import edu.uth.interfaces.INhanvienFactory;
public class NhanvienFactory implements INhanvienFactory {
    @Override
    public Nhanvien createNhanvien(String loaiNV) {
        Nhanvien nv;
        switch (loaiNV){
            case "Laptrinhvien":
                nv = new Laptrinhvien();
                break;
                case "NhanvienPhantich":
                    nv = new NhanvienPhantich();
                    break;
            case "Ketoanvien":
                nv = new Ketoanvien();
                break;
                case "NhanvienKiemthu":
                    nv = new NhanvienKiemthu();
                    break;
                    default:
                        nv = null;

        }
        return nv;
    }

    @Override
    public Nhanvien createNhanvien(String maso, String hoten, double luongCB, String loaiNV) {
        Nhanvien nv;
        switch (loaiNV){
            case "Laptrinhvien":
                nv = new Laptrinhvien(maso,hoten,luongCB);
                break;
            case "NhanvienPhantich":
                nv = new NhanvienPhantich(maso,hoten,luongCB);
                break;
            case "Ketoanvien":
                nv = new Ketoanvien(maso,hoten,luongCB);
                break;
            case "NhanvienKiemthu":
                nv = new NhanvienKiemthu(maso,hoten,luongCB);
                break;
            default:
                nv = null;

        }
        return nv;
    }
}
