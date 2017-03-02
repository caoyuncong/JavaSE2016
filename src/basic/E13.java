package basic;

/**
 * Created by Administrator on 2016/12/7.
 */
//一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
//        int n; // n + 100 = x*x;   n + 268 = y*y

//        int i = 101;
//        System.out.println(String.valueOf(Math.sqrt(i)).endsWith(".0"));
public class E13 {
    public static void main(String[] args) {
        for (int i =-100; ; i++) {
            if (String.valueOf(Math.sqrt(i+100)).endsWith(".0") && String.valueOf(Math.sqrt(i + 268)).endsWith(".0")) {
                System.out.println(i);
            }
        }
    }
}
