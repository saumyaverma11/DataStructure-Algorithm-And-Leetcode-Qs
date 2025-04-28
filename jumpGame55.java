public class jumpGame55 {
    public static boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int last = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i] >= last){
                last = i ;
            }
        }
        return last==0;
    }
    public static void main(String[] args) {
        int nums[]= {2,3,1,1,4};
        boolean res =canJump(nums);
        System.out.println(res);
    }
}
