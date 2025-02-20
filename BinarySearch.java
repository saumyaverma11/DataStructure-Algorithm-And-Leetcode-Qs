import java.util.*;
public class BinarySearch {
  public static int search(int[] nums, int target) {
    int n = nums.length;
    int low=0;
    int high= n-1;
    while(low<=high){
        int mid= low +(high-low)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            low=mid+1;
        }
        else{
            high=high-1;
        }
    }
    return -1;
}
  public static void main(String[] args) {
    int nums[]={-1,0,3,5,9,12};
    int target = 9;

    int result = search(nums, target);
    System.out.println("index is: " + result);
  }
}