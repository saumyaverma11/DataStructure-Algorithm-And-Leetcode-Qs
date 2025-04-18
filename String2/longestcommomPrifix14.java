import java.util.*;
public class  longestcommomPrifix14{

    public static String commonprefix(String str[]){
        String prefix = str[0];
        for(int i =1;i<str.length;i++){
           while(str[i].indexOf(prefix)!=0){
            prefix= prefix.substring(0,prefix.length()-1);
           }
           if(prefix.isEmpty()){
            return " ";
           }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String arr[]={"flower","flow","flight"};
        String str = commonprefix(arr);
        System.out.println(str);
    }
}