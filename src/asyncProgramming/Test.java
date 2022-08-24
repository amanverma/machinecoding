package asyncProgramming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
//    public static void main(String[] args) {
//        for(int i = 0 ; i < 10; i++){
//            Thread t = new Thread(new Task());
//            t.start();
//        }
//        System.out.println("thread: "+ Thread.currentThread().getName());
//    }

    //  t1->t2->t3-................t-100

    public static void main(String[] args) {
        //create a thread pool
        int coreCount = Runtime.getRuntime().availableProcessors();
        //when your tasks are short lived tasks
        ExecutorService service = Executors.newCachedThreadPool(); //no fixed number of threads
        //a new thread is created for a new task and if a thread is idle for 60 seconds then it will be killed.
        //how will you define pool size -> Operation - IO intensive or CPU intensive(number of processors)
        //IO intensive -> db calls, http calls, network calls, -> you must choose a larger pool size (larger than number of cores)
        //submit the tasks
        for(int i = 0 ; i <100; i++){
            service.execute(new Task());
        }
    }
    static class Task implements Runnable{
        public void run(){
            System.out.println("thread started:  "+ Thread.currentThread().getName());
        }
    }


    /*
    *  main thread ------------> t1.start() ---thread-0----> given thread - thread-0
    *
    *
    *
    *Single Threaded Executor
    * When to use ---> when you want sequential execution of tasks. Sequential execution cannot be guaranteed in other 3 types
    *
    * */


}
