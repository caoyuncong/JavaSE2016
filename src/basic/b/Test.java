package basic.b;

/**
 * Created by Administrator on 2016/12/14.
 */
public class Test {
    public static void main(String[] args) {
        Business business=new Business(new UsbWriter());
        business.saveDate();
    }
}
