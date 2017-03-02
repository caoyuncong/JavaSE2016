package basic.b;

/**
 * Created by Administrator on 2016/12/14.
 */
public class Business {
    private DeviceWriter deviceWriter;

    public Business(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

    public void saveDate() {
        deviceWriter.writeToDevice();
    }
}
