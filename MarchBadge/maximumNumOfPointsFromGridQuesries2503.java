import java.util.*;

public class maximumNumOfPointsFromGridQuesries2503 {
    
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static int[] maxPoints(int[][] grid, int[] queries) {
        int m = grid.length, n = grid[0].length;
        int[] answer = new int[queries.length];

        // Store (value, index) pairs of queries to sort and track their original position
        int[][] queryPairs = new int[queries.length][2];
        for (int i = 0; i < queries.length; i++) {
            queryPairs[i][0] = queries[i];
            queryPairs[i][1] = i;
        }
        // Sort queries based on values
        Arrays.sort(queryPairs, (a, b) -> Integer.compare(a[0], b[0]));

        // Min-Heap for BFS: {value, row, col}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{grid[0][0], 0, 0});

        // Visited array to avoid counting the same cell twice
        boolean[][] visited = new boolean[m][n];
        visited[0][0] = true;

        int points = 0;
        int prevQuery = -1;

        for (int[] pair : queryPairs) {
            int query = pair[0];
            int index = pair[1];

            // Explore the grid while cells have smaller values than the query
            while (!pq.isEmpty() && pq.peek()[0] < query) {
                int[] curr = pq.poll();
                int val = curr[0], x = curr[1], y = curr[2];

                // Count points only on the first visit
                points++;

                // Move in all 4 directions
                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i], ny = y + dy[i];

                    if (nx >= 0 && ny >= 0 && nx < m && ny < n && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        pq.offer(new int[]{grid[nx][ny], nx, ny});
                    }
                }
            }

            // Store the result for this query
            answer[index] = points;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] grid1 = {{1, 2, 3}, {2, 5, 7}, {3, 5, 1}};
        int[] queries1 = {5, 6, 2};
        System.out.println(Arrays.toString(maxPoints(grid1, queries1)));  // Output: [5, 8, 1]

        int[][] grid2 = {{5, 2, 1}, {1, 1, 2}};
        int[] queries2 = {3};
        System.out.println(Arrays.toString(maxPoints(grid2, queries2)));  // Output: [0]
    }
}

