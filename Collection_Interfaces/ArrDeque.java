package Collection_Interfaces;
import java.util.*;

public class ArrDeque {
    
    public static void main(String[] args) {
        
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);
        dq.add(50);

        dq.forEach(System.out::println);
        System.out.println();

        dq.poll(); //makes it to work like queue        

        dq.forEach(System.out::println);
        System.out.println();

        dq.offer(10); //inserts element at end

        dq.forEach(System.out::println);

        System.out.println();

        dq.offerFirst(100);  //inserts element at first
        dq.forEach(System.out::println);

        System.out.println();

        dq.offerLast(120);  //inserts element at last
        dq.forEach(System.out::println);

        System.out.println("\n"+dq.peek()); //returns first element

        System.out.println("\n"+ dq.peekFirst()); //returns first elememt
        System.out.println("\n"+ dq.peekLast()); //returns last element

        System.out.println("\n"+ dq.remove()); //removes element from first
        System.out.println();
        dq.forEach(System.out::println);

        dq.removeLast();

        dq.forEach(System.out::println);
System.out.println();
        dq.pop();

        dq.forEach(System.out::println);
    }
}
