import java.util.*;

public class minimumInSortedRotatedArray{
   
        public static int findMin(int[] nums) {
            int n= nums.length;
            for(int i=1;i<n;i++){
                if(nums[i]<nums[i-1]){
                    return nums[i];
                }
            }
             return nums[0];
        }
        public static void main(String args[]){
            int [] nums = {4,5,6,7,1,2,3};
            int result =  findMin(nums);
            System.out.println(result);
        }
}