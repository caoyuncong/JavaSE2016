package basic;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Administrator on 2016/12/6.
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        int x=9;
        int y=8;
        System.out.println(x/y);
        System.out.println(x+y);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(1d/2d);
        System.out.println(-100 % 3);//        余数的符号与被除数的符号一致
        System.out.println(100 % -3);
        System.out.println(-100 % -3);
        System.out.println(100 % 3);
        System.out.println(1/0d);
        System.out.println(1+"1");//+ 在数值与字符串中的运算规则
//                + 的运算顺序是从左至右，其他类型与字符串的 + 为字符串拼接
        System.out.println(1+1+"1"+1+1);//+ 运算顺序  从左到右
        // 先计算1+1=2，后面+1+1，前面有字符串“1”都变成字符串相加

    }

}
