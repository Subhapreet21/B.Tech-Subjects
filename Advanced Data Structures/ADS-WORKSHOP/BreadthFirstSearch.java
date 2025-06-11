import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class BreadthFirstSearch {
    private int V;
    private List<List<Integer>> adjList;
    public BreadthFirstSearch(int V){
        this.V=V;
        this.adjList = new ArrayList<>(V);
        for (int i=0;i<V;i++){
            adjList.add(new ArrayList<>());
        }
    }
    public void addEdge(int u,int v){
        adjList.get(u).add(v);
    }
    public void bfs(int source){
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[source]=true;
        q.offer(source);
        while(!q.isEmpty()){
            int vertex = q.poll();
            System.out.print(vertex+" ");
            for (int neighbor:adjList.get(vertex)){
                if (!visited[neighbor]){
                    visited[neighbor]=true;
                    q.offer(neighbor);
                }
            }
        }
    }
    public static void main(String[] args) {
        int V=7;
        BreadthFirstSearch g = new BreadthFirstSearch(V);
        g.addEdge(0,1);
        g.addEdge(1,0);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,4);
        System.out.println("Breadth-First Search starting from vertex 0");
        g.bfs(0);
    }
}
