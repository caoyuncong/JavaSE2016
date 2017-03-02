package basic;

/**
 * Created by Administrator on 2016/12/15.
 */
//变量作用域范围
//变量（方法）产生作用的有效范围
//        类作用域范围
//        类的起始 { 到类的终止 }
//        类的域和方法
//        块 block 作用域范围
//        从变量声明之处，到当前块结束之处
//        方法中的局部变量 local variable ，方法的参数，循环的变量
public class ClassScodeTest {
    private int i;
    private String s;

    public void methed(double d) {
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
        for (int j = 0; j < 100; j++) {
            System.out.println(j);
        }
        boolean b = false;
        System.out.println(d);
//        String i="hi";
        int i = 100;
        System.out.println(i); //  方法内的局部变量可以覆盖同名的域   i=100 覆盖了 成员域中 的   i
        System.out.println(this.i);
        s = "hi";
        System.out.println(b);
    }

    public static void main(String[] args) {
        ClassScodeTest classScodeTest = new ClassScodeTest();
        classScodeTest.methed(0d);
    }
}
