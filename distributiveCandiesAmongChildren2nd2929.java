
public class distributiveCandiesAmongChildren2nd2929 {

    public static int totalCandies(int n,int l){
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
    public static void main(String[] args) {
        int  n=5;
        int limit=2;
        int res = totalCandies(n,limit);
        System.out.println(res);
    }
}
