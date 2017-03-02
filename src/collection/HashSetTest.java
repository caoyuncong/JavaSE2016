package collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/12/22 0022.
 */
// 不可重复元素
//HashSet
//    使用 Hashtable 存储元素
      //  无序
        //效率高
public class HashSetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hi");
        set.add("hello");
        set.add("hello");
        System.out.println(set.size());
        for (String s : set) {
            System.out.println(s);
        }
    }
}
