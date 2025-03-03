import java.util.*;
import java.util.PriorityQueue;


public class kthLargestElementInArray215 {
                           //Worst case Approach 
                            //Time complexity  o(nlogn)
                             //here the array traverse whole loop , means first sorted full array

    public static int findKthLargestNaive(int nums[], int k){
        Arrays.sort(nums);
        return nums[nums.length-k];

    }

    
    public static int findKthLargestefficient(int nums[], int k){
       PriorityQueue<Integer> pq =new PriorityQueue<>();
       for( int num :nums){
        pq.add(num);
        if(pq.size()>k){
            pq.poll();
        }
       }
       return pq.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
            int k = sc.nextInt();
            int result = findKthLargestNaive(arr,k);
            System.out.println(result);
            
            int res = findKthLargestefficient(arr,k);
            System.out.println(res);

        
    }
}
