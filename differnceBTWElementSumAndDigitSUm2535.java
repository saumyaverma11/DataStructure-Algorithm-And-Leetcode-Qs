public class differnceBTWElementSumAndDigitSUm2535{
    public static int differenceOfSum(int[] nums) {
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum= sum + nums[i];
        }
        int sum2=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i] <10){
            sum2= sum2 + nums[i];
           }
           else {
            int n= nums[i];
            while(n>0){
                int r = n%10;
                sum2 += r;
                n= n/10;
            }
           }
        }
        return Math.abs(sum-sum2);
    }
    public static void main(String[] args) {
        int arr[]={1,15,6,3};
        int res =differenceOfSum(arr);
        System.out.println(res);
    }
}