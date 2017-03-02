package basic;

import org.w3c.dom.css.Counter;

import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

/**
 * Created by Administrator on 2016/12/15.
 */
//随机生成[1， 20]数10000次，使用两种方法实现（java.lang.Math，
//java.util.Random），并判断两种方法的效率和
// 分布。
public class E34 {

    public static void main(String[] args) {
        // K-[1,20] V-times
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < 20; i++) {
            hashtable.put(i + 1, 0);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int n=(int)(Math.random()*20+1);
//            Random random = new Random();
//            int n = random.nextInt(20) + 1;
            hashtable.put(n, hashtable.get(n) + 1);
//            System.out.println(n);

            for (Integer integer : hashtable.keySet()) {
                System.out.println(integer + "-" + hashtable.get(integer));
            }

        }

        System.out.println(System.currentTimeMillis() - start);
    }

}
