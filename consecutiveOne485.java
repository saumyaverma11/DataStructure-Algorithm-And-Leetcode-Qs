public class consecutiveOne485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int max=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
            }
            else{
                c=0;
            }
             max= Math.max(c,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        int res = findMaxConsecutiveOnes(arr);
        System.out.println(res);

    }
}
