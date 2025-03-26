import java.util.*;

public class MinimumOpToMakeUniValueGrid2033 {
   
    
    public static int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int size = m * n;

        // Flatten the grid into a 1D array
        int[] arr = new int[size];
        int index = 0;

        for (int[] row : grid) {
            for (int num : row) {
                arr[index++] = num;
            }
        }

        // Check if all elements can be made uni-value
        int base = arr[0];
        for (int num : arr) {
            if ((num - base) % x != 0) {
                return -1;  // Not possible
            }
        }

        // Sort the array to find the median
        Arrays.sort(arr);
        int median = arr[size / 2];   // Median for minimum operations

        // Calculate the minimum operations
        int operations = 0;
        for (int num : arr) {
            operations += Math.abs(num - median) / x;
        }

        return operations;
    }

    public static void main(String[] args) {
        int[][] grid1 = {{2, 4}, {6, 8}};
        int x1 = 2;
        System.out.println(minOperations(grid1, x1));  // Output: 4

        int[][] grid2 = {{1, 5}, {2, 3}};
        int x2 = 1;
        System.out.println(minOperations(grid2, x2));  // Output: 5

        int[][] grid3 = {{1, 2}, {3, 4}};
        int x3 = 2;
        System.out.println(minOperations(grid3, x3));  // Output: -1
    }
}

