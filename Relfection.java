import java.lang.reflect.*;

class className{

    String a;
    int b;

    public className(){

    }

    public className(String a,int b){
        this.a=a;
        this.b=b;
    }

    public void display(){
        System.out.println(this.a+" "+this.b);
    }
    public void Param(int x,int y){

    }
}

public class Relfection {

    public static void main(String[] args) {
        
        Class c = className.class; //Assigned to Class
    
        System.out.println(c.getName()); //gives name of class

        Field field []=c.getDeclaredFields();
        Method method[]=c.getDeclaredMethods();
        Constructor con[]=c.getConstructors();
        
        Parameter par[]=method[1].getParameters();
       
        System.out.println("***************These are Fields in class**************");
        for(Field f:field){
            System.out.println(f);
        }
        System.out.println("***************These are Methods in class**************");

        

        for(Method m:method){
            System.out.println(m);
        }

        System.out.println("***************These are Construtors in class**************");

        for(Constructor ct:con){
            System.out.println(ct);
        }

        System.out.println("***************These are Parameters in method at 1 in class**************");
        for(Parameter p:par){
            System.out.println(p);
        }
    }
   
    
   

    

}
