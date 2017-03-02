package collection;

import java.util.*;

/**
 * Created by Administrator on 2016/12/22 0022.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
// HashMap
        //无序
        System.out.println(map.size());
        System.out.println(map.get(3));
        for (Integer integer : map.keySet()) {
            System.out.println(integer + ":" + map.get(integer));

        }
        for (String s : map.values()) {
            System.out.println(s);
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<>();
        hashMap.put(1, "a");
        hashMap.put(-1, "c"); // 按元素添加顺序排序
        for (Integer integer : hashMap.keySet()) {
            System.out.println(integer +":"+ hashMap.get(integer));

        }

        System.out.println("---");

        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next+":"+hashMap.get(next));
        }

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "a");
        treeMap.put(-1, "c"); // 按元素值排序 <升序>
        for (Integer integer : treeMap.keySet()) {
            System.out.println(integer + ":" + treeMap.get(integer));

        }


    }

}
