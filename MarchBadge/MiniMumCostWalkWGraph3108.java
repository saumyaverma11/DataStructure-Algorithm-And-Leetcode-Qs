import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MiniMumCostWalkWGraph3108 {
    
    // Disjoint-set find function
    private static int find(int[] dsuf, int v) {
        if (dsuf[v] == -1) {
            return v;
        }
        return dsuf[v] = find(dsuf, dsuf[v]); // Path compression
    }

    // Traverse a component and compute bitwise AND
    private static void traverseComponent(int[] bitwiseAnd, int curr, boolean[] visited, List<List<int[]>> adj) {
        visited[curr] = true;
        for (int[] edge : adj.get(curr)) {
            int nbr = edge[0], wt = edge[1];
            bitwiseAnd[0] &= wt; // Update bitwise AND
            if (!visited[nbr]) {
                traverseComponent(bitwiseAnd, nbr, visited, adj);
            }
        }
    }

    public static int[] minimumCost(int n, int[][] edges, int[][] query) {
        // Step 1: Initialize disjoint-set and adjacency list
        int[] dsuf = new int[n];
        Arrays.fill(dsuf, -1);
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Build adjacency list and union components
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], wt = edge[2];
            adj.get(u).add(new int[]{v, wt});
            adj.get(v).add(new int[]{u, wt});

            int px = find(dsuf, u);
            int py = find(dsuf, v);
            if (px != py) {
                dsuf[px] = py; // Union
            }
        }

        // Step 2: Precompute minimum walk cost (bitwise AND) for each component
        Map<Integer, Integer> parentCost = new HashMap<>();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                // If a vertex has no adjacent edges, set cost to 0
                int[] bitwiseAnd = new int[]{adj.get(i).isEmpty() ? 0 : adj.get(i).get(0)[1]};
                traverseComponent(bitwiseAnd, i, visited, adj);
                int parent = find(dsuf, i);
                parentCost.put(parent, bitwiseAnd[0]);
            }
        }

        // Step 3: Answer each query
        int[] ans = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            int px = find(dsuf, query[i][0]);
            int py = find(dsuf, query[i][1]);
            if (px == py) {
                ans[i] = parentCost.get(px);
            } else {
                ans[i] = -1;
            }
        }

        return ans;
    }

    // Main method for testing
    public static void main(String[] args) {

        // Test Case 1:
        // Example from the prompt:
        int n1 = 5;
        int[][] edges1 = { {0, 1, 7}, {1, 3, 7}, {1, 2, 1} };
        int[][] query1 = { {0, 3}, {3, 4} };
        int[] result1 = minimumCost(n1, edges1, query1);
        System.out.println("Test Case 1 Output: " + Arrays.toString(result1));
        // Expected Output: [1, -1]

        // Test Case 2:
        int n2 = 3;
        int[][] edges2 = { {0, 2, 7}, {0, 1, 15}, {1, 2, 6}, {1, 2, 1} };
        int[][] query2 = { {1, 2} };
        int[] result2 = minimumCost(n2, edges2, query2);
        System.out.println("Test Case 2 Output: " + Arrays.toString(result2));
        // Expected Output depends on connectivity and computed bitwise AND (e.g., [0] if the optimal walk produces 0)
    }
}
