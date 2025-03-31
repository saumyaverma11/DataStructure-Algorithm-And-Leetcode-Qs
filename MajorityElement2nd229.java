import java.util.*;

public class MajorityElement2nd229 {
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
            
        }
        for(int i =0;i<nums.length;i++){

            if(hm.getOrDefault(nums[i],0) > n/3)
            {
                if(!list.contains(nums[i])){
                     list.add(nums[i]);

                }
            }
        }
 



    //using hashSet
    
    // for( Integer key : hm.keySet())
    // {
    //     if(hm.get(key) > n/3){
    //         list.add(key);
    //     }
    // }


    //using EntrySet
    // Using EntrySet to iterate over key-value pairs
        // for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
        //     if (entry.getValue() > n / 3) {
        //         list.add(entry.getKey());
        //     }
        // }


        return list;
        
    }
    public static void main(String[] args) {
        int nums[] ={ 3,2,3};
        List<Integer> res = majorityElement(nums);
        System.out.println(res);;
    }
}
