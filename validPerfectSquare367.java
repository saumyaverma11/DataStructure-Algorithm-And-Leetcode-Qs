public class validPerfectSquare367 {
    public static boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
       if(num<16){
            for(int i =1;i<=num/2;i++){
                if(i*i == num){
                    return true;
                }
            }
       }
        for(int i=1;i<=num/3;i++){
            if(i*i == num){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num =16;
        boolean res =  isPerfectSquare(num);
        System.out.println(res);
    }
}
