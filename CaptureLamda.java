@FunctionalInterface

interface capture{
    public void display();
}

class demo{
    int z=1;
    public void meth1(){
     int cnt=0;
    // cnt++;  this will not permit to acces by lamda exp
     

        capture c =()->
        {
            int x=0; 
            System.out.println(cnt);//local variable of method
            System.out.println(x++);//local variable of lamda exp
            System.out.println(z++);//instance varibale of class
            System.out.println("hello");
        };
        
        c.display();
    }
    
}
//////////////////////////////////////////////////////////////////////////////

//*************PASSING LAMDA EXPRESSION AS PARAMETER************************* */
class uselamda{
    public void callLamda(capture c){
        c.display();
    }
}
class writeLamda{
    public void meth2(){
        uselamda ul =new uselamda();

 ul.callLamda(
                ()->
                    {
                        System.out.println("This is lamda as paramter");
                    }
        
            );
    }
}
//////////////////////////////////////////////////////////////////////
//**************************************MAIN METHOD******************************************
public class CaptureLamda {
    public static void main(String[] args) {
        demo d = new demo();
        d.meth1();

        writeLamda w =new writeLamda();
        w.meth2();
    }
}
