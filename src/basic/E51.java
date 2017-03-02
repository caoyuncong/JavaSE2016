package basic;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/6.
 */
//斐波那契数列：1，1，2，3，5，8...，求f(n)
//f(n)=1(n=1 n=2)
//f(n)=f(n-1)+f(n-2)  (n>2)
//递归调用 recursive call
public class E51 {
    int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);//递归调用 recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input n:");
        int n = sc.nextInt();
        E51 e51 = new E51();//调用默认的构造方法
        System.out.println("F(" + n + ")=" + e51.fibonacci(n));

    }

}
