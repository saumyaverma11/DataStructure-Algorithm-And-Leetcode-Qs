public class alternativeGrooups3208 {
    public static int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
          int count = 0;
          int valid = 0;
  
          for (int i = 0; i < k - 1; i++) {
              if (colors[i] != colors[i + 1]) {
                  valid++;
              }
          }
  
          for (int i = 0; i < n; i++) {
              if (valid == k - 1) {
                  count++;
              }
  
              int outIdx = i;
              int inIdx = (i + k - 1) % n;
  
              if (colors[outIdx] != colors[(outIdx + 1) % n]) {
                  valid--;
              }
              if (colors[inIdx] != colors[(inIdx + 1) % n]) {
                  valid++;
              }
          }
  
          return count;
      }
      public static void main(String[] args) {
        int colors[]={0,1,0,0,1,0,1};
        int k =6;
        int res = numberOfAlternatingGroups(colors,k);
        System.out.println(res);
      }
}
