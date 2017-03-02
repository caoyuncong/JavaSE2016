package basic;

/**
 * Created by Administrator on 2016/12/13.
 */
//终态
//        可以修饰类、域和方法
//
//        终态的域
//        初始化之后值不能再被修改
//
//        静态并终态的域
//        只能在声明时初始化
//        初始化之后值不能再被修改
//
public final class FinalTest {
    private static final int ONE_TWO_THERE = 123;  //  常量，都是大写字母，单词之间用下划线 _ 分隔
//    private static final int one=1; //  静态并终态的域
    //        只能在声明时初始化
//    private final int i = 0;  // 第一种
    int one=1;
    private final int i;


    public FinalTest(int i) {
        this.i = i; // 第三种
//        one=1;

    }


    public FinalTest() {
        i = 0; // 第二种
//        one=1;

    }

    public final void method() {
//        int i=1; //只能在声明时或构造方法中被初始化
        System.out.println("test...");
    }
}

//class SubFinalTest extends FinalTest { // 终态的final 类不能再被子类化

//    @Override       // 终态的方法不能在子类中被重写
//    public void method() {
//        super.method();
//        System.out.println("new test...");
//    }
//}
