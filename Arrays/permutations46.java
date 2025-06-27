import java.util.*;

public class permutations46 {
      public static List<List<Integer>> getPermutation (int nums[], int idx, List<List<Integer>> list){
        int n = nums.length;
        if(idx == n){
            ArrayList<Integer> newList = new ArrayList<>();
            for( int num : nums){
                newList.add(num);
            }
            list.add(newList);
            return new ArrayList<>(0);
        }
       for(int i =idx; i<nums.length;i++){
        swap(nums, idx, i);
        getPermutation(nums, idx+1, list);
        swap(nums,idx,i);
       }
               return list;

    }
    
    public static void swap(int arr[] , int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        getPermutation(nums, 0, list);
        return list;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        System.out.println("enter distinct element: ");
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        List<List<Integer>> result = permute(nums);
        System.out.print("[ ");
        for(List<Integer> L : result){
            System.out.print(L+" ");
        }
        System.out.println("]");
    }
}
