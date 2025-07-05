import java.util.*;
public class luckyinteger1394
{
      public static int findLucky(int[] arr) {
        int hash[]= new int[501];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }
        boolean flag = true;
        int max= Integer.MIN_VALUE;
        for(int i=1;i<hash.length;i++){
            if ( i==hash[i]){
                flag = false;
                max = Math.max(max,hash[i]);
            }
        }
        if(!flag){
            return max;
        }
        else{
            return -1;
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {2,2,3,4};
        int res = findLucky(arr);
        System.out.println(res);
    }
}