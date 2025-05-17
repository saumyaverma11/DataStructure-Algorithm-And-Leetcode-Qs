import java.util.*;

public class xorOperationInArray1486 {
    public static int xorOperation(int n, int start) {
        int nums[]= new int[n];
        for(int j =0;j<n;j++){
            nums[j] = start + 2 * j;
        }

         int result = 0;
        for(int i =0;i<nums.length;i++){
            result = result ^ nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt();
        int res = xorOperation(n,start);
        System.out.println(res);
    }
}
