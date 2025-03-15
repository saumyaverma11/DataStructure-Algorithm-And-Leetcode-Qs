public class houseRobberForth2360 {
    public static int minCapability(int[] nums, int k) {
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
       for (int num : nums) {
           low = Math.min(low, num);
           high = Math.max(high, num);
       }
       
       while (low <= high) {
           int mid = low + (high - low) / 2;
           if (isPossible(nums, k, mid)) {
               high = mid - 1;
           } else {
               low = mid + 1;
           }
       }
       return low;
   }
   private static boolean isPossible(int[] nums, int k, int mid) {
       int i = 0;
       while (i < nums.length) {
           if (nums[i] <= mid) {
               k--;
               i++; // Skip adjacent
           }
           if (k==0) return true;
           i++;
       }
       return false;
   }

   public static void main(String[] args) {
    int nums[] = {2,3,5,9};
    int k = 2;
    int res =  minCapability(nums,k);
    System.out.println(res);
   }
}
