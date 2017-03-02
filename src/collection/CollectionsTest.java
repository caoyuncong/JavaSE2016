package collection;

import com.sun.xml.internal.fastinfoset.stax.factory.StAXOutputFactory;

import java.util.*;

/**
 * Created by Administrator on 2016/12/25.
 */
public class CollectionsTest {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(0);
        integers.add(-1);
        integers.add(100);

        Collections.reverse(integers); // 反转指定列表中元素的顺序。此方法以线性时间运行。
//        Collections.sort(integers); // 根据元素的自然顺序 对指定列表按升序进行排序。
        // 列表中的所有元素都必须实现 Comparable 接口。
        Iterator<Integer> iterator=integers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, "value" + String.valueOf(i));
        }
        for (Integer integer : map.keySet()) {
            System.out.println(integer+":"+map.get(integer));
        }
        System.out.println(Collections.singletonList(map)); // 返回一个只包含指定对象的不可变列表。
        // 返回的列表是可序列化的。
        System.out.println(Arrays.asList(map));
    }
}
