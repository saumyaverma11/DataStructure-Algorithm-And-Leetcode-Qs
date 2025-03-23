public class divideArrayEqualPairs2206 {
    public static boolean divideArrayNaive(int[] nums) {
        int n = nums.length;
        int result =0;
        boolean arr[] = new boolean[nums.length];
        int pairsN = n/2;
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n;j++){
                if(arr[i]==true){
                    continue;
                }
                if(arr[j]==true){
                    continue;
                }
                else if(nums[i]==nums[j]){
                    arr[i]= true;
                    arr[j]= true;
                    result++;
                  
                }
            }

        }
        if(result == pairsN){
            return true;
        }
       return false; 
    }
//using hash

    public static boolean divideArrayefficient(int [] nums){
        int hash[] = new int[501];
        for(int i  =0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(hash[nums[i]]%2==1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]= {3,2,3,2,2,2};
        boolean res = divideArrayNaive(arr);
        System.out.println(res);
        boolean res2 = divideArrayefficient(arr);
        System.out.println(res2);
    }
}
