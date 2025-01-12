
abstract class Super{
    abstract public void display1();

    abstract public void display2();
}

class Sub extends Super{
    public void display1(){
        System.out.println("This is display1 from child ");
    }
    public void display2(){
        System.out.println("This is display2 from child");
    }
}

public class AbstractClass {
    
    public static void main(String[] args) {
        Super s; //Reference of super class is allowed
       // Super s= new Super(); Object of Super class is not allowed
        s=new Sub();

        s.display1();
        s.display2();
    }
}
