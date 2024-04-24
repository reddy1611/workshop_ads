import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Queue2{
    public static void main(String[]args){
        Queue<Integer> pq=new LinkedList<Integer>();
        Stack <Integer> st =new Stack<Integer>();
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        // st.add(1);
        // st.add(2);
        // System.out.println(st);
        pq.add(p);
        // pq.add(2);
        // pq.add(3);
        // pq.add(4);
        System.out.println(pq);
        while(pq.size()>0){
            st.push(pq.poll());
        }
        System.out.println(st);
        while(st.size()>0){
            pq.add(st.pop());
            
        }
        System.out.println(pq);






       
    }
}
