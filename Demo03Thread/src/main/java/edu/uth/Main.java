package edu.uth;

public class Main {
    public static void main(String[] args) {
        /*
        Process:
            Thread t1, t2...
            Thread : lam sao de khai bao va sử dụng
            Có các cách khai báo nào
            Thread chạy đồng thời (concurent)
            Chạy ưu tiên
            Đồng bộ hoá : các Thread dùng chung tài nguyen
         */
        //Có 2 cách để khai báo 1 Thread
        //Kế thừa từ class Thread (Java):
        //Dong bo hoa (Synchronization)
        BankAccount bankAccount = new BankAccount();
        Thread thanhtoan = new Thread(()->{
            //Logic
            for (int i = 0; i<=4; i++){
                bankAccount.ThanhToan(200000);
            }
        });
        Thread nhantien = new Thread(()->{
            for (int i = 0; i<=2; i++){
                bankAccount.NhanTien(500000);
            }
        });
        thanhtoan.start();
        nhantien.start();
        try {
            nhantien.join(); //cho xong
            thanhtoan.join();//cho xong
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(bankAccount.getBalance());
    }
    //Task tim hieu
    //Task <> Thread
    // Lap trinh demo

}


