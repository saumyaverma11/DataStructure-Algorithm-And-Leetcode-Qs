import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


public class MiniMumIndexOfAValidSpilit2780 {
        public int minimumIndex(List<Integer> nums) {
            int n = nums.size();

        // Step 1: Find the dominant element
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int dominant = -1, maxFreq = 0;
        
        for (var entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                dominant = entry.getKey();
            }
        }

        // Verify that dominant element exists
        if (maxFreq <= n / 2) {
            return -1;
        }

        // Step 2: Simulate the split and check dominance
        int leftCount = 0, rightCount = maxFreq;

        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) == dominant) {
                leftCount++;
                rightCount--;
            }

            int leftSize = i + 1;
            int rightSize = n - leftSize;

            // Check if both halves have the dominant element as dominant
            if (leftCount * 2 > leftSize && rightCount * 2 > rightSize) {
                return i;  // Return the minimum index of valid split
            }
        }

        return -1;
        }

    public static void main(String[] args) {
        List<Integer> al= new List<>();
        al.add(1);

    }
}
