package collection;

/**
 * Created by Administrator on 2016/12/19 0019.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] ints; // 声明
        ints = new int[10]; // 初始化
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
            System.out.println(ints[i]);
        }
        String[] strings;
        strings = new String[5];
        for (int i = 0; i < strings.length; i++) { // int 定义的是数组的下标 【索引】
//            strings[i] = i + ""; // "0" "1"
            strings[i] = String.valueOf(i);
            System.out.println(strings[i]);
        }
//        Object[] objects=new Object[10];
//        ints[0]=2;
        boolean[] booleans=new boolean[10];
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                booleans[i]=true;
            }else{
                booleans[i]=false;
            }

        }
        for (boolean b : booleans) { // iter+Tab   for  each  快捷键
            System.out.println(b);
        }
        double[] doubles = {1.1, 2.2, 5.3};
        byte[] bytes; // Alt+/
    }
}
