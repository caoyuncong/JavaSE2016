package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2016/12/23 0023.
 */
public class ArraysTest {
    public static void main(String[] args) {
//        Integer[] ints = {0, 1, 2, 3, -100};
//        List<Integer> integers = Arrays.asList(ints);
//        Iterator<Integer> iterator=integers.iterator(); // 返回按适当顺序在列表的元素上进行迭代的迭代器。
//
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            System.out.println(next);
//        }
//        System.out.println(Arrays.binarySearch(ints,100));
        Integer[] ints = {0, 1, 2, 3, -100};
        List<Integer> integers = Arrays.asList(ints);
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }

//        System.out.println(Arrays.binarySearch(ints, 100)); // a - 要搜索的数组
       // key - 要搜索的值 使用二分搜索法来搜索指定的 int 型数组，
        // 以获得指定的值。必须在进行此调用之前对数组进行排序（通过 sort(int[]) 方法）。
        // 如果它包含在数组中，则返回搜索键的索引；否则返回 (-(插入点) - 1)。
        // 插入点 被定义为将键插入数组的那一点：即第一个大于此键的元素索引，
        // 如果数组中的所有元素都小于指定的键，则为 a.length。
        // 注意，这保证了当且仅当此键被找到时，返回的值将 >= 0。
        boolean[] booleans1 = {true, false,true,true};
//        boolean[] booleans2 = {false, true};
        boolean[] booleans2 = Arrays.copyOf(booleans1, 10); // 原数组的副本，
        // 截取或用 false 元素填充以获得指定的长度

//        boolean[] booleans2 = Arrays.copyOfRange(booleans1, 1, 5); // 包含取自原数组指定范围的新数组，
// 截取或用 false 元素填充以获得所需长度

//        System.out.println(Arrays.equals(booleans1,booleans2));
        System.out.println(Arrays.toString(booleans2));
        boolean[] booleans3 = new boolean[10];
        Arrays.fill(booleans3, true); // 将指定的 boolean 值分配给指定 boolean 型数组的每个元素。
        System.out.println(Arrays.toString(booleans3));
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints);

        System.out.println("-----");

        System.out.println(Arrays.toString(ints));
        int[][] ints1 = new int[3][5];
        for (int i = 0; i < ints1.length; i++) {
            for (int j = 0; j < ints1[i].length; j++) {
                ints1[i][j]=i+j;
            }
        }
        char[] chars={'j','l','o'};
        Arrays.fill(chars,'m');
        System.out.println(chars);

//        int[] ints = {1, 2, 3};
//        System.out.println(Integer.toHexString(ints.hashCode()));
//        System.out.println(ints.toString());
////        [I@74a14482                 [ - 数组；I - Integer； @   74... hashcode
//
//        char[] chars = {'a', 'b', 'c'};
//        System.out.println(chars); // abc
//        System.out.println(chars.toString());
//
//        Character[] characters = {'a', 'b', 'c'};
//        System.out.println(characters);
        System.out.println(Arrays.deepToString(ints1));
    }
}
