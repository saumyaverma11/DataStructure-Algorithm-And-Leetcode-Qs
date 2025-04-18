import java.util.*;

public class sortCharacterByFreq451 {
  
        public static String frequencySort(String s) {
            StringBuilder sb= new StringBuilder();
            int hash[]= new int[256];
            for(int  i=0;i<s.length();i++){
                hash[s.charAt(i)]++;
            }
    
            int max=0;
            for(int i =0;i<hash.length;i++){
                max = Math.max(max,hash[i]);
            }
    
            while(max>0){
                for(int i=0;i<hash.length;i++){
                    if(hash[i]==max){
                          for(int j=0; j<hash[i]; j++){      // ✅ Repeat it `hash[i]` times
                              sb.append((char)(i));
                           }
                    }
                }
                max--;
            }
    
            return sb.toString();
        }
    public static void main(String[] args) {
        String str= new String();
        str="tree";
        String str2 = frequencySort(str);
        System.out.println(str2);
    }
}
