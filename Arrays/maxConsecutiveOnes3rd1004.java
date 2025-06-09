public class maxConsecutiveOnes3rd1004 {
     public static int longestOnes(int[] nums, int k) {
        int window = 0;
        int ans =0;
        int left =0;
        int n= nums.length;
        for(int right=0;right<n;right++){
            window = window + nums[right];
            while(window + k < right - left +1){
               window = window - nums[left];
               left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }

    public static int longestOnesOtherWay(int nums[], int k){
        int zeroCount=0;
        int left=0;
        int ans =0;

        for(int right =0;right<nums.length;right++){
            if(nums[right]==0){
                zeroCount++;
            }

            while(zeroCount > k){
                if(nums[left]==0){
                    zeroCount--;
                }
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
    public static void main(String args[]){
        int nums[]= {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3;
        int res = longestOnes(nums,k);
        System.out.println(res);
    }
}
