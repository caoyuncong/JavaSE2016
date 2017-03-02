package basic;

/**
 * Created by Administrator on 2016/12/13.
 */
//静态
//        可以修饰域和方法
//        静态的成员隶属于类对象
class ManKind {
    String name;
    static String earth;

    public static void method() {
//name=""; // 静态方法中只能直接引用静态成员
        earth="...";
//        this.earth=""; // 静态方法中不能使用 this 和 super
//        static int i;
         int i;
    }

    public void method2() {
//       static int i; //方法中不能定义静态变量
    }
}
public class StaticTestDemo {
    public static void main(String[] args) {
        ManKind manKind=new ManKind();
        manKind.name="张三";
        ManKind.earth ="张三种了一棵树";
        System.out.println(manKind.name);
        System.out.println(manKind.earth);
        ManKind manKind2=new ManKind();
//            staticTest2.name = "李四";
        System.out.println(manKind2.name);
        System.out.println(ManKind.earth);


//        manKind.earth="张三种了一棵树";
//        System.out.println(manKind.earth);
//        System.out.println(manKind2.earth);
    }

}
