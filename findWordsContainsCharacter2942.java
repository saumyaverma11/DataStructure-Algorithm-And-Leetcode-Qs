import java.util.ArrayList;
import java.util.List;

public class findWordsContainsCharacter2942 {
     public static List<Integer> findWordsContaining(String[] words, char x) {


        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String[] arr ={"leet","code"};
        List<Integer> list= new ArrayList<>();
        list = findWordsContaining(arr, 'e');
        System.out.println(list);

    }
}
