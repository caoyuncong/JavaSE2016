package basic.b;

/**
 * Created by Administrator on 2016/12/14.
 */
public class FloppyWriter implements DeviceWriter {
    @Override
    public void writeToDevice() {
        // ....
        System.out.println("save to floppy.");
    }
}
