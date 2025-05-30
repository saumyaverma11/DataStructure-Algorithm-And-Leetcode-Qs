public class findPivotIndex724 {
    public static int pivotIndexBrute(int[] nums) {
        for(int i=0;i< nums.length;i++){
            int leftSum =0, rightSum=0;
            for(int j=0;j<i;j++){
                leftSum= leftSum + nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                rightSum= rightSum + nums[j];
            }
            if(leftSum == rightSum){
                return i;
            }
        }
       return -1;

    }

    public static int pivotIndexBetter(int[] nums){
        int prefix[]= new int[nums.length];

        prefix[0]= nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        int totalSum = prefix[prefix.length-1];
        for(int i=1;i<prefix.length;i++){
            int leftSum = prefix[i-1];
            int rightSum = totalSum - prefix[i];
            if(leftSum == rightSum ){
                return i;
            }
        }
        return -1;
    }


    public static int pivotIndexEfficient(int[] nums){
        int total = 0;
        for( int num : nums){
            total += num;
        }

        int leftSum =0;

        for(int i=0;i<nums.length;i++){
            int rightSum = total - leftSum - nums[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={1,7,3,6,5,6};
        int res = pivotIndexBrute(nums);
        System.out.println(res);

        int res2 = pivotIndexBetter(nums);
        System.out.println(res2);

        int res3 =pivotIndexEfficient(nums);
        System.out.println(res3);
    }
}
