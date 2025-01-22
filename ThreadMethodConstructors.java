class myThread extends Thread{
   
    public myThread(String name){
        super(name);
        setPriority(Thread.MIN_PRIORITY);
        //setPriority(Thread.NORM_PRIORITY);
        //setPriority(Thread.MAX_PRIORITY);
    }
} 

public class ThreadMethodConstructors {
    
    public static void main(String[] args) {
        
        //myThread mt = new myThread();
        myThread mt = new myThread("MyThreadone");
System.out.println();
        System.out.println("***********THESE ARE get.. METHODS OF THREAD***********");
        System.out.println("ID: "+mt.getId());
        System.out.println("Name: "+mt.getName());
        System.out.println("Priority of Thread: "+mt.getPriority());
        mt.start(); // this will change thread state from new to runnable
        
        System.out.println("Thread State: "+mt.getState());
        System.out.println("ThreadGroup: "+mt.getThreadGroup());
        
System.out.println();

        System.out.println("**********THESE ARE INQUIRY METHODS OF THREAD************");
        System.out.println("IS THREAD ALIVE: "+mt.isAlive());
        System.out.println("Is thread acting as Daemon: "+mt.isDaemon());
        System.out.println("Is thread interupted by any other thread: "+mt.isInterrupted());
    }
}
