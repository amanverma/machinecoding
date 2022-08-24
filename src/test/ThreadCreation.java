package test;
/*Runnable Vs Thread -> if we extend thread , we cannot inherit any other class as multiple inheritance not supported
* in Java.*/

/*
public class ThreadCreation  extends Thread{
    public void run(){
        try{
            //print name of running thread
            System.out.println("Thread  "+ Thread.currentThread().getId() +"  is running");
        }catch(Exception e){
            System.out.println("Exception is caught!");

        }
    }

    public static void main(String args[]){
        int n = 10;
        for(int i = 1; i <n; i++){
            ThreadCreation threadCreation = new ThreadCreation();
            threadCreation.start();
        }
    }
}
*/


public class ThreadCreation implements Runnable{

    @Override
    public void run() {
        try{
            //print name of running thread
            System.out.println("Thread Name:  "+ Thread.currentThread().getName() +"  is running");
        }catch(Exception e){
            System.out.println("Exception is caught!");
        }
    }
    public static void main(String args[]){
        int n = 5;
        for(int i = 1; i <n; i++){
            Thread threadObject = new Thread(new ThreadCreation());
            threadObject.start();
        }
    }

}