 public class xorTwiceNumber3158 {
        public static int duplicateNumbersXOR(int[] nums) {
            int hash[] = new int[51];
            int xor= 0;
            for(int i=0;i<nums.length;i++){
                hash[nums[i]]++;
                 if(hash[nums[i]]==2){
                    xor ^= nums[i];
                }
            }
    
            return xor;
        }

        public static void main(String args[]){
            int nums[]={1,2,1,3};
            int res =  duplicateNumbersXOR(nums);
            System.out.println(res);
        }
}
