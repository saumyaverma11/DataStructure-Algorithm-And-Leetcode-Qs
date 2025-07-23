public class mergeSortedArray88{
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]= new int[m+n];
        int i=0, j=0;
        int idx=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[idx++]= nums1[i];
                i++;
            }
            else if(nums1[i]==nums2[j]){
                arr[idx++] = nums1[i];
                arr[idx++] = nums2[j];
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){
                arr[idx++] =nums2[j];
                j++;
            }
        }

        while(i<m && idx<arr.length){
            arr[idx++]= nums1[i];
            i++;
        }

        while(j<n && idx < arr.length){
            arr[idx++]= nums2[j];
            j++;
        }
        for(int k=0;k<arr.length;k++){
            nums1[k]= arr[k];
            System.out.print(nums1[k]+" ");
        }

    }

    public static void main(String[] args) {
        int nums1[] ={1,2,3,0,0,0};
        int m=3;
        int nums2[]= {2,5,6};
        int n=3;
        merge(nums1,m,nums2,n);
    }
}