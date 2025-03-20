public class indexFirstOccString28 {
    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) return 0;
        int m = haystack.length(), n = needle.length();
        int[] lps = buildLPS(needle);
        int i = 0, j = 0; // pointers for haystack and needle
        
        while (i < m) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == n) return i - j; // match found
            } else {
                if (j != 0) {
                    j = lps[j - 1]; // use the lps array to avoid re-checking
                } else {
                    i++;
                }
            }
        }
        return -1; // no match found
    }
    
    // Build LPS (Longest Prefix Suffix) array for the needle string.
    private static int[] buildLPS(String needle) {
        int n = needle.length();
        int[] lps = new int[n];
        int len = 0;
        lps[0] = 0; // lps[0] is always 0
        
        int i = 1;
        while (i < n) {
            if (needle.charAt(i) == needle.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
    
    // Main function to test the KMP algorithm
    public static void main(String[] args) {
        
        // Test case 1
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println("Index of \"" + needle1 + "\" in \"" + haystack1 + "\": " +strStr(haystack1, needle1));
        // Expected output: 0
       
    }
}
