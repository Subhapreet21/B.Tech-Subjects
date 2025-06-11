import java.util.PriorityQueue;
public class MinCostConnectRopes {
    public static int minCost(int[] arr, int N) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int rope : arr) {
            minHeap.add(rope);
        }
        int totalCost = 0;
        while (minHeap.size() > 1) {
            // Get the two shortest ropes
            int rope1 = minHeap.poll();
            int rope2 = minHeap.poll();
            int cost = rope1 + rope2;
            totalCost += cost;
            minHeap.add(cost);
        }

        return totalCost;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6};
        int N = 4;

        int minCost = minCost(arr, N);
        System.out.println("Minimum cost to connect ropes: " + minCost);
    }
}