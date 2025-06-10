import java.util.HashMap;
class longestPalindrome409 {
    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int length = 0;
        boolean oddFound = false;

        // Count character frequencies
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Build palindrome length
        for (int freq : map.values()) {
            if (freq % 2 == 0) {
                length += freq;
            } else {
                length += freq - 1; // use the even part
                oddFound = true;    // remember that one odd can go in the middle
            }
        }

        // Add one character in the center if any odd found
        return oddFound ? length + 1 : length;
    }

    public static void main(String[] args) {
        int res = longestPalindrome("abccccdd");
        System.out.println(res); // Output: 7
    }
}