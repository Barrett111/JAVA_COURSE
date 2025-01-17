
public class ExceptionHandling {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5};
        try{
           
            int a=10;
            int b=10;
            int c=b/a;
  
            try{                                    /////////////////////
                int d;
                System.out.println(A[10]);
            }                                                   //NESTED*************
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);             //////////////////////
            }

        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
