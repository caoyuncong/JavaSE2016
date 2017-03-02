package basic;

/**
 * Created by Administrator on 2016/12/9.
 */
public class Inheritance {
    public static void main(String[] args) {  // Alt + Ctrl [+ Shift] + U  UML  放在类名附近
        D d=new D();
        d.d();
        d.c();
        d.b();
        d.a();
        System.out.println(d instanceof A); //instanceof 判断对象是否是类的实例  直接量为 boolean
    }
}

    class A{
        void a() {
            System.out.println("a....");
        }
    }
    class B extends A{
        void b() {
            System.out.println("b....");
        }
    }
    class C extends B{
        void c() {
            System.out.println("c....");
        }
    }
    class D extends C {
        void d() {
            System.out.println("d....");
        }
    }

