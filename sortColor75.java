import java.util.*;

public class sortColor75 {
    public static void dutch(int nums[]){
        int n= nums.length;
        int low =0;
        int mid = 0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else {
                int temp = nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
    public static void main(String args[]){
        int nums[]={2,0,2,1,1,0};
        dutch(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }  
}
