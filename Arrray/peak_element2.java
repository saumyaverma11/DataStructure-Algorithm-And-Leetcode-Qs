import java.util.*;

public class peak_element2 {
        public static int findPeakElement(int nums[]) {
            int n=nums.length;
            int low=0;
            int high=n-1;
    
            while(low<high){
                int mid=(low+high)/2;
                if((mid==0 || nums[mid-1]<nums[mid]) && (mid==n-1 || nums[mid+1]<nums[mid])){
                    return mid;
                }
                else if(nums[mid]<nums[mid+1]){
                    low=mid+1;
                }            
                else{
                    high=mid-1;
                }
            }
            return low;
        }
        public static void main(String args[]){
            int[] arr = {1,2,1,3,5,6,4};
            int index = findPeakElement(arr);
            System.out.println("Peak element is at index " + index);
        }
    }

