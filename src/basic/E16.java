package basic;

/**
 * Created by Administrator on 2016/12/8.
 */
//输出9*9口诀。
public class E16 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i >= j) {
                    System.out.print((i + 1) * (j + 1) + "\t");
                }
            }
            System.out.println();
        }
    }
}
