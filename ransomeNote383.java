public class ransomeNote383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int hash[]= new int[256];
        int hash2[]= new int[256];
        for(int i=0 ;i<ransomNote.length();i++){
            hash[ransomNote.charAt(i)]++;
        }
        for(int i=0 ;i<magazine.length();i++){
          hash2[magazine.charAt(i)]++;
        }
        for(int i =0;i<ransomNote.length();i++){
            if(hash[ransomNote.charAt(i)] >  hash2[ransomNote.charAt(i)]){
               return false;
            }
        }
     
        return true;
    }  
    public static void main(String[] args) {
        String ransomeNote = "a";
        String magazine ="b";
        boolean res= canConstruct(ransomeNote,magazine);
        System.out.println(res);
    }
}
