import java.util.Arrays;

public class reshapMatrix566{
    public static void main(String[] args) {

        int mat[][]={{1,2},
    {3,4}};
    int arr[][] = matrixReshape(mat,1,4);
    for(int i =0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }

    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;          // original row
        int n = mat[0].length;       // original column
        
        if (m * n != r * c) {
            return mat;  // reshape not possible
        }

        int[][] result = new int[r][c];
        int row = 0, col = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }

        return result;
    }
}
