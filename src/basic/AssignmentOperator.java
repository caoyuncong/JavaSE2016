package basic;

/**
 * Created by Administrator on 2016/12/6.
 */
public class AssignmentOperator {
    public static void main(String[] args) {
        int x=100;
        x+=100;
        System.out.println(x);
        x -= 100;
        System.out.println(x);
        x*=100;
        System.out.println(x);
        x/=100;
        System.out.println(x);
        x%=100;
        System.out.println(x);
        x &=100;
        System.out.println(x);
        x |=100;
        System.out.println(x);
        x ^=100;
        System.out.println(x);
        boolean y=true;
        y&=false;
        System.out.println(y);
        y|=true;
        System.out.println(y);
        y^=false;
        System.out.println(y);

    }
}
