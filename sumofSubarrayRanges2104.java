public class sumofSubarrayRanges2104{
    public static long subArrayRangesNaive(int nums[]){

        long sumOfDiff=0;
        
        for(int i=0;i<nums.length;i++){
            int min = nums[i];
            int max = nums[i];
            for(int j=i+1;j<nums.length;j++){
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                sumOfDiff = sumOfDiff + (max-min);
            }
        }
        return sumOfDiff;
    }
    public static void main(String[] args) {
        int nums[]= {1,2,3};
        System.out.println(subArrayRangesNaive(nums));
        int arr[]= {4,-2,-3,4,1};
        System.out.println(subArrayRangesNaive(arr));

      

    }
}