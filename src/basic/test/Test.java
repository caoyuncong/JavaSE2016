package basic.test;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/12.
 */
public class Test {
    Scanner scanner = new Scanner(System.in);
    ArrayList arrayList = new ArrayList();
    Hashtable hashtable = new Hashtable();

    public static void main(String[] args) {
        System.out.println("Test...");
        int x = 2;
        System.out.println(Math.pow(2, 32)); // 次幂
        System.out.println(Math.abs(x)); //  绝对值
        System.out.println(((double)Integer.MAX_VALUE+1)*2);
        // Integer.MAX_VALUE = 2^31 - 1
        // Integer.MIN_VALUE = -2^31


        // 123.556 - 124,
        System.out.println(Math.round(123.656)); //Ctrl+Q   点中方法名，看JDK文档
        // 123.001 - 124
        System.out.println(Math.ceil(123.001d));
        // 123.999 - 123
        System.out.println(Math.floor(123.999d));
        System.out.println(Math.E);
        System.out.println(Math.PI);
        int i=1;
        Integer j=new Integer(2);
        System.out.println(i+j);
        //int - String
        int m = 125;
        System.out.println(Integer.toString(m) + 1);
        System.out.println(String.valueOf(m) + 1);
        //String - int
        String s = "123";
        System.out.println(Integer.decode(s) + 1);
        System.out.println(Integer.parseInt(s) + 1);
        System.out.println(Integer.valueOf(s) + 1);
        System.out.println(new Integer(s) + 1); // 使用 构造方法 而来
    }

}
