package collection;

import java.util.Vector;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
public class VectorTest {
    public static void main(String[] args) {
//        Vector<String> strings=new Vector<>();
//        strings.add("hi");
//        strings.add("hello");
//        strings.add("hello");
//        strings.clear();
//        strings.add("hello");
//        strings.add("hello");
        Vector<String> strings=new Vector<>(10,100);
        for (int i = 0; i < 10; i++) {
            strings.add("test...");
        }
        strings.add("hi...");
        System.out.println(strings.size());
        System.out.println(strings.capacity());
//        for (String string : strings) {
//            System.out.println(string);
//        }
    }
}
