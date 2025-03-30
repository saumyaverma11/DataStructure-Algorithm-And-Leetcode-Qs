import java.util.*;

public class spilitTheArray3046 {
    public static boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();


        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
            if(hm.getOrDefault(nums[i],0) == 3){
                return false;
            }
        }
        
        return true;
    } 
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4};
        boolean res= isPossibleToSplit(arr);
        System.out.println(res);
    }
}
