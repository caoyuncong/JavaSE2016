package oop;

import java.util.Scanner;
// Ctrl+Alt+o (optimize import)优化导入语句

/**
 * Created by Administrator on 2016/12/28.
 */
//编写一个立方体类，包含这样的属性：长度、宽度、高度等信息，
// 通过方法来计算它的体积
public class E2 {
    public static void main(String[] args) {
        Cube cube=getCube();
        if (cube==null) {
            cube=getCube();
        }
        System.out.println(cube.getVolume());
    }

    public static Cube getCube() {
        double length=0;
        double width=0;
        double height=0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("input length: ");
            length = scanner.nextDouble();
            System.out.println("input height: ");
            height = scanner.nextDouble();
            System.out.println("input width: ");
            width = scanner.nextDouble();
            if (length <= 0 || width <= 0 || height <= 0) {
                System.out.println("invalid.");
                return null;
            }
        } catch (Exception e) {
            System.out.println("invalid.");
            return null;
        }
        System.out.println(new Cube(length, width, height));
        return new Cube(length, width, height);

    }

}

class Cube {
    private double length;
    private double height;
    private double width;

    public Cube(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "length=" + length +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
//  int i;
//boolean b = true;
//        if (b) {
//                i = 1;
//          } else {
//                i = 2;
//          }
//                System.out.println(i);





