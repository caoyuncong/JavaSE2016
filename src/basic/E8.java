package basic;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/15.
 */
//求s=a+aa+aaa+aaaa+aa…a的值，其中a是一个数字。例如
//2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
public class E8 {
    private static final int N = 3;

    private static int getNumber(int x) {
//        int number = 0;
//        for (int i = 0; i < x; i++) {
//            number += 2 * Math.pow(10, i);
//        }
//        return number;
        String s = "";
        for (int i = 0; i < x; i++) {
            s += 2; // s = s + 2;
        }
        return Integer.valueOf(s);
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += getNumber(i+1);
        }
        System.out.println(sum);
    }
}
