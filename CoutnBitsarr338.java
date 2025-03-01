import java.util.*;
public class CoutnBitsarr338 {

    public static int[] countBits(int n, int arr[]) {
        int nums[] = new int[n+1];
      for(int i=1;i<=n;i++){
              nums[i]= nums[i/2] + (i%2);
      }
        return nums;
    }


  public static void main(String[] args) {
    int n =5;
    System.out.println("jeele");
    int arr[]= new int[n+1];
    int[] result = countBits(n,arr);
    
    System.out.println(Arrays.toString(result));
  }
}