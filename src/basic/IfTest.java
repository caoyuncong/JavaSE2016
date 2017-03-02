package basic;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/6.
 */
public class IfTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input grade: ");
        int grade=scanner.nextInt();
        if (grade >= 90 && grade <= 100) {
            System.out.println("basic.A");
        } else if (grade >= 80) {
            System.out.println("basic.B");
        } else if (grade >= 60) {
            System.out.println("basic.C");
        } else if (grade >= 0) {
            System.out.println("basic.D");
        }

        if (grade>100) {
            System.out.println("basic.A++");
        }
        //Ctrl+Alt+t  选择使用

    }
}
