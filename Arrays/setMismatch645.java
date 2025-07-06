import java.util.Arrays;

public class setMismatch645 {
     public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int hash[]= new int[n+1];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        int arr[]= new int[2];
        for(int i=1;i<hash.length;i++){
            if(hash[i]==2){
                arr[0]= i;
            }
            else if(hash[i]==0){
                arr[1]=i;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[]= {1,2,2,4};
        int[] res = findErrorNums(nums);
        System.out.println(Arrays.toString(res));
    }
}
