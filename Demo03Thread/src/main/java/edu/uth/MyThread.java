package edu.uth;

public class MyThread extends Thread {
    public void run(){
        System.out.println("MyThread is running");
        for(int i =6 ; i<= 12;i++){
            try{
                //Thread.sleep(2000);
                System.out.println(i);
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
//Cach 2 implement tu interface Runnable
class MyRunnable implements  Runnable{

    @Override
    public void run() {
        for(int i =0 ; i<= 5;i++){
            System.out.println("MyRunnable is running:"+i);
        }
    }
}
class Counter{
    private int count = 0;
    public synchronized void increment() {
        count++;
    }
    public int getCount() {
        return count;
    }
}
