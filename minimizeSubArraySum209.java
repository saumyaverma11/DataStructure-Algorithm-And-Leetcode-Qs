public class minimizeSubArraySum209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int n= nums.length;
        int left=0;
        int sum =0;
        int minlen= Integer.MAX_VALUE;
        for(int right=0; right<n ;right++){
            sum = sum + nums[right];
            while(sum>=target){
                minlen= Math.min(minlen,right-left+1);
                sum = sum - nums[left];
                left++;
            }
        }
     

        return (minlen ==  Integer.MAX_VALUE)? 0 : minlen;
    }
    public static void main(String[] args) {
        int nums[]= { 2,3,1,2,4,3};
        int target =7;
        int res = minSubArrayLen(target, nums);
        System.out.println(res);
    }
}
