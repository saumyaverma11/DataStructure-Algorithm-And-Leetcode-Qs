import java.util.*;
class CountTotalNumOfColeredCells2579 {
    public static long coloredCells(int n) {
        long ans = (long)  n*n + (long)  (n-1)*(n-1); 
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(coloredCells(1));
        System.out.println(coloredCells(2));
        System.out.println(coloredCells(3));

        System.out.println(coloredCells(4));
    }
}
