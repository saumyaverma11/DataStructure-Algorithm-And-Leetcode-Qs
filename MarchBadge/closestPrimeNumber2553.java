import java.util.ArrayList;

public class closestPrimeNumber2553 {
        public static boolean prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if((n%i)==0){
            return false;
            }
        }
        return true;
    }
    public  static int[] closestPrimes(int left, int right) {

      ArrayList<Integer> list = new ArrayList<>();
        
      for(int i = left;i<=right;i++){
           if(prime(i)){
            list.add(i);
            }
        }

        if (list.size() < 2) return new int[]{-1, -1};

        int minDiff = Integer.MAX_VALUE;
        int num1 = -1, num2 = -1;

        for (int i = 1; i < list.size(); i++) {
            int diff = list.get(i) - list.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                num1 = list.get(i - 1);
                num2 = list.get(i);
            }
        }

        return new int[]{num1, num2};

    }
    public static void main(String[] args) {
        int left = 10;
        int right =19;
        int res[]= closestPrimes(left,right);
        System.out.println(res.toString());
    }
}
