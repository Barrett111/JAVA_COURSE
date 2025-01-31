class myGenArr <T>{
@SuppressWarnings("unchecked") //due to generic the annotation is used
    T arr[] = (T []) new Object[10]; //Generic type array

    int length =0;

    public void append(T value){  //method to add values in array

        arr[length++]=value;
    }

    public void display(){   //to display values from array
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }

}

class GenMethod{  

    //GENERIC METHOD//

  public static <E> void show(E [] arr){
        for(E x : arr){
            System.out.println(x);
        }
    }
}

public class Genrics2 {
    
    public static void main(String[] args) {
        
        myGenArr<Integer> ma=new myGenArr<Integer>();
        ma.append(10);
        ma.append(20);
        ma.append(30);
        ma.append(40);

        ma.display();

        GenMethod g= new GenMethod();

        String str[]={"hi","Hello"};
        Integer a[]={1,2,3,4};

        g.show(str);
        g.show(a);
    }
}
