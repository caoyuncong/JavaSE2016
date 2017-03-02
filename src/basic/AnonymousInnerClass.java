package basic;

/**
 * Created by Administrator on 2016/12/16.
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
//        SuperClass subClass=new SubClass();
//        subClass.method();
        SuperClass superClass=new SuperClass() {
            @Override
            void method() {
                System.out.println("new test...");
            }
        };
        superClass.method();
        InterfaceTest interfaceTest=new InterfaceTest() {
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
                System.out.println("m3...");
            }

            @Override
            public void m4() {

            }
        };
        interfaceTest.m3();
    }
}

abstract class SuperClass {
    abstract void method();
}

//class SubClass extends SuperClass {
//
//    @Override
//    void method() {
//        System.out.println("test...");
//    }
//}
