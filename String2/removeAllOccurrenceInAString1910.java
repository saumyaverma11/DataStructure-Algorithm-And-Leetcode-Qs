public class removeAllOccurrenceInAString1910 {
    public static String removeOccurrences(String s, String part){
        StringBuilder sb= new StringBuilder(s);
        while(sb.indexOf(part)!=-1){
            int index = sb.indexOf(part);
            sb.delete(index, index+ part.length());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s ="daabcbaabcbc";
        String part ="abc";
        String res = removeOccurrences(s,part);
        System.out.println(res);
    }
}
