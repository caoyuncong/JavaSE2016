package basic;

/**
 * Created by Administrator on 2016/12/9.
 */
public class Car extends Vehicle{
    String powerType; // 动力类型
    int tireNumber; // 车轮个数

    public Car(double speed, String color, double price, double weight, String powerType, int tireNumber) {
        super(speed, color, price, weight);
        this.powerType = powerType;
        this.tireNumber = tireNumber;
    }
// 隐式   显式
//    super 指代父类
//父类有无参构造方法
//        子类可以隐式调用父类的无参构造方法
// 父类没有无参构造方法
//            子类必须显式调用父类的有参构造方法
//    子类显式调用父类构造方法时，super 必须在其构造方法的第一行

    Car() {

//         super();
    }
    void addOil() {
    }

    void charge() {

    }

}
