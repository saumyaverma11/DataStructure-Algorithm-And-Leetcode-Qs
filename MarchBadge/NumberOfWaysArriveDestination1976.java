import java.util.*;

public class NumberOfWaysArriveDestination1976 {

    private static final int MOD = 1_000_000_007;  // Define MOD at the class level

    public static int countPaths(int n, int[][] roads) {
        List<List<int[]>> graph = new ArrayList<>();

        // Initialize the graph
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build the graph
        for (int[] road : roads) {
            int u = road[0], v = road[1], time = road[2];
            graph.get(u).add(new int[]{v, time});
            graph.get(v).add(new int[]{u, time});
        }

        // Dijkstra's Algorithm
        long[] time = new long[n];        // To store the shortest time to reach each node
        long[] ways = new long[n];        // To store the number of ways to reach each node
        Arrays.fill(time, Long.MAX_VALUE);
        ways[0] = 1;                      // One way to reach the start point
        time[0] = 0;

        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[1]));
        pq.offer(new long[]{0, 0});       // [node, time]

        while (!pq.isEmpty()) {
            long[] curr = pq.poll();
            int node = (int) curr[0];
            long currTime = curr[1];

            if (currTime > time[node]) continue;

            for (int[] neighbor : graph.get(node)) {
                int nextNode = neighbor[0];
                long travelTime = neighbor[1];

                long newTime = currTime + travelTime;

                if (newTime < time[nextNode]) {
                    time[nextNode] = newTime;
                    ways[nextNode] = ways[node];
                    pq.offer(new long[]{nextNode, newTime});
                } else if (newTime == time[nextNode]) {
                    ways[nextNode] = (ways[nextNode] + ways[node]) % MOD;
                }
            }
        }

        return (int) (ways[n - 1] % MOD);
    }

    public static void main(String[] args) {
      
        // Example 1
        int n1 = 7;
        int[][] roads1 = {
            {0, 6, 7}, {0, 1, 2}, {1, 2, 3}, {1, 3, 3}, {6, 3, 3}, 
            {3, 5, 1}, {6, 5, 1}, {2, 5, 1}, {0, 4, 5}, {4, 6, 2}
        };
        System.out.println(countPaths(n1, roads1));  // Output: 4

        // Example 2
        int n2 = 2;
        int[][] roads2 = {{1, 0, 10}};
        System.out.println(countPaths(n2, roads2));  // Output: 1
    }
}
