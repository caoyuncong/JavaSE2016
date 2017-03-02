package collection;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/12/22 0022.
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("a");
        set.add("c");
        set.add("d");
        set.add("e");
        set.add("b");
//         LinkedHashSet
        // 使用 Hashtable 实现
        //   按元素添加顺序排序
       // 不可重复元素

        for (String s : set) {
            System.out.println(s);
        }
    }
}
