import java.lang.reflect.Array;
import java.util.Arrays;

public class transformArrayByParity3467{
     public static int[] transformArray(int[] nums) {
        int arr[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 ==0 ){
                arr[i]= 0;
            }
            else{
                arr[i]=1;
            }
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        int nums[]= {4,3,2,1};
        int arr[]= transformArray(nums);
        System.out.println(Arrays.toString(arr));
    }
}