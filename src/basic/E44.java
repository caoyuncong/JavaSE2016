package basic;

/**
 * Created by Administrator on 2016/12/8.
 */
//一个偶数总能表示为两个素数之和。
public class E44 {
    private static final int EVEN = 12345678;

    private static boolean isPrime(int n) {
        for (int i = 2; i < n / 2 + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 1 2 3 5 7 11 13 17 19 23 ...
        // 10 = 3 + 7    2 = 1 +
        // 16 = 3 + 13
        for (int i = 1; i < EVEN / 2 + 1; i++) {
            if (isPrime(i) && isPrime(EVEN - i)) {
                System.out.println(EVEN + " = " + i + " + " + (EVEN - i));
                break;
            }
        }
    }
}
