package Collection_Interfaces;
import java.util.*;
public class LinkList {
    public static void main(String[] args) {
        
       LinkedList<Integer> li = new LinkedList<> ();

       li.add(10);
       li.add(20);
       li.add(30);
       li.add(40);

        li.forEach(System.out::println);
        
        //addFirst() and addLast() are only two more methods in linked list and all arraylist methods can be used
        li.addFirst(100);  
        li.add(2,90);
        li.addLast(120);

        System.out.println();
        li.forEach(System.out::println);

        System.out.println();
//returns index of element
        System.out.println(li.indexOf(120));

        System.out.println("These are elements in the linked list: -");

        li.forEach(System.out::println);

//pop() will remove head and push() will add element at the head
        li.pop();
        li.push(9000);
    System.out.println();
        li.forEach(System.out::println);
//TO CONVERT LINKEDLIST INTO AN  ARRAY
        System.out.println("Converted linked list into an array");

        Object [] obj = li.toArray();

        for(Object o : li){
            System.out.println(o);
        }
//TO CONVERT LINKEDLIST ELEMENETS INTO STRING
        Object str =li.toString();

        System.out.println("Converted into String");

        System.out.println(str);

     /*         li.clear();
                System.out.println("cleared link list");

                for(var x : li){
                System.out.println(x);
                }
   */
   
   //returns size of the list / number of elements in the list
   System.out.println(li.size());




    }
}
