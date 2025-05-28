import java.util.*;
public class containsDuplicate217 {
     public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        boolean res = containsDuplicate(nums);
        System.out.println(res);
        int arr[]={1,2,7,8};
        boolean res2 = containsDuplicate(arr);
        System.out.println(res2);
    }
}
