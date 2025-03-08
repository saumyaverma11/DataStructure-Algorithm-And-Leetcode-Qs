public class minimumRecordKelementt2379 {
    


    public static int minRecolors(String blocks, int k) {
        int n = blocks.length();
        
        // Count 'W' in the first k-length window
        int whiteCount = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }
        }

        int minOperations = whiteCount;

        // Sliding window technique
        for (int i = k; i < n; i++) {
            // Remove the leftmost block from the window
            if (blocks.charAt(i - k) == 'W') {
                whiteCount--;
            }
            // Add the new rightmost block
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }
            
            // Update the minimum operations required
            minOperations = Math.min(minOperations, whiteCount);
        }

        return minOperations;
    }

    public static void main(String[] args) {
        System.out.println(minRecolors("WBBWWBBWBW", 7)); // Output: 3
        System.out.println(minRecolors("WBWBBBW", 2));    // Output: 0
    }

}
