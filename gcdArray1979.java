import java.util.*;
public class gcdArray1979 {
  
  public static int func(int a, int b){
    if(b==0){
        return a;
    }
    return func(b,a%b);
  }

  public static int findGCD(int[] nums) {
    int a= Integer.MAX_VALUE;  //min
    int b= Integer.MIN_VALUE;  //max
    for(int i=0;i<nums.length;i++){
        if(nums[i]<a){
            a= nums[i];
        }
        if(nums[i]>b){
            b=nums[i];
        }
    }
      int res =  func(a,b);
      return res;
}
  public static void main(String[] args) {
    int arr[]= {7,5,6,8,3};
    int result = findGCD(arr);
    System.out.println(result);
  }
}