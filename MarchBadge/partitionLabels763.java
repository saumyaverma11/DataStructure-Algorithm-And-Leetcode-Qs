import java.util.ArrayList;
import java.util.List;


public class partitionLabels763 {
    
    public static List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();

        // Step 1: Store the last index of each character
        int[] lastIndex = new int[26]; // 'a' to 'z'

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        // Step 2: Form partitions
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastIndex[s.charAt(i) - 'a']);  // Expand to the farthest occurrence
           
            if (i == end) {  // Partition ends here
                result.add(i - start + 1);  
                start = i + 1;  // Move to the next partition
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1
        String s1 = "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s1));  // Output: [9, 7, 8]

        // Example 2
        String s2 = "eccbbbbdec";
        System.out.println(partitionLabels(s2));  // Output: [10]
    }
}
