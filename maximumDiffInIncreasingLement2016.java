public class maximumDiffInIncreasingLement2016 {
    public static int maxValueDiff(int nums[]){
        int minValue = nums[0];
        int maxValue = -1;
        for(int i = 1; i < nums.length;i++){
            if(minValue < nums[i]){
                maxValue = Math.max(maxValue,nums[i]-minValue);
            }
            if(minValue > nums[i]){
                minValue = nums[i];
            }
        }
        return maxValue;
    }
    public static int maximumDifference(int[] nums) {
        
        int count =0;
        int max= -1;  
        int res = maxValueDiff(nums);
        return res;
    }
    public static void main(String[] args) {
        int nums[]= {7,1,5,4};
        int res = maximumDifference(nums);
        System.out.println(res);
    }

}
