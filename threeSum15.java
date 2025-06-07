import java.util.*;

public class threeSum15 {

    //  public List<List<Integer>> threeSum(int[] nums) {
        
    // }



    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4};
        int target=0;
        boolean val[]= {false,false,false};
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                for(int k=0;k<nums.length;k++)
                if(nums[i]+nums[j]+nums[k] == target){
                    val[i]=true;
                    val[j]= true;
                    val[k]= true;
                    System.out.println(nums[i]+" " +nums[j] +" "+nums[k]);
                }
            }
        }
        System.out.println(-1);
    }
}
