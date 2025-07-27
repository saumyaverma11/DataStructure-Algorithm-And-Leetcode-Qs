public class monotanicarray896{
    
    public static boolean inc(int nums[]){
        for(int i=0;i<nums.length-1;i++){
                if(nums[i]>nums[i+1]){
                return false;
               }
        }
        return true;
    }
    public static boolean dec(int nums[]){
        for(int i=0;i<nums.length-1;i++){
                if(nums[i]<nums[i+1]){
                    return false;
                }
        }
        return true;
    }
    public static boolean isMonotonic(int[] nums) {
        return inc(nums) || dec(nums);
    }
    public static void main(String args[]){
        int arr[] ={1,2,2,3};
        boolean res = isMonotonic(arr);
        System.out.print(res);
    }
}