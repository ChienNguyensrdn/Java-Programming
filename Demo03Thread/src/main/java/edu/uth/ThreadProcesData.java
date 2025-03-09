package edu.uth;

public class ThreadProcesData extends Thread {
    //Thread hoat dong
    public void run(){
        //Logic xu ly
        for(int i =0 ; i<= 5; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {

            }
        }

    }
}
class ThreadExportFile implements Runnable{
    @Override
    public void run(){
        for(int i =6 ; i<= 11; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000)  ;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class BankAccount {
    private double balance = 10000000;
    public synchronized void ThanhToan(double amount){
        balance =balance - amount;
    }
    public synchronized void NhanTien(double amount){
        balance =balance+ amount;
    }
    public double getBalance(){
        return balance;
    }
//    public  BankAccount(double balance){
//        balance = balance;
//    }
}
