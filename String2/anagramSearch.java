import java.util.*;

public class anagramSearch{
    public static boolean IsanagramNaive(String txt, String pat, int i){
        int hash[]=new int[256];
        for(int j=0;j<pat.length();j++){
            hash[pat.charAt(j)]++;
            hash[txt.charAt(i+j)]--;
        }
        for(int j =0;j<256;j++){
            if(hash[j]!=0){
                return false;
            }
        }
        return true;
    }

    public static boolean searchNaive(String txt, String pat){
        int n = txt.length();
        int m = pat.length();
        for(int i=0;i<=n-m;i++){
            if(IsanagramNaive(txt,pat,i)){
                return true;
            }
        }
        return false;
    }

    public static boolean IsCompare(int hash1[], int hash2[]){
        for(int i =0;i<256;i++){
            if(hash1[i]!= hash2[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean searchEfficient(String txt, String pat){
        int hash1[]= new int[256];
        int hash2[] = new int[256];
        for(int i=0;i<pat.length();i++){
            hash1[pat.charAt(i)]++;
            hash2[txt.charAt(i)]++;
        }
        for(int i=pat.length();i<txt.length();i++){
            if(IsCompare(hash1,hash2)){
                return true;
            }
            hash2[txt.charAt(i)]++;
            hash2[txt.charAt(i-pat.length())]--;
        }
        return false;
    }

    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "frog";
        boolean res = searchNaive(txt,pat);
        System.out.println(res);
        boolean res2 = searchEfficient(txt,pat);
        System.out.println(res2);
    }
}