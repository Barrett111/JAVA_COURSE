class Rectangle{
    int length;
    int breadth;

    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    void display(){
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
    }
}
class parent{
    int x=10;

    public void display(){
        System.out.println("This is parent display");
    }
    
}
class child extends parent{
    int x=20;
    public void display(){
        /*System.out.println("This is from Parent class: "+super.x);
        System.out.println("This is from child class: "+x);*/

        System.out.println("This is child display");
    }
    
}


public class thisKeyWord {

    public static void main(String args[]){

       // Rectangle r1 = new Rectangle(10,5);
       // r1.display();

       // Rectangle r2 = new Rectangle(20,10 );
       // r2.display();

       child d = new child(); //this is normal object creation
       d.display();
       parent c = new child(); //this is dynamic dispatch
       c.display();
    }
   
    
    
}
