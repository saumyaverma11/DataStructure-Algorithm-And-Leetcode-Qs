public class shuffleString15288 {
    public static String restoreString(String s, int[] indices) {
        char arr[] = new char[s.length()];
        
    for(int i =0;i<indices.length;i++){
        arr[indices[i]] = s.charAt(i);
    }

    return new String(arr);

    }
    public static void main(String[] args) {
        String s = "codeleet";
        int indices[] = {4,5,6,7,0,2,1,3};
        String str = restoreString(s,indices);
        System.out.println(str);
    }
}
