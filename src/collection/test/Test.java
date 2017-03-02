package collection.test;

/**
 * Created by Administrator on 2016/12/21 0021.
 */
public class Test {
    public static void main(String[] args) {
        C d = new D();
//        d.d(); // C 中没有  d() 方法
    }
}

interface A { // Iterable
    void a();
}

interface B extends A { // Collection
    void b();

}

interface C extends B { // List
}

class D implements C { // ArrayList
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    public void d() {

    }
}