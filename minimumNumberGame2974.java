import java.lang.reflect.Array;
import java.util.*;

public class minimumNumberGame2974{
     public static int[] numberGame(int[] nums) {
        int arr[] = new int[nums.length];
        int n = nums.length;
        Arrays.sort(nums);
        int idx=0;
        for(int i =0;i<nums.length;i+=2){
            arr[idx++] = nums[i+1];
            arr[idx++] = nums[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[]={5,4,2,3};
        int arr[]=numberGame(nums);
        System.out.println(Arrays.toString(arr));
    }
}