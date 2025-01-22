 class myData {

    synchronized public void display(String str) {  //making use of synchronized keyword, it synchronizes the acces of data by thread1 and thread2,
                                                    // that is after the complete execution of thread1 the data is assigned to thread2
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

}

class myThread1 extends Thread {

    myData d;

    public myThread1(myData d) {
        this.d = d;
    }

    public void run() {
        d.display("Hello Rushikesh");
    }

}

class myThread2 extends Thread {

    myData d;

    public myThread2(myData d) {
        this.d = d;
    }

    public void run() {
        d.display("This is Thread 1");
    }
}

public class MonitorSync {
    public static void main(String[] args) {

        myData data = new myData();

        myThread1 t1 = new myThread1(data);
        myThread2 t2 = new myThread2(data);

        t1.start();
        // sleep(10);
        t2.start();

    }
}
