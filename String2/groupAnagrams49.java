import java.util.*;
public class groupAnagrams49{
   public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList> hm  = new HashMap<>();
        for(String s : strs){
            int hash[] = new int[27];
            for(char c : s.toCharArray()){
                hash[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for( int count : hash){
                sb.append("#");
                sb.append(count);
            }

            String key = sb.toString();
            if(!hm.containsKey(key)){
                hm.put(key, new ArrayList<String>());
            }

            hm.get(key).add(s);
        }
        return new ArrayList(hm.values());
    }
   public static void main(String args[]){
    String[] s= {"eat","ate","tae","tan","nat","umy","myu"};
    List<List<String>> list =  groupAnagrams(s);
    System.out.println(list);
   }
}