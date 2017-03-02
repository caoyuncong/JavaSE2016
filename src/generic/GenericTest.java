package generic;

import basic.Human;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/23 0023.
 */
public class GenericTest<T extends Serializable> {
    public String add(T x, T y) {
        return String.valueOf(x) + String.valueOf(y);
    }

    /*public String add(int x, int y) {
            return String.valueOf(x) + String.valueOf(y);
        }

        public String add(double x, double y) {
            return String.valueOf(x) + String.valueOf(y);
        }

        public String add(boolean x, boolean y) {
            return String.valueOf(x) + String.valueOf(y);
        }*/

    public static void main(String[] args) {
        GenericTest<Integer> t1 = new GenericTest();
        System.out.println(t1.add(1, 2));
        GenericTest<Double> t2 = new GenericTest();
        System.out.println(t2.add(1.2, 1.2));
        GenericTest<Boolean> t3 = new GenericTest();
        System.out.println(t3.add(true,false));
        GenericTest<Long> t4 = new GenericTest();
        System.out.println(t4.add(Long.MIN_VALUE , Long.MAX_VALUE));
        GenericTest<Human> t5 = new GenericTest<>();
        System.out.println(t5.add(new Human("zs",19,'M'),new Human("LS",20,'F')));


        List<String> list = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            list.add("hello" + i);
        }
//        list.add(1);
        String s = list.get(99);
        System.out.println(s);
    }
}
