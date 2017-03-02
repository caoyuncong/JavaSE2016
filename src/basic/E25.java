package basic;

/**
 * Created by Administrator on 2016/12/8.
 */
//一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
public class E25 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 10000; i < 100000; i++) {

            int w = i / 10000;
            int q = i % 10000 / 1000;
//            int b=i%1000/100;
            int s = i % 100 / 10;
            int g = i % 10;
            if (w == g && q == s) {
                System.out.println(i);
                counter++;
            }

        }
        System.out.println(counter);
    }
}
