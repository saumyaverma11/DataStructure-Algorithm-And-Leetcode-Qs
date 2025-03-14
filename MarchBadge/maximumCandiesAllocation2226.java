public class maximumCandiesAllocation2226 {
        public static int maximumCandies(int[] candies, long k) {
            // If total candies are less than children, return 0
          long totalCandies = 0;
            for (int c : candies) totalCandies += c;
            if (totalCandies < k) return 0;
    
            int low = 1, high = getMax(candies);
            int result = 0;
    
            while (low <= high) {
                int mid = low + (high - low) / 2;
                
                if (canDistribute(candies, (long) k, mid)) { // Cast k to long
                    result = mid; // Store valid result
                    low = mid + 1; // Try for a larger value
                } else {
                    high = mid - 1; // Reduce candies per child
                }
            }
    
            return result;
        }
    
        private static boolean canDistribute(int[] candies, long k, int mid) {
            long count = 0;
            for (int c : candies) {
                count += c / mid; // Number of children that can be served from this pile
            }
            return count >= k; // Compare with long k
        }
    
        // Helper function to find max value in the array
        private static  int getMax(int[] candies) {
            int max = 0;
            for (int c : candies) {
                if (c > max) max = c;
            }
            return max;
        }
    public static void main(String[] args) {
        int[] candies1 = {5, 8, 6};
        int k1 = 3;
        System.out.println(maximumCandies(candies1, k1)); // Output: 5
    }

}
