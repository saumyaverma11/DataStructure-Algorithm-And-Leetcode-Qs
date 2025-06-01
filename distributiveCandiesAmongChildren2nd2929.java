
public class distributiveCandiesAmongChildren2nd2929 {

    //O(n3)

    public static int totalCandiesBrute(int n,int l){
        int count=0;
        for(int i=0;i<=l;i++){
            for(int j=0;j<=l;j++){
                for(int k=0;k<=l;k++){
                    if(i+j+k == n){
                        count++;
                    }
                }
            }
        }
        return count;
    }


    //O(n2)

    public static int totalCandiesBetter(int n, int l){
        int count=0;
        for(int i=0;i<=l;i++){
            for(int j=0;j<=l;j++){
                int k = (n-i-j);
                if(k>=0 && k<=l){
                    count++;
                }
            }
        }
        return count;
    }

    //O(n)

     public static long totalCandiesEfficient(int n, int limit) {
        long ans=0;
        for(int i=0;i<=Math.min(n,limit);i++){
            int rem = n-i;
            if(rem > 2*limit)
            continue;

            int count=0;
            int j = Math.max(0,rem - limit);
            int k = Math.min(rem , limit);
            ans += k-j+1;

        }
        return ans;
    }

    public static void main(String[] args) {
        int  n=5;
        int limit=2;
        int res = totalCandiesBrute(n,limit);
        System.out.println(res);
        int res2 = totalCandiesBetter(n, limit);
        System.out.println(res2);
        long res3 = totalCandiesEfficient(n, limit);
        System.out.println(res3);
    }


}
