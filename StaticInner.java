class outer{
    static int x=10;
    int y=20;

        static class inner{
            void display(){
                System.out.println(x);//can aaccess only static properties of class
               // System.out.println(y); caanot access non-static properties of outer class
            }
        }
}


public class StaticInner {
    public static void main(String[] args) {
        outer.inner oi = new outer.inner();
        oi.display();
    }
}
