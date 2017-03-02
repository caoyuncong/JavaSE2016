package basic;

/**
 * Created by Administrator on 2017/1/8.
 */
//809*??=800*??+9*??+1 其中??代表的两位数，8*??的结果为两位数，
// 9*??的结果为3位数。求??代表的两位数，及809*??后的结果。
public class E42 {
    public static void main(String[] args) {
        System.out.println(809 * 12);
        System.out.println(800 * 12 + 9 * 12 + 1);
        for (int i = 10; i < 100; i++) {
            if (809 * i == 800 * i + 9 * i + 1) {
                System.out.println(i);
            }
        }
    }
}
