package oop;

import java.text.DecimalFormat;

/**
 * Created by Administrator on 2016/12/28.
 */
// 将圆周率定义为常量，编写一个求圆面积的方法，
// 调用此方法来求圆的面积
public class E4 {
    private static final double PI=3.1415;

    public static double getCircleArea(double radius) {
        return PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        double radius=2d;
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        System.out.println(decimalFormat.format(getCircleArea(radius)));
        System.out.printf("%.3f",getCircleArea(radius));

    }
}
