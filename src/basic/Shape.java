package basic;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.function.DoubleToIntFunction;

/**
 * Created by Administrator on 2016/12/9.
 */
//basic.Shape 形状
// 求周长，求面积
// 正方形，长方形，圆形，三角形
// 测试类
public abstract class Shape {
    public abstract double getPerimeter();

    public abstract double getArea();
}

class Square extends Shape {
    private double length; // 边长

    public Square(double length) { // 构造方法
        this.length = length;
    }

    public double getPerimeter() {
        return length * 4;
    }

    public double getArea() {
        return length * length;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (a + b <= c || b + c <= a || c + a <= b) {
            System.out.println("error.");
            System.exit(0);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c)/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Square square = new Square(1.5);
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        Triangle triangle = new Triangle(2d, 2d, 3d);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
        Circle circle = new Circle(3);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
    }
}
