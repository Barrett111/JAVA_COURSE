@FunctionalInterface

interface myLamda{
    public void display(String str);
}


public class MethodReference {

    public MethodReference(String str){
        System.out.println(str.toUpperCase());
    }
    
    //this is static method
    public static void reverse(String str){
        StringBuffer sb =new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public void reversed(String str){
        StringBuffer sb =new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
    
    public static void main(String[] args) {
        
        /*SYNTAX:-
         *  FOR STATIC METHOD:-
         *                      interface ref =class::method;
         *                      ref.method(arg);
         * FOR NON-STATIC METHOD:-
         *                      class obj = new class();
         *                      interface ref = obj :: method;
         *                      ref.method(args);
         * 
         * FOR CONSTRUTOR:-
         *                  interface ref = class :: new;
         */




        myLamda m=System.out::println;   // [::] this is scope resolution used
        m.display("Hello world");


        //static method can made reference with class name directly
        myLamda md = MethodReference :: reverse;
        md.display("dohtem citats yb gnirts desrever si sihT");


        //non-static methods needs to make object of class and then access the method

      //  MethodReference mr =new MethodReference(); //object of class in which non static method present is created
      //  myLamda ml =mr::reversed; //the reference to the object is used in scope resolution

     //   ml.display("dohtem citats-non yb gnirts desrever si sihT");

        myLamda con = MethodReference :: new;
        con.display("Capital construtor");
    }
}
