package basic; /**
 * Created by Administrator on 2016/12/6.
 */
import java.util.*;
public class SE6 {
    public static void main(String[] args) {
       Scanner sca =new Scanner(System.in);
       System.out.println("请输入两个数：");//输入两个数中间用空格隔开就行
         int m = sca.nextInt();
         int n = sca.nextInt();
         int temp,r;
         if(n<m) { temp=n; n=m; m=temp; }
         int p = n*m; while(m!=0) { r=n%m; n=m; m=r; }
         System.out.println("他们的最大公约数是："+n);
         System.out.println("他们的最小公倍数是："+p/n); }


}
