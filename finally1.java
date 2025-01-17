//if exception is there,then also finallybloc gets execute
public class finally1 {

   static void meth1() throws Exception{
        try{
            throw new Exception();    
        }
        finally{
            System.out.println("This is final block");
        }
       
    }
    public static void main(String[] args) throws Exception{
       meth1();
    }
}
