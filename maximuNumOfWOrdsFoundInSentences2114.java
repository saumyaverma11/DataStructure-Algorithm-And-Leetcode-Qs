public class maximuNumOfWOrdsFoundInSentences2114 {
    public static int mostWordsFound(String[] sentences) {
        int max=0;
        // String arr[]= sentences.split(",");
        for(int i=0;i<sentences.length;i++){
            String word1[] = sentences[i].split(" ");
            max= Math.max(max,word1.length);
        }
        return max;
    }
    public static void main(String[] args) {
        String sentences[]= {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int res = mostWordsFound(sentences);
        System.out.println(res);
    }
}
