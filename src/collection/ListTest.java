package collection;

import java.util.*;

/**
 * Created by Administrator on 2016/12/21 0021.
 */
public class ListTest {
    public static void main(String[] args) {
//        List  // Shift+Ctrl+Alt+u
//        Set
//        Map
//        Hashtable // Ctrl+b
//      java.util
        Vector<String> strings = new Vector<>();
        strings.add("hi");
        strings.add("hi");
        strings.add(0, "test");
        for (String string : strings) {
            System.out.println(string);

        }
//        System.out.println(strings.get(100)); // Vector 的 add(int index,E element)  index不能大于容量   index < 0 || index > size(）
//        ArrayList
    }
}
