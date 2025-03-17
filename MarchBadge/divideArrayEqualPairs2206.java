public class divideArrayEqualPairs2206 {
    public static boolean divideArray(int[] nums) {
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
    public static void main(String[] args) {
        int arr[]= {3,2,3,2,2,2};
        boolean res = divideArray(arr);
        System.out.println(res);
    }
}
