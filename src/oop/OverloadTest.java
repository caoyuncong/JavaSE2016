package oop;

/**
 * Created by Administrator on 2016/12/30.
 */
public class OverloadTest {
    public static void main(String[] args) {

    }
}

class Father extends Object {
    private String s;

    public Father() {
        super();
        //super(); 隐式调用 Object无参构造方法
    }

    public Father(String s) {
        super();
//        Father(); // 不能被其它的构造方法调用 super()放在第一行
//        如果调用无参构造方法，相当于两个super()，第二个super()没在第一行
        this.s = s;
    }

    public void method() {
        Father father=new Father(); // 一个类中的构造方法能被
        // 该类中的其它方法调用
    }

}

class Son extends Father {
    public void m1() { // overload

    }

    public void m1(int i) { // overload

    }

    public void method(String s) { // overload

    }

    @Override
    public void method() { // override overwrite
        super.method();
    }
}