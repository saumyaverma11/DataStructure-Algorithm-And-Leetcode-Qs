public class excelSheetColumnTitle168 {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int rem = columnNumber % 26;
            char ch = (char) ('A' + rem);
            sb.append(ch);
            columnNumber /=26;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        int columnNumber = 28;
        System.out.println(convertToTitle(columnNumber));
    }
}
