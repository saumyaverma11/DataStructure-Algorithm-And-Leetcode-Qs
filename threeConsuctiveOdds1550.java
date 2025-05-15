public class threeConsuctiveOdds1550 {
    public static boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int i =0;
        int j=0;
        while(i<arr.length-2){
            if((arr[i]%2 !=  0)  && (arr[i+1]%2 !=0) && (arr[i+2]%2!=0)){
                return true;
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={2,6,4,1};
        boolean res= threeConsecutiveOdds(nums);
        System.out.println(res);
    }
}
