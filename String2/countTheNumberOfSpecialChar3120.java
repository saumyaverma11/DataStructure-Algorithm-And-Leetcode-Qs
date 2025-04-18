
public class countTheNumberOfSpecialChar3120 {
    public static int calcOne(String word){
        int hash[]= new int[256];
        for(int i=0;i<word.length();i++){
            hash[word.charAt(i)]++;
        }
         int count=0;
        for(int i=97;i<123;i++){
                 if(hash[i]!=0 && hash[i-32]!=0){
                    count++;
                }
        }
        return count;
        
    }
    public static int calcOther(String word){
         int hash1[]= new int[256];
        int hash2[]= new int[256];
        for(int i =0;i<word.length();i++){
            if(word.charAt(i)>=97 && word.charAt(i)<=122){
                hash1[word.charAt(i)]++;
            }
            else{
                hash2[word.charAt(i)]++;
            }
        }
        int c=0;
            for(int i =0;i<256;i++){
                if(hash1[i]!=0 && hash1[i]!=0){
                    if(hash1[i]>0 && hash2[i-32]>0){
                        c++;
                    }
                }
            }
            return c;

        }
    public static void main(String[] args) {
        String word = "aaAbcBC";
        int res = calcOne(word);
        System.out.println(res);
        int res2 = calcOther(word);
        System.out.println(res2);
    }
}
