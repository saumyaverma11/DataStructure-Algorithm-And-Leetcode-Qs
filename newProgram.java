class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
        int total = 1; // Start with the original string (no typo case)
        
        int i = 0;
        while (i < n) {
            int j = i;
            // Count the length of the current group of same characters
            while (j < n && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            int count = j - i;
            
            // If this group has length > 1, we can reduce it by 1 up to (count - 1)
            if (count > 1) {
                total += (count - 1);
            }
            
            i = j; // move to next group
        }
        
        return total;
    }
}
