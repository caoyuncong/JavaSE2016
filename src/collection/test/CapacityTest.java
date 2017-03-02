package collection.test;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/12/21 0021.
 */
public class CapacityTest {
    public static void main(String[] args) {
//        int capacity = 73;
//        System.out.println(Integer.toBinaryString(capacity));
//        System.out.println(capacity >> 1);
        ArrayList<Integer> integers = new ArrayList<>(10);
        for (int i = 0; i < 100; i++) {
            integers.add(i);
        }
        System.out.println(integers);

//        ArrayList<Integer> testList = new ArrayList<>(integers);
//        for (Integer integer : testList) {
//            System.out.println(integer);
//        }
// 15 22 33 49 73 109
        ArrayList<Integer> list=new ArrayList<>(1000000);
        // 构造一个具有指定初始容量的空列表。
    }
}
