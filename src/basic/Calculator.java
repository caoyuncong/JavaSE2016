package basic;

/**
 * Created by Administrator on 2016/12/12.
 */
public class Calculator {
    //int int
    //float float
    //double double
    //long long
    int add(int x,int y) {
        return x+y;
    }

    long add(long a,long b) {
        return a+b;
    }

    float add(float c, float d) {
        return c+d;
    }

    double add(double j, double z) {
        return j+z;
    }

    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.add(6,9);
        calculator.add(6L,9L);
        System.out.println(calculator.add(6,9));

    }



}
