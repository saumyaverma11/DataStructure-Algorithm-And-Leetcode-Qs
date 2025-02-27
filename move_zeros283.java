import java.util.*;

public class move_zeros283 {
    public static void moveZeroes(int nums[]){
        int low=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]= nums[low];
                nums[low]= temp;
                low++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
            }

    }  
}
