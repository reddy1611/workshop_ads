import java.util.ArrayList;
public class ArrayListExample2{
    public static void main(String[] args){
        ArrayList<Object> l1=new ArrayList<>();
        l1.add("apple");
        l1.add("banana");
        l1.add("orange");
        l1.add(78);
        l1.add(56.99);
        l1.add('b');

        System.out.println("Element at index 0: " + l1.get(0));
        System.out.println("Elements in the ArrayList: ");
        for(Object fruit:l1){
            System.out.println(fruit);
            
        }
    }
}