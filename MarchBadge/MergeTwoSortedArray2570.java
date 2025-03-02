
import java.util.ArrayList;
import java.util.*;

public class MergeTwoSortedArray2570 {
    public static int[][] mergeArray(int[][] nums1, int[][] nums2) {
        int row1 = nums1.length;
        int col1= nums1[0].length;
        ArrayList<int[]> list = new ArrayList<>();
        int i=0,j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i][0]== nums2[j][0]){
                // arr[i][0]= nums1[i][0];
                // arr[i][1]= nums1[i][1] + nums2[j][1];
                list.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            }
            else if(nums1[i][0]<nums2[j][0]){
                // arr[i][0]= nums1[i][0];
                list.add(nums1[i]);
                i++;
            }
            else if(nums1[i][0]>nums2[j][0]){
                // arr[j][0]= nums2[j][0];
                list.add(nums2[j]);
                j++;
            }

        }
        while(i<nums1.length){
            list.add(nums1[i]);
            i++;
        }
        while(j<nums2.length){
            list.add(nums2[j]);
            j++;
        }
        return list.toArray(new int[list.size()][]);

    }
  public static void main(String[] args) {
        int nums1[][] ={
            {1,2},{2,3},{4,5},
        };
        int nums2[][] = {
            {1,4},{3,2},{4,1},
        };
        int res[][] = mergeArray(nums1, nums2);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println("");
        }
  }
}