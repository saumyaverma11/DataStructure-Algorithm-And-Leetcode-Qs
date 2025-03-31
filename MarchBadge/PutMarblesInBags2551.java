import java.util.*;


public class PutMarblesInBags2551 {
   
    public static long putMarbles(int[] weights, int k) {
        int n = weights.length;

        // Edge case: if k = 1, return 0
        if (k == 1) return 0;

        // Store pairs of adjacent sums
        long[] pairSum = new long[n - 1];
        for (int i = 0; i < n - 1; i++) {
            pairSum[i] = (long) weights[i] + weights[i + 1];
        }

        // Sort the pairs
        Arrays.sort(pairSum);

        // Calculate min and max scores
        long minScore = 0, maxScore = 0;
        for (int i = 0; i < k - 1; i++) {
            minScore += pairSum[i];                   // Smallest pairs for min score
            maxScore += pairSum[n - 2 - i];           // Largest pairs for max score
        }

        // Return the difference
        return maxScore - minScore;
    }

    public static void main(String[] args) {
        int[] weights1 = {1, 3, 5, 1};
        int k1 = 2;
        System.out.println(putMarbles(weights1, k1));  // Output: 4

        int[] weights2 = {1, 3};
        int k2 = 2;
        System.out.println(putMarbles(weights2, k2));  // Output: 0

        int[] weights3 = {10, 15, 20, 5, 25};
        int k3 = 3;
        System.out.println(putMarbles(weights3, k3));  // Output: 20
    }
}


