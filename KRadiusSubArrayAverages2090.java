import java.util.Arrays;

public class KRadiusSubArrayAverages2090 {


    public static int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];

        // Step 1: Fill all with -1 initially
        Arrays.fill(arr, -1);

        // Step 2: Edge case – window not possible
        if (k == 0) return nums;
        if (n < 2 * k + 1) return arr;

        // Step 3: Sliding window sum
        long window = 0;
        int left = 0;
        int right = 2 * k;
        int count = 2 * k + 1;

        // Initial window
        for (int i = left; i <= right; i++) {
            window += nums[i];
        }

        arr[k] = (int)(window / count);
        int i = k + 1;
        right++;

        // Slide the window
        while (right < n) {
            window += nums[right];
            window -= nums[left];
            arr[i] = (int)(window / count);
            left++;
            right++;
            i++;
        }

        return arr;
    }

    // Optional: Testing main method
    public static void main(String[] args) {
        KRadiusSubArrayAverages2090 sol = new KRadiusSubArrayAverages2090();
        int[] nums = new int[100000];
        Arrays.fill(nums, 1);  // You can change values here
        int k = 40000;

        int[] result = sol.getAverages(nums, k);
        System.out.println("Sample output from center:");
        System.out.println(Arrays.toString(Arrays.copyOfRange(result, k - 2, k + 3)));
    }


}