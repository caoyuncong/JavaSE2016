package basic;

/**
 * Created by Administrator on 2016/12/9.
 */
public class Plane extends Vehicle {
    double height;

//    public basic.Plane(double speed, String color, double price, double weight) {
//        super(speed, color, price, weight);
//    }

    double fly() {
        System.out.println("flying...");
        return 9000;
    }


}
