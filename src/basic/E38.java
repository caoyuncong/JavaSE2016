package basic;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
//写一个方法，求一个字符串的长度，在main中输入字符串，并输出其长度。
public class E38 {
//    public int getLength(String strings) {
//        return strings.length();
//    }
//    public static void main(String[] args) {
//        String strings="jnvmmm";
//        System.out.println(strings.length());
//    }
public static int getLength(String string) {
    char[] chars = string.toCharArray();
    int length = 0;
    for (char aChar : chars) {
        length++;
    }
    return length;
}
    public static void main(String[] args) {
        System.out.println(getLength("asdf"));
    }
}
