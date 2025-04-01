import java.util.*;

public class SubArraySumEqualsK560 {
        public static void main(String[] args) {
            int arr[]= {10,2,-2,-20,10};
            int k= -10;
    
    
            HashMap<Integer, Integer> map = new  HashMap<>();
            int count=0;
            int sum =0;
            int ans =0;
            map.put(0,1);
    
            for(int j =0;j<arr.length;j++){
                sum = sum + arr[j];
                if(map.containsKey(sum-k)){
                    ans = ans + map.get(sum-k); 
                }
            
                    map.put(sum,map.getOrDefault(sum,0)+1);
                
            }
            System.out.println(" The number of subarray whose sum is=equal to "+ k + "is "+ ans);
    
        }
    
}
