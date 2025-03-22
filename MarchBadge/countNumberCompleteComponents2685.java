import java.util.*;
//yes
public class countNumberCompleteComponents2685 {
    
    
    public static int countCompleteComponents(int n, int[][] edges) {
        // Create adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Add edges to adjacency list
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        int completeComponents = 0;

        // Iterate over all vertices
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                dfs(i, graph, visited, component);

                // Check if the component is complete
                if (isComplete(component, graph)) {
                    completeComponents++;
                }
            }
        }

        return completeComponents;
    }

    // DFS to find the connected component
    private static void dfs(int node, List<List<Integer>> graph, boolean[] visited, List<Integer> component) {
        visited[node] = true;
        component.add(node);
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited, component);
            }
        }
    }

    // Check if the component is complete
    private static boolean isComplete(List<Integer> component, List<List<Integer>> graph) {
        int size = component.size();
        int edgeCount = 0;

        // Count the edges in the component
        for (int node : component) {
            for (int neighbor : graph.get(node)) {
                if (component.contains(neighbor)) {
                    edgeCount++;
                }
            }
        }
        
        // Each edge is counted twice in an undirected graph
        edgeCount /= 2;

        // Formula for a complete graph: size * (size - 1) / 2
        return edgeCount == (size * (size - 1)) / 2;
    }

    public static void main(String[] args) {
        int n1 = 6;
        int[][] edges1 = {{0,1}, {0,2}, {1,2}, {3,4}};
        System.out.println(countCompleteComponents(n1, edges1));  // Output: 3

        int n2 = 6;
        int[][] edges2 = {{0,1}, {0,2}, {1,2}, {3,4}, {3,5}};
        System.out.println(countCompleteComponents(n2, edges2));  // Output: 1
    }
}


