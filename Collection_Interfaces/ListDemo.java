package Collection_Interfaces;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo{
    public static void main(String [] args){

        ArrayList <Integer> a1= new ArrayList<>();
        a1.add(10);

        ArrayList <Integer> a2 = new ArrayList<>();
        a2.add(40);
        a2.add(90);
        a2.add(90);
        a1.addAll(a2);
        a1.add(90);
        

        a1.set(0,100);
       int s= a1.get(2);
       System.out.println(s);
       System.out.println(a1);
        
        System.out.println("Index of first appered "+a1.indexOf(90));
        System.out.println("Index of Later appeared "+a1.lastIndexOf(90));
        System.out.println(a1.contains(10));

//This will print all the elements in the ArrayList
//we require get() method to acces the elements of ArrayList using for loop, as this is generic class object not an array
        for(int i=0;i<a1.size();i++){
            System.out.print(a1.get(i)+" ");
        }
System.out.println(" ");
        //using for each loop

        for(Integer x : a1){
            System.out.print(x+" ");
        }

        for(var y : a1){  //var also can be used than Integer
            System.out.println(y);
        }
  //
System.out.println("This is Iterator");

//normal iterator allows only unidirectional access
        Iterator<Integer> itr =a1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
//ListIterator allows bidirectional access
        ListIterator<Integer> it =a1.listIterator();

    while(it.hasNext()){
        System.out.println(it.next());

    }

    //Iterator using for loop
//no updation condition
System.out.println("This is List Iterator using for loop");

    for(a1.listIterator(); it.hasNext();)
    {
        System.out.println(it.next());
    }
//Normal Iterator using for loop
    System.out.println("This is normal Iterator using for loop");

    for(a1.iterator(); itr.hasNext();){
        System.out.println(itr.next());
    }
System.out.println("THis is forEach Scope resolution");
    a1.forEach(System.out::println);
    a1.forEach(n-> display(n));
}

    

   static void display(int n)
   {
    //System.out.println("This is lamda expression ");
        if(n > 50)
                   System.out.println(n);
        
   }

   
   



        
 
      
       

    }
