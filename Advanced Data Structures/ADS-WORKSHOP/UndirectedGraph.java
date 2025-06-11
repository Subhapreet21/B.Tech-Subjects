import java.util.*;
public class UndirectedGraph {
    private int numVertices;
    private Map<Integer, List<Integer>> adjacencyList;

    public UndirectedGraph(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyList = new HashMap<>();
        for (int i = 0; i < numVertices; i++) {
            adjacencyList.put(i, new LinkedList<>());
        }
    }
    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // for undirected graph
    }
    public void removeEdge(int source, int destination) {
        adjacencyList.get(source).remove(Integer.valueOf(destination));
        adjacencyList.get(destination).remove(Integer.valueOf(source)); // for undirected graph
    }

    public boolean isEdge(int source, int destination) {
        return adjacencyList.get(source).contains(destination);
    }

    public List<Integer> getAdjacentVertices(int vertex) {
        return adjacencyList.get(vertex);
    }

    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            List<Integer> adjacentVertices = adjacencyList.get(i);
            System.out.print("Vertex " + i + " is connected to: ");
            for (Integer vertex : adjacentVertices) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        UndirectedGraph graph = new UndirectedGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        System.out.println("Graph:");
        graph.printGraph();
    }
}