package oop;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/28.
 */
// 定义一个判断闰年的方法，
// 在main方法中调用该方法判断输入的一个年份是否是闰年
public class E1 {
    public void checkLeapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + "is leap year");
        } else {
            System.out.println(year + "is not leap year");
        }
    }

    public static void main(String[] args) {
        int year = getYear();
        if (year == 0) { // 需判断为0时，因为0符合year%400==0的条件
            year=getYear();
        }
        E1 e1 = new E1();
        e1.checkLeapYear(year);
    }

    private static int getYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input year: ");
        int year;
        try {
            year = scanner.nextInt();
            if (year <= 0) {
                System.out.println("invalid year.");
                return 0;
            }
        } catch (Exception e) { // java.util.InputMismatchException 输出字母异常
            System.out.println("invalid year.");
            return 0;
        }
        return year;
    }
}
