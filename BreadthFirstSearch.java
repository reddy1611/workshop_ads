import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch{
    private int v;
    private List<List<Integer>> adjList;

    public BreadthFirstSearch(int V){
        this.v= V;
        this.adjList=new ArrayList<>(V);
        for (int i=0;i<V;i++){
            adjList.add(new ArrayList<>());
        }
    }

    

public void addedge(int u , int v){
    adjList.get(u).add(v);

}   
public void bfs(int source){
    boolean[] visited = new boolean[v];
    Queue<Integer>queue = new LinkedList<>();
    visited[source] = true;
    queue.offer(source);
    while (queue.isEmpty()){
        int vertex = queue.poll();
        System.out.println(vertex+" " );

        for (int neighbor : adjList.get(vertex)){
            if(!visited[neighbor]){
                visited[neighbor]=true;
                queue.offer(neighbor); 
            }
        }
    }
} 
}                     