public class DirectedGraph {
    private int[][] adjacentMatrix;
    private int numVertices;
    public DirectedGraph(int numVertices){
        this.numVertices=numVertices;
        this.adjacentMatrix = new int[numVertices][numVertices];
    }
    public void addEdge(int source, int destination){
        adjacentMatrix[source][destination]=1;
    }
    public boolean hasEdge(int source,int destination){
        return adjacentMatrix[source][destination]==1;
    }
    void printGraph(){
        System.out.println("Adjacency Matrix representation of the graph is:");
        for (int i=0;i<numVertices;i++){
            for (int j=0;j<numVertices;j++){
                System.out.print(adjacentMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DirectedGraph g = new DirectedGraph(5);
        g.addEdge(0,1);
        g.addEdge(1,0);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.printGraph();
    }
}
