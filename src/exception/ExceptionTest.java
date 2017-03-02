package exception;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/1/2.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int x = 1;
            int y = 0;
            System.out.println(x / y);
            System.out.println("hi".charAt(2));
        } catch (ArithmeticException | StringIndexOutOfBoundsException e) {
        }
    }

    ArrayList<String> strings = new ArrayList<>(); // diamond 钻石
}
