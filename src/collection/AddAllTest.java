package collection;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by Administrator on 2016/12/21 0021.
 */
public class AddAllTest {
    public static void main(String[] args) {
        ArrayList<SuperClass> superClasses = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            SuperClass superClass = new SubClass(i);
//            superClasses.add(superClass);
//        }
//        ArrayList<SuperClass> superClasses1 = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            SuperClass superClass=new SubClass(i);
//            superClasses1.add(superClass);
//        }
//        superClasses.addAll(superClasses1);
//        for (SuperClass superClass : superClasses) {
//            System.out.println(superClass.getI());
////            System.out.println(superClass.i);
//        }
        ArrayList<SuperClass> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            SuperClass superClass = new SuperClass(i);
            list1.add(superClass);
        }
//        ArrayList<SubClass> list2 = new ArrayList<>();
        /*Vector<Integer> vector = new Vector();
        for (int i = 0; i < 5; i++) {
            SubClass subClass = new SubClass(i);
            vector.add(subClass);
        }
        list1.addAll(vector);
        for (SuperClass superClass : list1) {
            System.out.println(superClass.getI());
        }*/
    }
}
class SuperClass{
    private int i;

    public SuperClass(int i) {
        this.i = i;
    }

    public void m() {
        System.out.println("m...");
    }

    public int getI() {
        return i;
    }
}

class SubClass extends SuperClass {
    public SubClass(int i) {
        super(i);
    }
}