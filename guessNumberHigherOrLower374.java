public class guessNumberHigherOrLower374 {
    public static int guess(int num){     
        return 1;     //this is wrong only because we need to write thr function not API calling that's why i write this return 0
    }
    public static int guessNumber(int n) {
        int low = 1;
        int high = n;
        while(low<=high){
            int mid = low + (high-low)/2;
            int g = guess(mid);
            if(g==0){
                return mid;
            }
            else if(g==-1){
                high= mid-1;
            }
            else if(g==1){
               low= mid+1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int n =10;

    }
}
