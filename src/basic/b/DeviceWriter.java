package basic.b;

/**
 * Created by Administrator on 2016/12/14.
 */
public interface DeviceWriter {
    public static final double PI=3.14; // 接口的域都是公有常量
    public abstract void writeToDevice(); //   接口的方法都是公有抽象方法
}
