package basic;

/**
 * Created by Administrator on 2016/12/26.
 */
// 计算字符串中子串出现的次数。
public class E49 {
    public static void main(String[] args) {
        String string = "asdfwqeeeeereqwetasdf1234";
        String subString = "eee";
        int counter = 0;
        for (int i = 0; i < string.length() - subString.length() + 1; i++) {
            if (string.substring(i, i + subString.length()).equals(subString)) {
                counter++;
            }
        }
        System.out.println(counter);
    }

}
