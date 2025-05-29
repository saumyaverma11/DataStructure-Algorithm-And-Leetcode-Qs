import java.util.*;
public class sortAnArray912 {
     public static void merge(int nums[], int si, int mid, int ei){
        int first =si;
        int second = mid+1;
        int k=0;
        int temp[]=new int[ei-si+1];

        while(first<=mid && second <=ei){
            if(nums[first]<=nums[second]){
                temp[k++]= nums[first++];
            }
            else if(nums[first]>nums[second]){
                temp[k++]= nums[second++];
            }
        }

            while(first<=mid){
                temp[k++]= nums[first++];
            }
            while(second <=ei){
                temp[k++]=nums[second++];
            }

            int i;
            int j;
            for(i= si, j=0; j<temp.length;j++,i++){
            nums[i]=temp[j];
            }

    }
        

    
    public static void mergeSort(int[] nums, int si, int ei)  {
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(nums,si,mid);
        mergeSort(nums,mid+1,ei);
        merge(nums,si,mid,ei);
    }
    
    public static void main(String[] args) {
        int nums[]={5,2,3,1};
        int si=0;
        int ei= nums.length-1;
        mergeSort(nums,si,ei);
        System.out.println(Arrays.toString(nums));
    }
}
