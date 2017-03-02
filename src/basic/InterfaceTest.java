package basic;

/**
 * Created by Administrator on 2016/12/14.
 */
//接口可以定义域和方法

//        Java 中，一个类可以实现多个接口
//        抽象类与接口之间的联系和区别
//        相同点
//        都不能实例化
//        都可以定义抽象方法
//        对于他们的子（实现）类做了限制和约束
//        不同点
//        抽象类可以定义具体方法，接口不能
//        类只能继承一个抽象类，可以实现多个接口
//        接口本身可以继承 extends 多个父接口
public interface InterfaceTest extends Aa, Bb, Cc, Dd {  // 与类处于同一个级别
    int ZERO = 0; // 默认为 public static final   接口的域都是公有常量  常量 定义域名大写
    String WINTER = "冬天";
    public static final double PI=Math.PI;

    public abstract void method(); // 默认为 public abstract 可以直接省略 public abstract  Ctrl+Shift+Enter《-》 鼠标从括号内跳出加分号
                                     // 接口的方法都是公有抽象方法
    public static void main(String[] args) {
//        InterfaceTest interfaceTest=new InterfaceTest(); //接口没有构造方法，不能实例化
        InterfaceTest interfaceTest = new E();
    }
}

interface Aa {
    void m1();
}

interface Bb {
    void m2();
}

interface Cc {
    void m3();
}

interface Dd {
    void m4();
}

class E implements InterfaceTest { //类实现接口必须实现接口的所有抽象方法

    @Override
    public void method() { //  接口是用来被实现的 implements

    }

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }
}

class InterfaceImpl implements InterfaceTest {

    @Override
    public void method() {

    }

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }
}

