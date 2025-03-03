import java.util.*;

public class PartitionArrayAccToPivot2161 {

        public static int[] pivotArray(int[] nums, int pivot) {
          int n = nums.length;
       
        //optimized                using two pass Apprach
        
    
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                list.add(nums[i]);
            }
    
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                list.add(nums[i]);
            }
    
        }
    
        for(int i =0;i<n;i++){
            if(nums[i]>pivot){
                list.add(nums[i]);
            }
        }
        
            return list.stream().mapToInt(i -> i).toArray();
    }
    
    public static int[] pivotArrayStream(int [] nums, int pivot) {
       
    
                         //***    //More Optimized using List+ Stream Apprach     ***
    
            List<Integer> list = new ArrayList<>();
    
            // Pass 1: Chhoti Values
            list.addAll(Arrays.stream(nums).filter(num -> num < pivot).boxed().toList());
    
            // Pass 2: Pivot Values
            list.addAll(Arrays.stream(nums).filter(num -> num == pivot).boxed().toList());
    
            // Pass 3: Badi Values
            list.addAll(Arrays.stream(nums).filter(num -> num > pivot).boxed().toList());
    
            // Convert List to Array
            return list.stream().mapToInt(i -> i).toArray();
    
        
        //In this program we can't use Two pointer Apprach because it not gives maintained order .
    
    }
    
    public static void main(String[] args) {
        int [] nums = {9,12,5,10,14,3,10};
        int pivot = 10;

        int num[] = pivotArray(nums,pivot);
        System.out.println(Arrays.toString(num));
        int num2[] = pivotArrayStream(nums, pivot);
        System.out.println(Arrays.toString(num2));
    }
}
