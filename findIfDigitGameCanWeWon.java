public class findIfDigitGameCanWeWon{
     public static boolean canAliceWin(int[] nums) {
        int alice=0;
        int bob=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]<10){
                alice= alice + nums[i];
            }
            else{
                bob= bob + nums[i];
            }
        }
        if(alice>bob || bob>alice){
            return true;
        }
     return false;
    }
    public static void main(String[] args) {
        int nums[]= {1,2,3,4,10};
        boolean res = canAliceWin(nums);
        System.out.println(res);
    }
}