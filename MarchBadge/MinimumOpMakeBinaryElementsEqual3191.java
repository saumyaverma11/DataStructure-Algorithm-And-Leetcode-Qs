public class MinimumOpMakeBinaryElementsEqual3191{
    public static int minOperations(int[] nums) {
        int n = nums.length;

        // Edge case: If the length is less than 3, it's impossible to flip consecutive 3
        if (n < 3) {
            for (int num : nums) {
                if (num == 0) return -1;  // Impossible if any 0 exists
            }
            return 0;  // Already all 1s
        }

        int operations = 0;

        for (int i = 0; i <= n - 3; i++) {
            // If the current element is 0, flip the next 3 elements
            if (nums[i] == 0) {
                flip(nums, i);
                operations++;
            }
        }

        // After all possible flips, check if all elements are 1
        for (int num : nums) {
            if (num == 0) return -1;  // Impossible case
        }

        return operations;
    }

    // Helper method to flip 3 consecutive elements
    private static void flip(int[] nums, int i) {
        for (int j = 0; j < 3; j++) {
            nums[i + j] = 1 - nums[i + j];  // Flip 0 → 1, 1 → 0
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 1, 1, 0, 0};
        System.out.println("Minimum Operations: " + minOperations(nums1));  

        int[] nums2 = {0, 1, 1, 1};
        System.out.println("Minimum Operations: " + minOperations(nums2));  
    }
}