package collection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Administrator on 2016/12/22 0022.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
//        strings.add("hi");
//        strings.add("hello");
        for (int i = 0; i < 1000000; i++) {
            strings.add("test");
        }

        LinkedList<String> list = new LinkedList<>(strings);
//        list.add("test");
        list.remove(0);
//        long start=System.nanoTime();
//        strings.get(999999);
//        list.get(999999);
//        strings.remove(0);
//        list.remove(0);
//        System.out.println(System.nanoTime()-start);

        System.out.println(list.size());


    }
}
