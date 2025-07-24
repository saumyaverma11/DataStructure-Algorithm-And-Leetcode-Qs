import java.util.*;

public class transposematrix867{
     public static void transpose(int[][] matrix) {
        int n = matrix.length;
        int m= matrix[0].length;

        int[][] arr= new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[j][i] = matrix[i][j];
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[][]= {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        transpose(arr);
    }
}