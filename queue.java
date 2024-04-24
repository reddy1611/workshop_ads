
import java.util.Queue;
import java.util.LinkedList;
public class    queue{
    public static void main(String[] args){
        Queue <Object> q=new LinkedList<>();
        q.offer(1);
        q.add(3);
        q.add("vs");
        System.out.println(q);
    }
}