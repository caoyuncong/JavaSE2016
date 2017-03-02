package collection;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/12/21 0021.
 */
public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<Float> floats = new ArrayList<>();
        floats.add(1.2f);
        floats.add(2f);
        floats.add(0, 0.5f);
        System.out.println(floats.size());
        System.out.println(floats.get(1));
        // 有序（序列）
//        可重复元素
        for (Float aFloat : floats) {
            System.out.println(aFloat);
        }// 取元素  用get
    }
}
