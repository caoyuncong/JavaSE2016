package basic;

/**
 * Created by Administrator on 2016/12/8.
 */
//求[0, 7]所能组成的奇数个数。
public class E43 {
    public static void main(String[] args) {
//        int sum=4;
//        int j;
//        System.out.println("组成1位数是"+sum+" 个");
//        sum=sum*7;
//        System.out.println("组成2位数是"+sum+" 个");
//        for(j=3;j<=9;j++){
//            sum=sum*8;
//            System.out.println("组成"+j+"位数是 "+sum+" 个");
//        }
        // 0 1 2 3 4 5 6 7
        int counter = 0;
        for (int i = 1023456; i <= 6543210; i++) {
            if (i %2 != 0) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println((76543210-10234567)/2);
        System.out.println(counter);
    }
}
