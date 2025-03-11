

public class numberOfsubstring1358 {
    public static  int numberOfSubstrings(String s) {
        
        int[] count = new int[3];  
        int left = 0, result = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'a']++; 

            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                result += s.length() - right; 
                count[s.charAt(left) - 'a']--; 
                left++; 
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        String s = "abcabc";
        int res = numberOfSubstrings(s);
        System.out.println(res);
    }
}
