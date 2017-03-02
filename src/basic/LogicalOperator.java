package basic;

/**
 * Created by Administrator on 2016/12/6.
 */
public class LogicalOperator {
    public static void main(String[] args) {
        boolean b1=true;
        boolean b2=false;
        boolean b3=true;
        boolean b4=false;
        boolean b5=true;
        boolean b6=true;
        System.out.println(b1 & b2);
        System.out.println(b1 | b2);
        System.out.println(b1 ^ b2);//异或   两个相同，为假，否则，为真
        System.out.println(b1 && b2);
        System.out.println(b1 || b2);
        System.out.println(!b1);
        System.out.println(!b2);
        System.out.println(b3 & b4);
        System.out.println(b3 | b4);
        System.out.println(b3 ^ b4);//异或   两个相同，为假，否则，为真
        System.out.println(b3 && b4);
        System.out.println(b3 || b4);
        System.out.println(!b3);
        System.out.println(!b4);

        int x=1;
        int y=2;
//        System.out.println((x>y)&(y++>0));
//        System.out.println(y);
        System.out.println((x>y)&&(y++>0));
        System.out.println(y);// &&  ||  短路规则 若第一个已确定结果，不再判断后面的
    }
}
