public class stringCompression443 {
    public static int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }
        int i = 0;
        int idx = 0;
        while (i < chars.length) {
            char ch = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }
            chars[idx++]=ch;
            if (count > 1) {
                String str = Integer.toString(count);
                for(char c : str.toCharArray()){
                    chars[idx++]=c;
                }
            }
        }
        return idx;
    }

    public static void main(String[] args) {
            char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
    
            int length = compress(chars);
    
            System.out.print("Compressed Characters: ");
            for (int i = 0; i < length; i++) {
                System.out.print(chars[i] + " ");
            }
            System.out.println("\nLength: " + length);
    }

}
