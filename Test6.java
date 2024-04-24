import java.util.ArrayList;
interface PositionalList<E>{
    void insert(E element,int index);
     void remove(int index);
      void set(int index,E element);
      E get(int index);
      boolean isEmpty();
      int size();


}
class ArrayListPositionalList<E> implements PositionalList<E>{
    private ArrayList<E> list;
    public ArrayListPositionalList(){
        list = new ArrayList<>();
    }
    @Override
    public void insert(E element,int index){
        list.add(index,element);
    }
     @Override
    public void remove(E element,int index){
        list.remove(index,element);
    }
     @Override
    public void set(E element,int index){
        list.set(index,element);
    }
     @Override
    public E get(int index){
        list.get(index);
    }
     @Override
    public boolean isEmpty(){
       return list.isEmpty();
    }
     @Override
    public int size()
        return list.size();
    }
    
}
public class Test6{
    public void main (String[]args){
        PositionalList<String>list = new ArrayListPositionalList<>();
        list.insert("a",0);
        list.insert("b",1);
        list.insert("c",2) 
        list.remove(1);
        list.set(0,"d");
        String element = list.get(1);
    }
}
