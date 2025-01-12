class parent{
    parent(){
        System.out.println("This is parent class construtor");
    }

    parent(int x,int y){
       int z= x+y;
        System.out.println("This is by parent"+z);
    }


}

class child extends parent{
    child(){
        System.out.println("This is child class constructor");
    }

    child(int x,int y,int k){
        super(x,y);
        System.out.println("This is parameter child");
    }
}

public class ConstrutoInInheritanc {

    public static void main(String args[]){
        child c=new child(10,12,1);
        
    }
    
}
