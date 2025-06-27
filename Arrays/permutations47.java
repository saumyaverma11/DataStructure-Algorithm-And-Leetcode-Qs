import java.util.*;

public class permutations47 {
      public static List<List<Integer>> getPermutation(int nums[], int idx, List<List<Integer>> list){

        //Base Case: - In which we create a newlist for the new array elemenet and also if the list not contains the another list then we add this for remove duplicacy .

            int n = nums.length;
        if(idx == n){
            ArrayList<Integer> newList = new ArrayList<>();
            for( int num: nums){
                newList.add(num);
            }

            /// it contains methos take O(n) complexity for check every permutation every time 
            // so we create a simple boolean array instead of checking it , boolean array works on onky O(1) time.

            // if(!list.contains(newList)){
            //     list.add(newList);
            // }
            list.add(newList);
            return new ArrayList<>(0);
        }
        boolean visited[]= new boolean[21];    
         // we take 21 because of constraints -10 to 10  and we know that the index start with 0 so we assume -10 as 0 and then boolean array size is 10+10+1 extra = 21 and also use visited[nums[i]+10]
        for(int i= idx;i<nums.length;i++){

            //so we create a boolean array here to mark the permutations 

            if(!visited[nums[i]+10]){
                visited[nums[i]+10] = true;
            swap(nums, idx, i);
            getPermutation(nums, idx+1,list);
            swap(nums, idx, i);
            }

        }


        return list;

    }
    public static void swap( int arr[], int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<List<Integer>> result = getPermutation(nums, 0, list);
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        System.out.println("enter element  Even it is same: ");
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        List<List<Integer>> result = permuteUnique(nums);
        System.out.print("[ ");
        for(List<Integer> L : result){
            System.out.print(L+" ");
        }
        System.out.println("]");
    }
    
}
