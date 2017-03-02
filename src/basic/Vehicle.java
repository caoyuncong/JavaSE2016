package basic;

/**
 * Created by Administrator on 2016/12/9.
 */
public class Vehicle { //交通工具
    double speed;
    String color;
    double price;
    double weight;
//    basic.Vehicle(){ // 如果显式声明的构造方法，默认构造方法将不存在
//
//    }

    public Vehicle(double speed, String color, double price, double weight) {
        this.speed = speed;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    public Vehicle() {
        System.out.println("vehicle constructor...");
    }

    void run() {
        System.out.println("run...");
    }
    void stop(){
        System.out.println("stopped...");
    }


}
