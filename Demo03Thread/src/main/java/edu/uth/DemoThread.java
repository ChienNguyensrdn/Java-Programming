package edu.uth;
public class DemoThread extends Thread {
    public void run(){
        //Logic thread giai quyet mot cong viec
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Demo2Thread implements Runnable{

    @Override
    public void run() {
        for(int i=10;i<20;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
