package basic;

/**
 * Created by Administrator on 2016/12/6.
 */
public class SE2 {

    public static void main(String[] args)
    {
        System.out.println("101到200间的素数有： ");
        int counter=0;
        for(int i=101;i<=200;i++)
        {
            boolean flag=true;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            {
                System.out.print(i+" ");
                counter++;
            }
            continue;
        }
    }
}


