public class Deadlock {
    String str1 = "Aman";
    String str2 = "Verma";

    Thread trd1 = new Thread("Thread 1"){
        public void run(){
            while(true){
                synchronized(str1){
                    synchronized(str2){
                        System.out.println(str1 + str2);
                    }
                }
            }
        }
    };

    Thread trd2 = new Thread("Thread 2"){
        public void run(){
            while(true){
                synchronized(str2){
                    synchronized(str1){
                        System.out.println(str2 + str1);
                    }
                }
            }
        }
    };

    public static void main(String a[]){
        Deadlock deadlock = new Deadlock();
        deadlock.trd1.start();
        deadlock.trd2.start();
    }
}

