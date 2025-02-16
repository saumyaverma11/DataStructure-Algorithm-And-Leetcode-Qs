
import java.util.*;

public class minimumInSortedRotatedArray2nd154 {
    public static int findMin1Way(int[] nums) {
        int n = nums.length;
        int low =0;
        int high=n-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else if(nums[mid]<nums[high]){
                high = mid;
            }
            else{
                high--;
            }
        }
        return nums[low];
    }

    public static int findMin2Way(int[] nums) {
        int n = nums.length;

        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                return nums[i];
            }
        }
         return nums[0];
    }

    public static int findMin3Way(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                return nums[i];
            }
            else if(nums[i-1]<nums[i]){
                return nums[i-1];
            }
        }
        return nums[n-1];
    }


    public static void main(String args[]){
        int arr[]={1,3,5};
        int res1  = findMin1Way(arr);
        System.out.println(res1);
        int res2  = findMin2Way(arr);
        System.out.println(res2);
        int res3  = findMin3Way(arr);
        System.out.println(res3);
        
    }
}
