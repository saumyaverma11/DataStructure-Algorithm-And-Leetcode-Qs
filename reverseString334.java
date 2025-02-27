import java.util.*;
public class reverseString334{

  public static void reverseString(char c[], int low, int high){
    while(low<=high){
      char temp = c[low];
      c[low]= c[high];
      c[high]=temp;
      low++;
      high--;
    }
  }
  public static void main(String[] args) {
   char c[]= {'h','e','l','l','o'};
   reverseString(c,0,c.length-1);
   System.out.println(c);
  }
}
