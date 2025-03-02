
import java.util.*;

public class ApplyOprOnAnArray2468{
    public static int[] applyOperations(int[] nums) {
        int n= nums.length;
        
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1] && nums[i]!=0){
                nums[i] = nums[i]*2;
                nums[i+1]=0;
            }
        }
      
        int low=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]= nums[low];
                nums[low]= temp;
                low++;
            }
        }
      return nums;
    }   
    public static void main(String[] args) {
        int arr[]={1,2,2,1,1,0};
        int result [] = applyOperations(arr);
        System.out.println(Arrays.toString(result));

    }
}

