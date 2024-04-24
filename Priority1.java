import java.util.PriorityQueue;
import java.util.Collections;
public class Priority1{
    public static void main(String argd[]){
       PriorityQueue <Integer> p=new PriorityQueue<Integer>(Collections.reverseOrder());
       p.add(3);
       p.add(5);
       p.add(7);
       p.add(9);
       System.out.println(p);
       p.poll();
       System.out.println(p);
    }
}