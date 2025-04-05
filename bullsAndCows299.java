import java.util.*;



public class bullsAndCows299 {
    public static String getHint(String secret, String guess) {
        int hash[]= new int[10];
          int hash2[] = new int[10];
          int bull=0;
  
     for(int  i =0;i<secret.length();i++){
              if(secret.charAt(i)==guess.charAt(i)){
                  bull++;
              }
              
          }   
  
  
          for(int i=0;i<secret.length();i++){
              if(secret.charAt(i)!= guess.charAt(i)){
                  hash[secret.charAt(i)-'0']++;
                  hash2[guess.charAt(i)-'0']++;
              }
          }
  
          
          int cows=0;
       
          for(int i=0;i<hash.length;i++){
              cows += Math.min(hash[i], hash2[i]);
          }
  
  
  return bull +"A" + cows +"B";
  
  
      }
    public static void main(String[] args) {
        String secret = "1807";
        String guess = "7810";
        String result = getHint(secret,guess);
        System.out.println(result);
    }
}
