package basic;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Administrator on 2016/12/26.
 */
// 字符串排序。
public class E40 {
    public static void main(String[] args) {
        String s1 = "asdf";
        String s2 = "test";
        String s3 = "qeirr";
        String s4 = "agjjk";

        ArrayList<String> strings = new ArrayList<>();
        strings.add(s1);
        strings.add(s2);
        strings.add(s3);
        strings.add(s4);

        Collections.sort(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
