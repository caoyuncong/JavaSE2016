package basic.a;

/**
 * Created by Administrator on 2016/12/14.
 */
// 高层应用类 依赖于 底层模块类
// 强耦合   -    松散耦合     解耦合（解耦）
public class Business { // 业务
    private FloppyWriter floppyWriter;  // floppyWriter 是类，类属于引用数据类型，类的默认构造方法 初始化类的域为默认值  引用数据类型 null

    public Business(FloppyWriter floppyWriter) {
        this.floppyWriter = floppyWriter;
    }

    public void saveDate() {
        floppyWriter.writeToFloppy();
    }

}
