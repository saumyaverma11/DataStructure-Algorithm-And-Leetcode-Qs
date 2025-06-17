import java.util.ArrayList;
import java.util.List;

public class findAllNumbersDisappearredInanArray448 {
 public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
      int  num = nums.length;


        int hash[]= new int[num+1];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }

        for(int i=1;i<hash.length;i++){
            if(hash[i] == 0 ){
                list.add(i);
            }
        }

        return list;


    }    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
