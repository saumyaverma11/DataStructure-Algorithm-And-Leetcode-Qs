import java.util.*;

public class targetIndicesafterSort2089 {
     public static ArrayList<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i]== target){
                list.add(i);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        int nums[]= {1,2,5,2,3};
        int target = 2;
        ArrayList<Integer> result = targetIndices(nums, target);
        System.out.println("Target Indices: " + result);
    }
}
