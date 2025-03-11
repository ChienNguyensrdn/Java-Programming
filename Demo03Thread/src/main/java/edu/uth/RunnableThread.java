package edu.uth;

public class  RunnableThread implements Runnable{
    @Override
    public void run() {
        for (int i = 10; i < 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
