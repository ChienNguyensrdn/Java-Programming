package edu.uth;

public class TaiKhoan {
    private double SoDu = 100000000;
    public synchronized void   NhanTien(){
        SoDu+= 20000000;
    }
    public synchronized void ThanhToan(){
        SoDu-= 10000000;
    }
    public double getSoDu() {
        return SoDu;
    }
}
