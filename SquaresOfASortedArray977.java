import java.util.*;


public class SquaresOfASortedArray977 {

    public static int[] SquareArray(int nums[]){
        int nums2[] = new int[nums.length];

        for(int  i=0;i<nums.length;i++){
            nums2[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums2);
        return nums2;
    }
    public static void main(String[] args) {
        int nums[]= { -4,-1,0,3,10};
        int arr[] = SquareArray(nums);
        System.out.println(Arrays.toString(arr));
    }
}
