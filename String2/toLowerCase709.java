public class toLowerCase709 {
    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            sb.append(Character.toLowerCase(ch));
        }

    return sb.toString();
    }
    public static void main(String[] args) {
        String s = "Hello";
        String res = toLowerCase(s);
        System.out.println(res);
    }
}
