import java.util.*;

public class SearchA2dMatrix74 {
    public static boolean searchNaive(int matrix[][], int target){
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
          {1,3,5,7},
          {10,11,16,20},
          {23,30,60,64},
    };
    Scanner sc=new Scanner(System.in);
    int target = sc.nextInt();
    boolean result = searchNaive(matrix, target);
    System.out.println(result);
    // searchOptimized(matrix);

}
}
