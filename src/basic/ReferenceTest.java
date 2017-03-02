package basic;

/**
 * Created by Administrator on 2016/12/15.
 */
public class ReferenceTest {
    public static void main(String[] args) {
        Foo f = new Foo("f");
        changeReference(f);  // It won't change the reference!
//        modifyReference(f); // It will modify(改变) the object that the reference variable "f" refers to!
        System.out.println(f.getAttribute());
    }

    public static void changeReference(Foo a) {
        Foo b = new Foo("b");
        a = b;
    }

    public static void modifyReference(Foo c) {
        c.setAttribute("c");
    }
}

class Foo {
    private String attribute;

    public Foo(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}