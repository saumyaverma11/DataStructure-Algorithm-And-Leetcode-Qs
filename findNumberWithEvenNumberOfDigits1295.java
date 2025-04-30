public class findNumberWithEvenNumberOfDigits1295{
    public static int findNumbers(int[] nums) {
        int l=0;
        for(int i =0;i<nums.length;i++){
            int num = nums[i];
            int d=0;
            int c=0;
            while(num>0){
                int r = num%10;
                d = d + r;
                num=num/10;
                c++;
            }
            if(c%2==0){
                l++;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int nums[]={12,345,2,6,7896};
        int res = findNumbers(nums);
        System.out.println(res);
    }
}