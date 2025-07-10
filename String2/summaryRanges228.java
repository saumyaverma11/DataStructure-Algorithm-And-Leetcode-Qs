import java.util.ArrayList;
import java.util.List;

public class summaryRanges228{
     public static List<String> summaryRanges(int[] nums) {
        List<String> strList = new ArrayList<>();
        if(nums.length == 0 ) return strList;
        int left = nums[0];
        int right = left;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1 != nums[i+1]){
                if(left == right){
                    strList.add(String.valueOf(left));
                }
                else{
                    strList.add(left+ "->" + right);
                }
                    left = nums[i+1];
                    right = nums[i+1];
            }
            else
            {
                    right = nums[i+1];
            }
        }

        if(left == right){
              strList.add(String.valueOf(left));
        }
        else{
              strList.add(left+ "->" + right);
        }


        return strList;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,5,6,8};
        List<String> list  = summaryRanges(arr);
        System.out.println(list.toString());
    }
}