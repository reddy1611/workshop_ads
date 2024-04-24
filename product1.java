import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Scanner;

public class product1{
    public static void main(String []args){
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        //  ArrayList <Integer> ar=new ArrayList<>();
         Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         for(int i=0;i<n;i++){
            pq.add(sc.nextInt());
            if(i<2){
                System.out.println(-1);
            }
            else{
                int first=pq.poll();
                int second=pq.poll();
                int third =pq.poll();
                int res=first*second*third;
                System.out.println(res);
                pq.offer(first);
                pq.offer(second);
                pq.offer(third);
                System.out.println(pq);
            }
         }

//         pq.add(1);
//         pq.add(2);
//         pq.add(3);
//         pq.add(4);
//         pq.add(5);
//         if(pq.size()<3){
//             ar.add(-1);

//         }
//         else{
//             for(int i=0;i<=pq.size();i++){
//                 if(pq[i]>pq[i+1]){
//                     System.out.println(pq[i]);
//                 }
//             }
//             }

//         }
        

   }
}