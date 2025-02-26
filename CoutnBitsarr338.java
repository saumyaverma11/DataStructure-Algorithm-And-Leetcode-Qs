import java.util.*;
public class CoutnBitsarr338 {

    public static int[] countBits(int n, int arr[]) {
      
      // int arr[]= new int[n+1];

      for(int i=0;i<n;i++){
              arr[i]= arr[1/2] + (i%2);
      }

        // for(int i=0;i<n+1;i++){
        //   System.out.println(arr[i]);
        // }
        return arr;
    }


  public static void main(String[] args) {
    int n =5;
    System.out.println("jeele");
    int arr[]= new int[n+1];
    int[] result = countBits(n,arr);
    // for(int i=0;i<n+1;i++){
    //   System.out.print(arr[i]+" ");
    // }
    System.out.println(Arrays.toString(result));
  }
}