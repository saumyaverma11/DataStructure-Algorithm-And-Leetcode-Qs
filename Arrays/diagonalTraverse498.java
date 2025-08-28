import java.util.*;

public class diagonalTraverse498 {
      public static int[] findDiagonalOrder(int[][] mat) {
        // In this we have to move first up then down then up and then down and so on untill both of rows and columns reaches their destination.

        // First we have to make a condition that if there is no element in the matrix , to handle this edge cases

        if(mat.length == 0 && mat[0].length ==0 ) return new int[0];

        int n= mat.length;
        int m= mat[0].length;
        // now we have to create an empty arrray of size m*n

        int arr[]= new int[m*n];
        
        // there is a variable I take up which is true if it is moving from down to up , and it is false if it is moving from up to down.
        boolean up = true;

        int row=0;
        int col=0;
        // row and columns start with zero
        int i=0;
        // this condition is must, row and col increase untill the length 
        while(row<n && col <m){
            if(up){ 

                // that means when row is greater than 0 and col is less than the last colunm element . because we have to print last element alone .
                while(row>0 && col<m-1){
                    arr[i++] = mat[row][col];
                    row--;
                    col++;
                }
                // this is the case in which it print first row column element .

                arr[i++] = mat[row][col];  //boundry element 

                // when it reaches the column length limit then move for next row --->
                if(col == m-1){       //
                    row++;
                }
                else{         // otherwise move for next columns as well.
                    col++;
                }
            }
            else{ /// its for up to down, in which print the element before last element



                while( col>0 && row<n-1){
                    arr[i++] = mat[row][col];
                    col--;
                    row++;
                }
                arr[i++] = mat[row][col];             // boundry element 
                if(row==n-1){
                    col++;
                }
                else{
                    row++;
                }
            }
            up = !up;


        }

        return arr;

     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][]= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]= sc.nextInt();
            }
        }

        int arr[]=findDiagonalOrder(mat);
        System.out.println(Arrays.toString(arr));
    }
}
