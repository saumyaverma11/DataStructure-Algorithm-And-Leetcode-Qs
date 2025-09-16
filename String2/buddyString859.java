class buddyString859{
    //function 
     public StringBuilder swap(StringBuilder s, int i , int j){
        char temp = s.charAt(i);
        s.setCharAt(i,s.charAt(j));
        s.setCharAt(j,temp);
        return s;
    }
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;

         for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                        StringBuilder sb  = new StringBuilder(s);

                if(swap(sb, i, j).toString().equals(goal)){
                    return true;
                }
            }
        }
        return false;
    }

}