
public class SimpleMouseCatGame {

    public static int catMouseGame(int[][] graph) {
        if (graph[1].length == 0) {
            return 2;
        }
        if (graph[2].length == 0) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {2, 5},
            {3},
            {0, 4, 5},
            {2, 3},
            {0, 2, 3}
        };
        int result = catMouseGame(graph);
        if (result == 0) {
            System.out.println("Draw"); 
        }else if (result == 1) {
            System.out.println("Mouse Wins"); 
        }else {
            System.out.println("Cat Wins");
        }
    }
}
