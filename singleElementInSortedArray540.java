import java.util.HashMap;

public class singleElementInSortedArray540 {
     public static int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int i =0;i<nums.length;i++){
            if(hm.getOrDefault(nums[i],0) == 1){
                return nums[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int nums[]={1,1,2,3,3,4,4,8,8};
        int res =singleNonDuplicate(nums);
        System.out.println(res);
    }
}
