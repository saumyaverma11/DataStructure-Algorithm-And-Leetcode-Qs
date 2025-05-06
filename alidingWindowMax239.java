import java.util.ArrayList;
import java.util.*;

public class alidingWindowMax239{
    
    public static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(k==1){
            return nums;
        }
        
        int max=Integer.MIN_VALUE;
        int i;
        for(i =0;i<k;i++){
            max= Math.max(max,nums[i]);
        }
        list.add(max);
        int left = 1;
        int right = k ;
        while(right<nums.length){
          
            if(nums[left-1]== max){
                max= nums[left];
            
            for(i = left+1 ; i<=right;i++){
                if(nums[i]>max){
                    max= nums[i];
                }
            }
        }
               else if(max<nums[right]){
                    max= nums[right];
                }
            
            
                list.add(max);
            right++;
            left++;
        }

        return list.stream().mapToInt(j -> j).toArray();

    }

    public static void main(String[] args) {
        int nums[]= {1,3,-1,-3,5,3,6,7};
        int k=3;
        int arr[]= maxSlidingWindow(nums,k);
        System.out.println(Arrays.toString(arr));
    }
}