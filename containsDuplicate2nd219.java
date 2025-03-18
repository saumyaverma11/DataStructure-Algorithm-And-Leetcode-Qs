import java.util.*;
public class containsDuplicate2nd219{
    public static boolean duplicate(int[] nums, int k) {

        int low =0;
        int high = 1;
        while(low<nums.length){
            while(high<nums.length && (high-low)<=k){
                if(nums[low]== nums[high]){
                    return true;
                }
                high++;
            }
            low++;
            high = low+1;
        }

        return false;
       
    }
    public static void main(String[] args) {
        int nums[]= {1,2,3,1};
        int k = 3;
        boolean res = duplicate(nums,k);
        System.out.println(res);
    }
}

