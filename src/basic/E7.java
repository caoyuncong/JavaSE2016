package basic;

/**
 * Created by Administrator on 2016/12/26.
 */
// 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
public class E7 {
    public static void main(String[] args) {
        String string = "asdf  d:>>< ?fsas df1231  24ge&&*   !(!()_JKIH23452345";
        int englishCounter = 0;
        int spaceCounter = 0;
        int numberCounter = 0;
        int othersCounter = 0;
        for (char c : string.toCharArray()) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                englishCounter++;
            } else if (c >= '0' && c <= '9') {
                numberCounter++;
            } else if (c == ' ') {
                spaceCounter++;
            } else {
                othersCounter++;
            }

        }
        System.out.println(englishCounter);
        System.out.println(spaceCounter);
        System.out.println(numberCounter);
        System.out.println(othersCounter);

        System.out.println(string.length());
    }
}
