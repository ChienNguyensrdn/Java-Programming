package edu.uth;
// có 2 cách tạo ra 1 Thread
//kế thừa class Thread của java
//Kế thừa inetrface Runnable
public class Demo04Thread extends Thread {
    public void run(){
        //Thuc thi logic
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
