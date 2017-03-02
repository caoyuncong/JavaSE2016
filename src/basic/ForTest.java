package basic;

/**
 * Created by Administrator on 2016/12/7.
 */
public class ForTest {
    public static void main(String[] args) {
//        long start=System.currentTimeMillis();//计算毫秒
        long start=System.nanoTime();//计算毫微秒
        int result=0;
//        for(int i=1;i<10;i++) {//循环变量 i
//            System.out.println(i);
//        }
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
//                break;
                continue;
            }
            System.out.println(j);
//            result+=(j+1);
        }//for 循环的快捷键  fori+tab
//        System.out.println(result);
//        System.out.println("total time："+(System.currentTimeMillis()-start));//System.currentTimeMillis()已经变化
        System.out.println("total time："+(System.nanoTime()-start));//System.nanoTime()已经变化
    }
}
