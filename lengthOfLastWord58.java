public class lengthOfLastWord58 {

    public static int lastwordLength(String s) {
        int count =0;
        ///  s.trim for remove whitespaces and split for divide in words and \\s+ for not add between extra spaces
        String[] words = s.trim().split("\\s+");

       //join these words to one singke string 
       
        String result = String.join(" ", words);
        for(int i =result.length()-1;i>=0;i--){
            if(result.charAt(i)==' '){
                break;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int res = lastwordLength(s);
        System.out.println(res);
    }
}
