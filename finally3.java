public class finally3 {
    //If exception is not handled then also finally block gets executed


    static void meth1(){
        try{
            System.out.println(10/0);
         }
         //here exception isnot handled,however finally block is executed
         finally{
            System.out.println("**************This is final block***************");
         }

         //as exception is not handled,it is handled by JVM.
}

    public static void main(String[] args) {
            meth1();
    }


}
