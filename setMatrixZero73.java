import java.util.*;

public class setMatrixZero73 {

    public static void setZero(int arr[][]){
        int n= arr.length;
        int m = arr[0].length;
        boolean[] rowZero = new boolean[n];
        boolean[] colZero = new boolean[m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    rowZero[i]=true;
                    colZero[j]=true;
                }
            }
        }

        for(int i=0;i<n;i++){
            if(rowZero[i]){
                for(int j=0;j<m;j++){
                    arr[i][j]=0;
                }
            }
        }

        for(int j=0;j<m;j++){
            if(colZero[j]){
                for(int i=0;i<n;i++){
                    arr[i][j]=0;
                }
            }
        }
    }

    public static void main(String args[]){
        int [][]arr = {
            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };

        setZero(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
