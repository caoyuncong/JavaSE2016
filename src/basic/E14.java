package basic;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/8.
 */
//输入某年某月某日，判断这一天是这一年的第几天？
// (闰年： 西元年份除以400余数为0的，或者除以4为余数0且除以100不为余数0的，为闰年。)
public class E14 {
    private static boolean isLeapYear(int year) {
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("year: ");
//        int year = scanner.nextInt();
//        System.out.println("month: ");
//        int month = scanner.nextInt();
//        System.out.println("day: ");
//        int day = scanner.nextInt();
//        int n = 0;
//        switch (month) {
//            case 12:
//                n += 30; //  加的是上一个月的  去掉break 符合条件
//            case 11:
//                n += 31;
//            case 10:
//                n += 30;
//            case 9:
//                n += 31;
//            case 8:
//                n += 31;
//            case 7:
//                n += 30;
//            case 6:
//                n += 31;
//            case 5:
//                n += 30;
//            case 4:
//                n += 31;
//            case 3:
//                n += ((isLeapYear(year)) ? 29 : 28);
//            case 2:
//                n += 31;
//            default:
//                n += day;
//                break;
//        }
//        System.out.println(year + "-" + month + "-" + day + "是" + year + "年的第" + n + "天");

    }


}
