//If exception is handled then also finally block gets executed
public class finally2 {

    static void meth1(){
        try{
            System.out.println(10/0);
         }

         catch(ArithmeticException e){
            System.out.println(e);
         }
         finally{
            System.out.println("**************This is final block***************");
         }
}

    public static void main(String[] args) {
            meth1();
    }
}
