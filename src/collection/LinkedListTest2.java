package collection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Administrator on 2016/12/22 0022.
 */
public class LinkedListTest2 {
    public static void main(String[] args) {
        long startBytes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(startBytes);
        ArrayList<String> arrayList = new ArrayList<>(100_0000);
        for (int i = 0; i < 100_0000; i++) {
            arrayList.add("1");
        }
        /*LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            String s = new String("te"); // ?
            linkedList.add(s);//24952616 24960792
        }*/

        long endBytes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(endBytes);
        System.out.println((endBytes-startBytes)/1024/1024);
// linkedList.addFirst("test"); // 无返回类型
        /*System.out.println(linkedList.offerFirst("test")); // 返回布尔类型
        for (String s : linkedList) {
            System.out.println(s);*/
//        }
        for (String s : arrayList) {
            System.out.println(arrayList);
        }
    }
}
