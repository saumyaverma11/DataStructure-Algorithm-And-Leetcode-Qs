import java.util.HashMap;

public class singleNumber136 {
     public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }

  for(int  i=0;i<nums.length;i++){
    if(hm.getOrDefault(nums[i],0) == 1){
        return nums[i];
    }
  }
    return 0;
    }
    public static void main(String[] args) {
        int nums[]={1,1,2};
        int res = singleNumber(nums);
        System.out.println(res);
    }
}
