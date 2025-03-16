import java.util.Arrays;

public class minimumTimeRepairCar2594 {
     public static long repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks); // Sort to prioritize the fastest mechanics
        long left = 1, right = (long) ranks[0] * (long) cars * cars; // Set search space
        long ans = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (canRepairAllCars(ranks, cars, mid)) {
                ans = mid;
                right = mid - 1; // Try for a smaller time
            } else {
                left = mid + 1; // Increase the time limit
            }
        }
        return ans;
    }
      private static boolean canRepairAllCars(int[] ranks, int cars, long maxTime) {
        int repaired = 0;
        for (int rank : ranks) {
            long n = (long) Math.sqrt(maxTime / rank); // Solve for n using n^2 ≤ maxTime / rank
            repaired += n;
            if (repaired >= cars) return true; // If enough cars are repaired, return true
        }
        return false;
    }
    public static void main(String[] args) {
        int[] ranks1 = {4, 2, 3, 1};
        int cars1 = 10;
        System.out.println(repairCars(ranks1, cars1)); // Output: 16
    }
}
