package basic;

/**
 * Created by Administrator on 2016/12/13.
 */
//抽象：抽取“像”的部分
//        可以修饰类和方法
//        抽象类

//        抽象方法

public abstract class AbstractTest {
    public abstract void method(); // 抽象的方法必须声明在抽象类中   抽象的方法没有实现 // 没有方法体

    public abstract String test(int i, boolean b);

    public void m() {

    }

    public static void main(String[] args) {
        System.out.println("test...");
//        AbstractTest abstractTest=new AbstractTest(); // 抽象的类不能实例化
        SubAbstractTest subAbstract = new SubAbstractTest(); // 在抽象类的子类中被实现 // 实现实例化，调用方法
    }
}

class SubAbstractTest extends AbstractTest { // 抽象的类是用来被扩展的(继承父类实现扩展)
    @Override
    public void method() { // 抽象类的子类必须实现抽象类中所有的抽象方法

    }

    @Override
    public String test(int i, boolean b) { // 抽象类的子类必须实现抽象类中所有的抽象方法
        return null;
    }


}


