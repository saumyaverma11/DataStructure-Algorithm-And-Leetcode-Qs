import java.util.*;

public class isomorphicstring204{
    public static boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> hm = new HashMap<>();
       if(s.length()!= t.length()) return false;

       for(int i=0;i<s.length();i++){
          if(hm.containsKey(s.charAt(i))){
            if(!hm.get(s.charAt(i)).equals(t.charAt(i))){
                return false;
            }
          }else{
            if(hm.containsValue(t.charAt(i))){
                return false;
            }
            else{
                hm.put(s.charAt(i),t.charAt(i));
            }
          }
       }
       return true; 
    }
    public static void main(String[] args) {
        String s = "agg";
        String t = "add";
        String s1= "badc";
        String t1 = "baba";
        System.out.println(isIsomorphic(s1, t1));
        System.out.println(isIsomorphic(s, t));
    }
}