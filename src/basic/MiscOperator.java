package basic;

/**
 * Created by Administrator on 2016/12/6.
 */
public class MiscOperator {
    public static void main(String[] args) {
        char c='中';
        int i=c;
        System.out.println(i);
        int x=100000;
        char y=(char)x;
        System.out.println((int)y);//强制类型转换是有风险的
        int z=1+2*4/5%3;
        System.out.println(z);
        int j=123456789;
        double d=j;
        System.out.println(d);
    }

}
