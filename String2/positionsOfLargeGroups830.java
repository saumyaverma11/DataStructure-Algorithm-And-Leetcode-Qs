public class positionsOfLargeGroups830 {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        // int count =0;
        for(int i =0;i<s.length();i++){
            int count =1;
            int newn=i;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)== s.charAt(j)){
                    count++;
                    newn= j;
                }
                else{
                    break;
                }
                
            }
            if(count>=3){
               List<Integer> ll= new ArrayList<>();
               ll.add(i);
               ll.add(newn);
               res.add(ll);
            }
            i=newn;
        }
        return res;

    }
    public static void main(String[] args) {
        
    }
}
