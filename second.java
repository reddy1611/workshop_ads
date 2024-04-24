import java.util.*;

public class second {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> p= new LinkedHashMap<Integer,Integer>();
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            int key=arr[i];
            if(!p.containsKey(key)){
                p.put(key,1);
            }
            else{
                int value=p.get(key);
                p.put(key,value+1);
            }
        }
        System.out.println(p);
    }
    
}
