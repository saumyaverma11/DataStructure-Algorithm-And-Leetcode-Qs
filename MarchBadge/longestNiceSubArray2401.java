public class longestNiceSubArray2401 {
    public static int niceSubArray(int nums[]){
        int left =0;
        int xor =0;
        int maxLen = 0;
        for(int right =0;right<nums.length;right++){
            while((xor & nums[right]) != 0){                      //find duplicate number 
                xor ^= nums[left];         //remove element
                left++;
            }
            xor ^= nums[right];      //add element
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,8,48,10};
        int res = niceSubArray(nums);
        System.out.println(res);
    }
}
