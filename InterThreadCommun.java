class myData{
    int value;
    boolean flag = true;

    //set() method for producer to set/ write the data value

        synchronized void set(int v){  
            while(flag != true)
               try{
                wait();
               } 
               catch(Exception e){}

               value = v;
               flag = false;
               notify(); //it will notify that the object is free now

            
        }

        //get() method for consumer who will read the value written by producer

        synchronized public int get(){
            int x = 0;

            while(flag != false)
                try{
                    wait();
            }catch(Exception e){}

            x=value;
            flag=true;
            notify();
            return x;               
        }
}

class producer extends Thread{
    myData data; //reference to class 

    public producer(myData d){
        data=d;
    }

    public void run(){
        int cnt=1;

        while(true){
            data.set(cnt);
            System.out.println("Producer "+ cnt);
            cnt++;
        }
    }
}

class Consumer extends Thread{
    myData data;

    public Consumer(myData d){
        data=d;
    }

    public void run(){
        int value;

        while(true){

            value=data.get(); //reading value
            System.out.println("Consumer "+value);
        }
    }
}



public class InterThreadCommun {
    public static void main(String[] args) {
        
        myData data = new myData();

        producer p = new producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();

       
    }
}
