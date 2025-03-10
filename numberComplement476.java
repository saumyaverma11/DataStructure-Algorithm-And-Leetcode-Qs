public class numberComplement476 {
   public static void main(String[] args) {
    int  num =5;
     int mask = (Integer.highestOneBit(num) << 1) - 1;
    System.out.println(mask^num);
   }

}
