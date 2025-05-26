public class robotToOrigin657 {
    public static boolean judgeCircle(String moves) {
        int num =0 ;
        int num2 =0;
        for(int i =0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                num++;
            }
            else if(moves.charAt(i) == 'D'){
                num--;
            }
            else if(moves.charAt(i) == 'R'){
                num2++;
            }
            else{
                num2--;
            }
        }

        if(num == 0 && num2 ==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "UUDD";
        boolean res = judgeCircle(str);
        System.out.println(res);
    }
}
