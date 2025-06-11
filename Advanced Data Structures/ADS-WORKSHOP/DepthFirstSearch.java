import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class DepthFirstSearch {
    private int V;
    private List<List<Integer>> adjList;
    private boolean[] visited;
    public DepthFirstSearch(int V) {
        this.V = V;
        this.adjList = new ArrayList<>(V);
        this.visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }
    public void addEdge(int u,int v){
        adjList.get(u).add(v);
    }
    public void dfs(int source){
        Arrays.fill(visited,false);
        dfsUtil(source);
    }
    private void dfsUtil(int vertex){
        visited[vertex]=true;
        System.out.print(vertex+" ");
        for (int neighbor:adjList.get(vertex)){
            if (!visited[neighbor]){
                dfsUtil(neighbor);
            }
        }
    }

    public static void main(String[] args) {
        int V=7;
        DepthFirstSearch g = new DepthFirstSearch(V);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 6);
        System.out.println("Depth-First Search starting from vertex 0:");
        g.dfs(0);
    }
}
