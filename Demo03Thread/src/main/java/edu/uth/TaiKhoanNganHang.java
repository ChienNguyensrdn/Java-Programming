package edu.uth;

public class TaiKhoanNganHang {
    private double sodu = 100000000;
    public synchronized void NhanTien(){
        sodu+= 2000000;
    }
    public synchronized void ThanhToan(){
        sodu-= 1000000;
    }
    public double getSodu() {
        return sodu;
    }
}
