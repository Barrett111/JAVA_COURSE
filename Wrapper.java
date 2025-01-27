public class Wrapper {
    
    public static void main(String[] args) {
        
        //Integer i = new Integer(10);
        //Integer = Integer.valueOf(10);
         
    
        Byte b = 10;
        Byte e= Byte.valueOf(b); //creating object of Wrapper class
        System.out.println(e);

        Short s = Short.valueOf("150"); //creating object of Wrapper class
        System.out.println(s);

        Float f =12.3f;

        Float f1 =Float.valueOf(f);//creating object of Wrapper class
        System.out.println(f);

        Character c = Character.valueOf('A');//creating object of Wrapper class
        System.out.println(c);

        



     //   System.out.println(i);
    }
}
