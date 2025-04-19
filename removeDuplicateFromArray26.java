import java.util.ArrayList;
import java.util.HashMap;

public class removeDuplicateFromArray26 {
    public static int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.getOrDefault(nums[i],0) == 1){
                list.add(nums[i]);
            }
        }
        int j=0;
        int arr[]= new int[nums.length];
        for( int n : list){
            nums[j] = n;
            j++;
        }
    return list.size();
    }

    public static void main(String[] args) {
        int nums[]= {1,1,5,3,2,4,4,3,5,5};
        int res =removeDuplicates(nums);
        for(int i=0;i<res;i++){
        System.out.print(nums[i]);
     }
    }
}
