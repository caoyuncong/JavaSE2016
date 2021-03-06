package oop;

/**
 * Created by Administrator on 2016/12/28.
 */
// 创建一个汽车类（Car）,为其定义两个属性：颜色和型号，
// 为该类创建两个构造方法： 第一个为无形参的构造方法，
// 利用其中方法将颜色和型号设置为红色、轿车 第二个为带参构造方法，
// 利用构造方法将颜色和型号设置为黑色、轿车，
// 另外为该类创建两个方法，分别用来显示颜色和型号
public class E6 {
    public static void main(String[] args) {
        Car car = new Car("black", "sedan");
        System.out.println(car.toString());
        Car car1 = new Car();
        System.out.println(car1.toString());
    }
}

class Car {
    private String color;
    private String type;

    public Car() {
        color = "red";
        color = "BMW";
    }

    public Car(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "color：" + color + ", type：" + type;
    }

}