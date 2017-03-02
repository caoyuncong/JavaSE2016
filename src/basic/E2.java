package basic; /**
 * Created by Administrator on 2016/12/7.
 */
//判断101-200之间有多少个素数，并输出所有素数。素数：只能被1和它本身整除的正整数（1不是素数）
import java.math.*;

import static java.lang.Math.sqrt;

public class E2 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 101; i < 200; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                    counter++;
                    System.out.println(i + " is a prime.");
            } else {
//                System.out.println(i + " is not a prime.");
            }
        }
        System.out.println(counter);
    }
}
