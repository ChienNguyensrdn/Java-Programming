package edu.uth;
//Task cong viec co the thuc doc lap .
//MuntiThread co the cho Tasks hoat dong song song
// Co nhieu cach thu thi task Runnable, Thread, Callable, ExcutorSevice..

import java.util.concurrent.Callable;

public class MyTask implements  Runnable {
    @Override
    public void run() {
        System.out.println("Task dang chay :"+ Thread.currentThread().getName());
    }
}
class MyTask1 implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Task Done!";
    }
}
