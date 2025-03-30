import java.util.*;

public class firstLetterToAApearTwice2351 {
    public static char repeatedCharactermap(String s) {
        HashMap<Character,Integer> hh = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hh.put(s.charAt(i), hh.getOrDefault(s.charAt(i),0)+1);
            if(hh.getOrDefault(s.charAt(i),0) == 2){
                return s.charAt(i);
            }
        }
        return 'a';
    }

    public static char repeatedCharacterset(String s) {
        HashSet<Character> set= new HashSet<>();

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                return c;
            }
            set.add(c);
        }
        return 0;
    }

    public static void main(String[] args) {
       String s= "abccbaacz";

       //using hashmap 

       char ch=  repeatedCharactermap(s);
        System.out.println(ch);

        //using hashset

        char ch2=  repeatedCharacterset(s);
        System.out.println(ch2);



    }
}
