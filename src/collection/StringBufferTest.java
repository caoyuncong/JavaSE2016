package collection;

/**
 * Created by Administrator on 2016/12/19 0019.
 */
public class StringBufferTest {
    private static final String ABCDE = "abcde";

    public static void main(String[] args) {
        String string1 = "hello";
        System.out.println(new StringBuffer(string1));
        String string="";
        StringBuffer stringBuffer = new StringBuffer();
        long start=System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            string+=ABCDE;
            stringBuffer.append(ABCDE);
        }
        System.out.println(stringBuffer.length());
        System.out.println(System.currentTimeMillis()-start);

        StringBuffer stringBuffer1 = new StringBuffer("hello");
        System.out.println(stringBuffer1.delete(1,4)); // Delete
        System.out.println(stringBuffer1.insert(0,true)); // Create
        System.out.println(stringBuffer1.reverse());
        System.out.println(stringBuffer1); // Retrieve   重新得到
        stringBuffer1.setCharAt(0, 'h'); // Update
        System.out.println(stringBuffer1);
    }

}
