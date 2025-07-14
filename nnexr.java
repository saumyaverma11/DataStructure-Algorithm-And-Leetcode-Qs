import java.util.*;

public class nnexr{

     public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]= new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    int max=-1;
                    int num= nums2[j];
                    while(j<nums2.length-1){
                        if(num < nums2[j+1]){
                            max = nums2[j+1];
                            arr[i]=max;
                            break;
                        }
                        j++;
                    }
                    arr[i]=max;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums1[]= {4,1,2,0};
        int nums2[]= {3,4,2,0,1};
        int arr[]= nextGreaterElement(nums1,nums2);
        System.out.println(Arrays.toString(arr));

    }
}