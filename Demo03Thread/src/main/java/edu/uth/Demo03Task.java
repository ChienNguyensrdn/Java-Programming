package edu.uth;
//Thread , Runnable, Callable, ExecutorService
public class Demo03Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Task is running:"+Thread.currentThread().getName());
    }
}
