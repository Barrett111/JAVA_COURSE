
class Outer {

    int x = 10;

    class Inner {
        int y = 20;

        void innerDisplay() {
            System.out.println("this is X from innerclass: " + x);
            System.out.println("this is Y from innerclass: " + y);

        }
    }

    void outerDisplay() {
        Inner i = new Inner();
        i.innerDisplay();
        // System.out.println(i.y);
    }
}

public class InnerClass {

    public static void main(String[] args) {
        Outer o = new Outer();// ideal method to access inner class by making object of outer class
        // o.outerDisplay();
        o.outerDisplay();

        Outer.Inner oi = new Outer().new Inner(); // if want to access inner class directly without outer class
        oi.innerDisplay();

    }
}
