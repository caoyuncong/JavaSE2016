package basic;

/**
 * Created by Administrator on 2016/12/9.
 */
public class VehicleTest {
    public static void main(String[] args) {
//        basic.Vehicle vehicle=new basic.Vehicle(10, "black",500D,10D);
        Car car=new Car(100, "white", 300000, 1500, "fuel", 4);
        Car carNew = new Car();
        Plane plane=new Plane();
        System.out.println(car.color); //调用无参构造方法  String 是类 ，属于引用数据类型  null是引用数据类型的直接量
//        System.out.println(vehicle.color);
//        System.out.println(plane.fly());
        System.out.println(car.powerType);
        System.out.println(car.tireNumber);

    }
}
