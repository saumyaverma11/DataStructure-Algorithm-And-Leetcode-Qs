public class maximumAscendingSubArraysum1800 {

    public static int maxAscendingSum(int[] nums) {
        if(nums.length ==0){
            return 0;
        }
    int max =nums[0];

    int currsum = nums[0];
    for(int i =1;i<nums.length;i++){
        if(nums[i-1]<nums[i]){
            currsum = currsum + nums[i];
        }
        else{
            currsum = nums[i];
        }
       max= Math.max(currsum,max);
    }
    return max;
    } 

    public static void main(String[] args) {
        int nums[]={10,20,30,5,10,50};
        int res = maxAscendingSum(nums);
        System.out.println(res);
    }
}
