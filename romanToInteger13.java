import java.util.*;

public class romanToInteger13 {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int sum = 0;
        int i =0;
        for(i =0;i<s.length()-1;i++){
            if(hm.getOrDefault(s.charAt(i),0)<hm.getOrDefault(s.charAt(i+1),0) ){
                sum = sum + (hm.getOrDefault(s.charAt(i+1),0) - hm.getOrDefault(s.charAt(i),0));
                i=i+1;
            }
            else{
                sum = sum + hm.getOrDefault(s.charAt(i),0);
            }
        }
        
        if(i==s.length()-1){
            sum = sum + hm.getOrDefault(s.charAt(i),0);
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "MCMXCIV";
        int res =romanToInt(str);
        System.out.println(res);
    }
}
