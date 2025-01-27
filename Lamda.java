@FunctionalInterface
interface myLamda{

    public void display(int x, int y);
}

@FunctionalInterface
interface paramLamda{
public int add(int a,int b);
}


public class Lamda {
    
    public static void main(String[] args) {
       
        myLamda m = 
        (x,y) ->
            {
                System.out.println("hello world "+(x+y));
            };
            m.display(10,12);

        //**************Parameterised Lamda Expression**********//

        paramLamda pl =
            (a,b) -> {
                return a+b; //this is to return from lamda expression
            };

           System.out.println(" paramLamda pl =\r\n" + //
                              "            (a,b) -> {\r\n" + //
                              "                return a+b; " + //
                              "            };\n "+pl.add(10,15)); 

        paramLamda l = (a,b) -> a+b; //this will also return; USE THIS FORM
           System.out.println(" paramLamda l = (a,b) -> a+b;\n "+l.add(15,40)); 
    }
}
