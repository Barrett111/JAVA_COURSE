
class lowBalException extends Exception{ //userDefined Exception
    public String toString(){ 
        return "Low balance";
    }
}
public class checkedUncheckedException {
   

        static void fun1(){
          /*   try{
                System.out.println(10/0);
            }
            catch(Exception e){
                System.out.println(e.getMessage()); //this will print only message
                System.out.println(e.toString());//this will print both msg and exception
               // e.printStackTrace();
            }*/

            try{                            //userdefined exception
                throw new lowBalException();
            }
            catch(lowBalException e){
                System.out.println(e);
            }
            


            
        }
        static void fun2(){
            fun1();
        }
        static void fun3(){
            fun2();
        }

        public static void main(String[] args) {
            fun3();
        }
    
}
