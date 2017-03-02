package basic;

/**
 * Created by Administrator on 2016/12/26.
 */
// 求一个3*3矩阵对角线元素之和。
public class E29 {
    public static void main(String[] args) {
        int[][] ints =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if (i == j) {
                    sum1 += ints[i][j];
                }
                if (i + j == ints.length - 1) {
                    sum2 += ints[i][j];
                }
            }
        }
        System.out.println(sum1 + "," + sum2);

    }
}
