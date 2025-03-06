//You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2]. Each integer appears exactly once except a which appears twice and b which is missing. The task is to find the repeating and missing numbers a and b.

//Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.

import java.util.*;

public class findMissingAndRepeated2dArray2965{
      public static int[] findefficient(int matrix[][]){  

            //No more extra Space and  only first traversal loop O(n^2)
            int n = matrix.length;
            int [] ans = new int[2];
            boolean []  count = new boolean[n*n+1];
            int sum =0;
            for(int i=0;i<n;i++){
                  for(int j=0;j<n;j++){
                        int num = matrix[i][j];
                        sum = sum + num;
                        if (count[num]){
                              ans[0]= num;
                        }
                        count[num] = true;
                  }
            }
            sum = sum - ans[0];
            int totalSum = (n*n * (n*n +1))/2;
            ans[1]= totalSum-sum;
            return ans;

      }
      public static int[] findNaive(int grid[][]){
                      //Extra space using HashSet  and two time traversal loop O(n^2) + O(n^2) = O(n^2)

            int n = grid.length;
            int arr[] = new int[2];
            int sum =0; 
              HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                     if (set.contains(grid[i][j])) {
                        arr[0]= grid[i][j];
                       break;
                    }
                    set.add(grid[i][j]);
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    sum=sum + grid[i][j];
    
                }
            }
            sum = sum - arr[0]; 
            int ni = (n*n);
            int add = (ni*(ni+1))/2;
           
            arr[1]= add-sum;
            return arr;
      }


      public static void main(String[] args) {
      int matrix[][] = {
         {9,1,7},
         {8,9,2},
         {3,4,6},
      };
      int elements1[] = findNaive(matrix);
      System.out.println(Arrays.toString(elements1));

      int elements[] = findefficient(matrix);
      System.out.println(Arrays.toString(elements));
}

}