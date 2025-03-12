public class maxPosAndNeg2529 {

    //O(n)

    public static int maxNaive(int[] nums) {
        int n = nums.length;
        int high = n-1;
        int mid =0;
        int pos=0,neg=0;
        while(mid<=high)
        {
            if(nums[mid]<0){
                neg++;
                mid++;
            }
            else if(nums[mid]==0){
                mid++;
            }
            else{
                pos++;
                high--;
            }
        }

        return Math.max(neg,pos);

    }
    public static void main(String[] args) {
        int nums[]= {-1,-3,-5,0,0,1,4,8};
        int res = maxNaive(nums);
        System.out.println(res);
        // int res2 =  maxEfficient(nums);
        // System.out.println(res2);
    }

}
