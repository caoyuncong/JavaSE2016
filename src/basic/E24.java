package basic;
import java.util.*;
/**
 * Created by Administrator on 2016/12/8.
 */
//给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
public class E24 {
    private static final int N = 1234; // 4321

    public static void main(String[] args) {

        int x = 0;
        for (int i = 1; i < 5; i++) {
            if (N % ((int) Math.pow(10, i)) == N) {
                System.out.println(i);
                x = i;
                break;
            }
        }
        for (int i = 0; i < x; i++) { // 0, 1, 2, 3
            System.out.print(N % (int) (Math.pow(10, i + 1)) / ((int) Math.pow(10, i)));
        }


        System.out.println((N + "").length());
        System.out.println(new StringBuffer(N + "").reverse());
//        Scanner s = new Scanner(System.in);
//        System.out.print("请输入一个正整数：");
//        long a = s.nextLong();
//        String ss = Long.toString(a);
//        char[] ch = ss.toCharArray();
//        int j=ch.length;
//        System.out.println(a + "是一个"+j +"位数。");
//        System.out.print("按逆序输出是：");
//        for(int i=j-1; i>=0; i--) {
//            System.out.print(ch[i]);
//        }
    }
}
