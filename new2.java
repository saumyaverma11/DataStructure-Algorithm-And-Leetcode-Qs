public class new2{
    public static void main(String[] args) {
        class Solution {
    public String reverseVowels(String s) {
        int i,j;
        char vow[]= new char[]{'a', 'e', 'i', 'o','u'};
        StringBuilder st= new StringBuilder();
        for(i=0;i<s.length();i++){
        if(s.charAt(i)=='a' || s.charAt(i)=='e' ||  s.charAt(i)=='i' ||  s.charAt(i)=='o' ||  s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' ||  s.charAt(i)=='I' ||  s.charAt(i)=='O' ||  s.charAt(i)=='U'){
            st.append(s.charAt(i));
        }
        }

        StringBuilder sb = new StringBuilder();

        for(i=0;i<s.length();i++){
            if(s.charAt(i)!='a' || s.charAt(i)!='A' || s.charAt(i)!='E' || s.charAt(i)!='e' || s.charAt(i)!='i' || s.charAt(i)!='I' || s.charAt(i)!='O' || s.charAt(i)!='o' || s.charAt(i)!='U' || s.charAt(i)!='u'){
                st=st.reverse();
                st.insert(i,s.charAt(i));
            }
        }
        return st.toString();
    }
}
    }
}