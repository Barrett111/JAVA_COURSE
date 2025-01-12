interface Test{

    void display();
    void display1();
}

class test1 implements Test{
  public void display(){
        System.out.println("Hello from child display");
    }

    public void display1(){
        System.out.println("Hello from child display1");
    }
}


public class Interface {
    public static void main(String[] args) {
      Test t;

     // t=new Test(); The object of Interface is not allowed
     t=new test1(); //object of implemented class is allowed
     t.display();
     t.display1();
        
    }
}
