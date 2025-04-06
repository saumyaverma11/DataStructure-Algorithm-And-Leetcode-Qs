public class nimGame292 {

    public static boolean move(int n){
        if(n%4==0){
            return false;
        }
        else{
            return true;
        }
    }    
    public static void main(String[] args) {
        int n=4;
        boolean res= move(n);
        System.out.println(res);
    }
}
