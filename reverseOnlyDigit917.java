public class reverseOnlyDigit917 {
    public  static String reverseOnlyLetters(String s) {
        int left =0;
        int right =s.length()-1;
        char str[]= s.toCharArray();
        while(left<=right){
            if(Character.isLetter(str[left]) && Character.isLetter(str[right])){
               char temp= str[left];
               str[left]= str[right];
               str[right]= temp;
                left++;
                right--;
            }
            else if(Character.isLetter(str[left]) && !Character.isLetter(str[right])){
                right--;
            }
            else if(!Character.isLetter(str[left]) && Character.isLetter(str[right])){
                left++;
            }
            else{
                left++;
                right--;
            }
        }

        return new String(str);
    }
        public static void main(String args[]){
            String s= "ab_cd";
            String res = reverseOnlyLetters(s);
            System.out.println(res);
        }
}
