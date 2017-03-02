package basic;

/**
 * Created by Administrator on 2016/12/16.
 */
public class MemberInnerClassTest {
    public static void main(String[] args) {
//        OuterClass.InnerClass innerClass=new OuterClass().new InnerClass();
//        OuterClass outerClass = new OuterClass();
//        outerClass.m();
//        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        OuterClass.InnerClass innerClass=new OuterClass.InnerClass();
        innerClass.print();
    }
}

//class OuterClass{
//    private int age=18;
//
//    void m() {
//        age=19;
//    }
//    class InnerClass{
//        void print() {
//            System.out.println(age);
//        }
//    }
class OuterClass {
    private static int age = 18;

    static void m() {
        age = 19;
    }

    static class InnerClass {
        void print() {
            System.out.println(age);
        }
    }
}
