public class SumofUniqueElememt1748 {
    public static int sumOfUnique(int[] nums) {
        int n = nums.length;
        int hash[]= new int[101];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(hash[i]==1){
                sum = sum + nums[i];
            }

        }
        return sum;
    }

    public static void main(String args[]){
        int nums[] = {1,2,3,2};
        int res =sumOfUnique(nums);
        System.out.println(res); 
    }
}
