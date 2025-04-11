public class searchInsertPosition35 {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low= mid+1;
            }
        }
        return high+1;
    }
    public static void main(String[] args) {
        int nums[]= {1,3,5,6};
        int target=2;
        int res = searchInsert(nums,target);
        System.out.println(res);
    }
}
