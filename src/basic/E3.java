package basic;

/**
 * Created by Administrator on 2016/12/7.
 */
//打印出所有的“水仙花数”，
// 所谓“水仙花数”是指一个三位数，其各位数字立方和等于该数本身。
// 例如：153是一个“水仙花数’，因为153=1的三次方＋5的三次方＋3的三次方。
public class E3 {
    public static void main(String[] args) {//
        for (int i = 100; i < 1000; i++) {
            int b = i / 100;
            int s = i % 100 / 10;
            int g = i % 10;
            if (i == b * b * b + s * s * s + g * g * g) {
                System.out.println(i);
            }
        }
    }
}
