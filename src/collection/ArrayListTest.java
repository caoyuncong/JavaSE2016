package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.function.Predicate;

/**
 * Created by Administrator on 2016/12/21 0021.
 */
public class ArrayListTest<T> extends ArrayList {
    public static void main(String[] args) {
        ArrayListTest<Integer> integers = new ArrayListTest<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i * i);
        }
        ArrayList<Integer> integers1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers1.add(i);
        }
//        integers1.clear();
        integers.addAll(integers1); // 相当于拼接
//        integers.addAll(1, integers1); // 插入指定位置 《索引》
//        integers.remove(0);
//        integers.removeAll(integers1); // 不仅清空integers1,而且清空与integers1相同的
//        integers.removeRange(4, 10);
//        System.out.println(integers);
      /*  ArrayList<Integer> integers2 = new ArrayList<>();
        integers2.add(0);
        integers.removeAll(integers2);*/

// removeIf 清空 if 条件成立的
//        integers.removeIf(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer i) {
//                if (i == 0) {
//                    return true;
//                }
//                return false;
//            }
//        });
//        integers.removeIf(p -> p.equals(81)); // JDK 1.8 Lambda 表达式 去除81
        System.out.println(integers.contains(100)); //  如果此列表中包含指定的元素，则返回 true。
        System.out.println(integers.containsAll(integers1)); // integers 包含 integers1 中所有返回true
//        integers.retainAll(integers1);
//        integers1.retainAll(integers); // ?
        integers.set(integers.indexOf(81), 88);
//        System.out.println(integers); // 以数组【】输出
//        for (Object integer : integers) {
//            System.out.println(integer); // for 循环 换行输出
//        }
//        System.out.println(integers.indexOf(88)); // 返回此列表中首次出现的指定元素的索引
//        integers.clear();
//        System.out.println(integers);
//        System.out.println(integers.isEmpty());
        System.out.println(integers.lastIndexOf(100)); // 返回此列表中最后一次出现的指定元素的索引，或如果此列表不包含索引，则返回 -1。
//
//    list - array
       /* Integer[] ints = new Integer[integers.size()];
        ints = (Integer[]) integers.toArray(ints);
        Integer[] ints1 = (Integer[]) integers.toArray(new Integer[0]);
        for (Integer anInt : ints) {
            System.out.println(anInt);
        }
        for (Object anInt : ints1) {
            System.out.println(anInt);
        }
        Object[] objects = integers.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }*/
//        System.out.println(integers.size());
//        integers.trimToSize(); //  将此 ArrayList 实例的容量调整为列表的当前大小。
        Vector<String> strings = new Vector<>();
        strings.add("a");
        System.out.println(strings.size());
        System.out.println(strings.capacity());

        List<Integer> subList = integers.subList(0, integers.size());
//        List<Integer> subList = integers.subList(integers.indexOf(16), integers.indexOf(81)+1);
        for (Integer integer : subList) {
            System.out.println(integer); // 循环输出 for each
        }
        System.out.println(subList.equals(integers));

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        System.out.println(list1.equals(list2));
        for (String s : list2) {
            System.out.println(s);
        }
        Iterator<String> iterator=list2.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next(); // ?
            System.out.println(next);
        }
    }
}
