import java.util.*;

public class threeSum15 {



    public static void naiven3approach(int []nums){
         int n = nums.length;

        java.util.Arrays.sort(nums);  // Important to handle duplicates easily

        for (int i = 0; i < n - 2; i++) {
            // skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 1; j++) {
                // skip duplicates for j
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                for (int k = j + 1; k < n; k++) {
                    // skip duplicates for k
                    if (k > j + 1 && nums[k] == nums[k - 1]) continue;

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                    }
                }
            }
        }
    }



     public static List<List<Integer>> efficientUsinglist(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+ nums[left]+ nums[right];
                if(sum == 0){
                    List<Integer> triplets = new ArrayList<>();
                    triplets.add(nums[i]);
                    triplets.add(nums[left]);
                    triplets.add(nums[right]);
                    result.add(triplets);
                    while(left< right && nums[left] == nums[left+1]) 
                    left++;
                    while(left<right && nums[right] == nums[right-1])
                    right--;

                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};



        naiven3approach(nums);
        List<List<Integer>> list = new ArrayList<>(efficientUsinglist(nums));
        System.out.println(list);
       
    }
}



