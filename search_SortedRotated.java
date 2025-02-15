import java.util.*;


public class search_SortedRotated{

    public static int search2(int  [] num, int t){
        int n=num.length;

        //o(n) time complexity


        int low = 0;
        int high = n-1;
        while(low<=high){
            if(num[low]==t){
                return low;
            }
            low++;
             if(num[high]==t){
                return high;
            }
            high--;
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        int n=nums.length;

        //o(logn) time complexity

        int low = 0;
        int high =n-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && nums[mid]>target){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(nums[mid]<target && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }


    public static void main(String args[]){
        int num[]={4,5,6,7,0,1,2};
        int target=0;

        int res = search2(num,target);
        System.out.println("efficient: " + res);


        int res2 = search(num,target);
        System.out.println("inefficient: " + res2);
    }
}

