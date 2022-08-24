package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args){
        //create the pool
        ExecutorService service = Executors.newFixedThreadPool(10);

        //submit the task for execution

        for(int i = 0 ; i <100; i++){
            service.execute(new Task());
        }
        System.out.println("Thread Name: "+ Thread.currentThread().getName());
    }
    static class Task implements Runnable{
        public void run(){
            System.out.println("Thread Name: "+ Thread.currentThread().getName());
        }
    }
}
