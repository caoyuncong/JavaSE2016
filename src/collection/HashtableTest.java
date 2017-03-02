package collection;

import sun.java2d.SurfaceDataProxy;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable=new Hashtable<>();
        hashtable.put(-40, "-40");
        hashtable.put(1000, "1000...");
        hashtable.clear();
        hashtable.put(52, "52...");
        hashtable.put(20000, "20000...");
        hashtable.put(30, "30...");
        hashtable.put(30, "52...");
        System.out.println(hashtable.size());
        System.out.println(hashtable.get(1));
        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer+">"+hashtable.get(integer));
        }
        for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry.getKey()+">"+integerStringEntry.getValue());
        }
        hashtable.remove(52);
        System.out.println(hashtable.contains("52..."));

    }
}
