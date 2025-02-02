package Collection_Interfaces;
import java.util.*;

/*The priorirtyqueue works as Heap datastructure, it is by default min heap */
/*TO make it MaxHeap Comparator generic class is used */

class myCom implements Comparator <Integer>{

    public int compare(Integer o1, Integer o2){
        if(o1 < o2) return 1;
        if(o1 > o2) return -1;
        return 0;

    }

}
public class priorQueue {
    
    public static void main(String[] args) {

//BY DEFAULT MIN HEAP**********************
//PRIORITY IS MIN ELEMENT AT THE ROOT NODE

        PriorityQueue <Integer> p = new PriorityQueue<>();

p.add(20);
p.add(10);
p.add(30);
p.add(3);
p.add(15);
p.add(5);

System.out.println("By Defalut Min Heap :- ");
p.forEach((x)-> System.out.println(x));

        
//MAX HEAP USING COMPARATOR*******************************

//PRIORITY IS MAX ELEMENT AT THE ROOT NODE

    PriorityQueue<Integer> pq = new PriorityQueue<>(new myCom());


pq.add(20);
pq.add(10);
pq.add(30);
pq.add(3);
pq.add(15);
pq.add(5);



System.out.println("THe Max Heap is implemented using Comparator:- ");
        pq.forEach((n)-> System.out.println(n));

    }
}
