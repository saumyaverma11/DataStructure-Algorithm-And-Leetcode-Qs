public class checkPnagram1832 {
    public static boolean checkIfPangram(String sentence) {
        int hash[] = new int[255];
        for(int i =0;i<sentence.length();i++){
            hash[sentence.charAt(i)]++;
        }

        for(int i=97;i<123;i++){
            if(hash[i] == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String sentence ="thequickbrownfoxjumpsoverthelazydog";
        boolean res = checkIfPangram(sentence);
        System.out.println(res);
    }
}
