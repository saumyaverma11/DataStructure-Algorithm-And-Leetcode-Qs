import java.util.*;
public class twosum {
    
        public static int[] twoSumNaive(int []nums,int target){
            
        for(int i =0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];

        }

           public static int[] twoSumHash(int []nums,int target){
 HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp =  target - nums[i];
            if(hm.containsKey(comp)){
                return new int[]{hm.get(comp),i};
            }
            hm.put(nums[i],i);
        }
        return new int[0];

           }

           public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int[] res = twoSumNaive(arr, 9);
        System.out.println(Arrays.toString(res));
           int[] res2 = twoSumHash(arr, 9);
        System.out.println(Arrays.toString(res2));

    }
}
