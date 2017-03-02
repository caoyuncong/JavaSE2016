package basic;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Administrator on 2016/12/5.
 */
public class PrimitiveDataType {
    public static void main(String[] args) {
        boolean b = true;
        byte aByte = 1;
        char c = '2';
        short s = 32767;
        int i = 6;
        long aLong = 5L;
        float f = 1.5f;
        double d = 5D;
        System.out.println(b);
        System.out.println(aByte);
        System.out.println(s);
        System.out.println(i);
        System.out.println(aLong);
        System.out.println(f);
        System.out.println(d);
        System.out.println(Short.MIN_VALUE + "," + Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + "," + Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + "," + Long.MAX_VALUE);
        System.out.println(Float.MIN_VALUE + "," + Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE + "," + Double.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE + "," + Byte.MAX_VALUE);
        System.out.println((int) Character.MIN_VALUE + "," + (int) Character.MAX_VALUE);

    }
}
