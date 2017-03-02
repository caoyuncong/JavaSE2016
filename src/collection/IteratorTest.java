package collection;

import java.util.*;

/**
 * Created by Administrator on 2016/12/23 0023.
 */
public class IteratorTest {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        LinkedList<String> list = new LinkedList<>();
        ArrayList<String> list = new ArrayList<>(); // ArrayList
        for (int i = 0; i < 3; i++) {
            list.add(String.valueOf(i));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        System.out.println("--");

        for (int i = list.size() - 1; i > -1; i--) {
            System.out.println(list.get(i));

        }
        System.out.println("--");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--");
//           Iterator<String> listIterator= list.iterator();
//        Iterator<String> listIterator =list.descendingIterator();
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }
        System.out.println("listIterator:");
        ListIterator<String> listIterator = list.listIterator(list.size() - 1);
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());

        }
        System.out.println("--------------");

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            set.add(i);
        }

        for (Integer integer : set) {
            System.out.println(integer);
        }
        System.out.println("--");
        Iterator<Integer> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }

    }

}
