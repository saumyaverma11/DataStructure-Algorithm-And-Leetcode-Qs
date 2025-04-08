import java.util.HashMap;
import java.util.Map;

public class subArraySumEqualsToK529 {

    public static int brute(int nums[], int k){
        int count=0;
        for(int i=0;i<nums.length;i++){
            int currSum=0;
            for(int j=i;j<nums.length;j++){
                currSum = currSum + nums[j];
                if(currSum==k){
                    count++;
                }
            }

        }
        return count;
    }
    public static int optimized(int nums[], int k){
 int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize with sum 0 occurring once

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
     

    }

    
    public static void main(String[] args) {
        int nums[]= {1,1,1};
        int k=2;
        int res = brute(nums,k);
        System.out.println(res);
        int res2 = optimized(nums,k);
        System.out.println(res2);

    }
}
