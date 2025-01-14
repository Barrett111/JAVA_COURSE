class Test{

    static{
        System.out.println("Hello from Static first");
    }

    static{
        System.out.println("Hello from Static Second");
    }

    static{
        System.out.println("Hello from Static Third");
    }
}


public class StaticBlock {
    public static void main(String[] args) {
        Test t = new Test(); // For executing static just use class i.e making object of class loads the class.
              // thus, without using object, Static block gets called.
        System.out.println(t.hashCode());
        
    }
}
