import java.util.*;

public class distributiveCandies575 {

    public static int  distributiveCandies(int[] candyType){
        Set<Integer> set = new HashSet<>();
        for(int i :candyType){
            set.add(i);
        }
        int n = candyType.length/2;
        int setS = set.size();
        return Math.min(n,setS);

    }
    public static void main(String[] args) {
        int candytype[]= {1,1,2,2,3,3};
        int res =distributiveCandies(candytype);
        System.out.println(res);
    }
}
