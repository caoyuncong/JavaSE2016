package basic;

/**
 * Created by Administrator on 2016/12/6.
 */
public class SE3 {
    public static void main(String[]args)
    {
        for(int i=100;i<1000;i++)
        {
            int a=i%10;
            int b=i/10%10;
            int c=i/100;
            if(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)==i)
                System.out.print(i+"\t");
        }
    }

}
