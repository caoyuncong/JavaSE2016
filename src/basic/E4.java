package basic;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

//将一个正整数分解质因数。例如：输入90，打印出90=2*3*3*5。

public class E4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input N：");
        int n=sc.nextInt();
        System.out.print(n + " = ");
        boolean b = true;
        while (n != 1) {// n!=1  是终止条件
            for (int i = 2; i < n + 1; i++) {
                if (n % i == 0) {
                    if (b) {
                        System.out.print(i);
                        b = false;
                    } else {
                        System.out.print(" * " + i);
                    }
                    n /= i;//   n=n/i
                    break;
                }
            }
        }

    }
}
