import java.util.*;

public class singleNumber2nd260{
    public static int[] singleNumber(int[] nums) {
       int arr[]= new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1); 
        }
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(hm.getOrDefault(nums[i],0) == 1){
                arr[idx]= nums[i];
                idx++;
            }
        } 
        return arr;
    }
    public static void main(String[] args) {
        int nums[]= {1,2,1,3,2,5};
        int res[] = singleNumber(nums);
        System.out.print(Arrays.toString(res));
    }
}