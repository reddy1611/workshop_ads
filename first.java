import java.util.Scanner;

public class first{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int taget=9;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();

        }
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;i<n;j++){
                if(arr[i]+arr[j]==taget){
                    System.out.println(i+""+j);
                    c++;
                }
            }
            if(c>0){
                break;
            }
        }

    } 

}