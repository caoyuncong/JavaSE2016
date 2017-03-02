package basic;

/**
 * Created by Administrator on 2016/12/12.
 */
public class PolyTest {
    double d;
    boolean b;

    public PolyTest() {
    }

    public PolyTest(double d) {
        this.d = d;
    }

    public PolyTest(boolean b) {
        this.b = b;
    }

    public PolyTest(double d, boolean b) {
        this.d = d;
        this.b = b;
    }
    // overload 重载

    void test(int i,String s) {

    }

    int test(String s,int b) {
        return 0;
    }

    public static void main(String[] args) {
        PolyTest polyTest=new PolyTest();
        polyTest.test("test",2);
    }
}

class Father{
    void method(int i) {
        System.out.println("method in father class...");
    }
}
class Son extends Father{  // Ctrl + o (override / overwrite)
//    @Override
    void method(int i) {
         super.method(i);// 子类显式调用父类构造方法时，super 必须在其构造方法的第一行  而调用成员方法 super 可以放后边
        System.out.println("method in son class...");

    }


//    void methd(int i) {
//        System.out.println("method in son class...");
//    }

}
class PlayDemo{
    public static void main(String[] args) {
        Father father = new Father();
        father.method(1);
        Son son=new Son();
        son.method(0);
    }

}


