public class signOgTheProductOfArray1822{
    public static int arraySign(int[] nums) {
        long prod =1;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;
            }
        }

        int neg=0;
        for(int i =0;i<nums.length;i++){
        if(nums[i]<0){
            neg++;
        }
        }
        if(neg%2 == 0){
            return 1;
        }
        else if(neg%2 ==1){
            return -1;
        }
            return 0;
    }
    public static void main(String[] args) {
        int nums[]= {-1,-2,-3,-4,3,2,1};
        System.out.println(arraySign(nums));
    }
}