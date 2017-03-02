package basic;

/**
 * Created by Administrator on 2016/12/15.
 */
public class PrimitiveTest { // 值传递
    // 传递参数的值
//    方法的参数是基本数据类型 primitives
//    方法中的改变不影响实际参数 references
    public static void test(boolean b) {
        System.out.println("B:" + b);
        b=false;
        System.out.println("C:" + b);
    }

    public static void main(String[] args) {
        boolean b;
        b=true;
        System.out.println("A:" + b);
        test(b);
        System.out.println("D:" + b);

    }
}
