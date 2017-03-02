package collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Administrator on 2016/12/22 0022.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(500);
        set.add(100);
        set.add(-400);
        // TreeSet  // 元素不可重复
      //  使用 红-黑 树 存储元素
//        按元素值排序  (从小到大)

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
