package basic;

/**
 * Created by Administrator on 2016/12/15.
 */
public class ReferenceTest2 { //：String类型以及基本数据类型的封装类是特例（还是值传递）
    // Integer Short Byte Short Long Float Double Boolean
    //    public static void test(String s) {
//        System.out.println("B:" + s);
//        s="男";
//        System.out.println("C:" + s);
//    }
//
//    public static void main(String[] args) {
//        String s;
//        s="女";
//        System.out.println("A:" + s);
//        test(s);
//        System.out.println("D:" + s);
//
//    }
    public static void test(Integer i) {
        System.out.println("B:" + i);
        i++;
        System.out.println("C:" + i);
    }

    public static void main(String[] args) {
        Integer i;
        i = 5;
        System.out.println("A:" + i);
        test(i);
        System.out.println("D:" + i);

    }

}
