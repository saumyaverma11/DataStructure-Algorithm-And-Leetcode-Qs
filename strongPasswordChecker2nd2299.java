public class strongPasswordChecker2nd2299 {
     public static boolean strongPasswordCheckerII(String password) {
        if(password.length() < 8){
            return false;
        }
        boolean yes= false;
        for(char ch : password.toCharArray()){
            if(Character.isLowerCase(ch)){
                yes= true;
            }
        }
        if(!yes){
            return false;
        }
        boolean no = false;
        for(char ch : password.toCharArray()){
            if(Character.isUpperCase(ch)){
                no= true;
            }
        }
        if(!no){
            return false;
        }

        boolean digit= false;
        for(char ch : password.toCharArray()){
            if(ch>='0' && ch<='9'){
                digit = true;
            }
        }
        if(!digit){
            return false;
        }

         boolean spChar= false;
        for(char ch : password.toCharArray()){
            if(ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch== '%' || ch == '^' ||ch == '&' ||ch == '*' || ch== '(' || ch== ')' || ch=='-' || ch== '+'){
                spChar = true;
            }
        }
        if(!spChar){
            return false;
        }

        boolean same= true;
        for(int i=1;i<password.length();i++){
            if(password.charAt(i-1)==password.charAt(i)){
                same = false;
            }
        }
        if(!same){
            return false;
        }

        return true;

    }
    public static void main(String[] args) {
        String password = "ILoveLe3tcode!";
        boolean res= strongPasswordCheckerII(password);
        System.out.println(res);
    }
}
