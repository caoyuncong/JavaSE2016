package exception;

/**
 * Created by Administrator on 2016/12/26.
 */
// RuntimeException类及其子类是非受检异常
public class UncheckedExceptionTest {
    private static int[] ints={1,2,3};
    private static int index=3;

    public static void method() {
        try {
            System.out.println(ints[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(ints[2]);
        }

    }

    public static void main(String[] args) {
        try {
            // java.lang.ArithmeticException
            System.out.println(1 / 0);
            //  java.lang.StringIndexOutOfBoundsException
            System.out.println("hello".charAt(5));
            // java.lang.ArrayIndexOutOfBoundsException
            System.out.println((new int[]{1, 2, 3})[3]);
            // java.lang.NumberFormatException
            System.out.println(Integer.valueOf("132b"));
            // java.lang.NullPointerException NPE
            String s = "test";
            s = null;
            System.out.println(s.length());

        } catch (ArithmeticException e) {

        } catch (StringIndexOutOfBoundsException e) {

        } catch (ArrayIndexOutOfBoundsException e) {

        } catch (NumberFormatException e) {

        } catch (NullPointerException e) {

        }
        method();
        System.out.println("test...");

    }

}
