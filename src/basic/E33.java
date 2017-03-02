package basic;

/**
 * Created by Administrator on 2016/12/8.
 */
//打印出杨辉三角形（要求打印出10行如下图）
//     1
//            1 2 1
//           1 3 3 1
// .........（略）
public class E33 {
    private static final int N = 66;

    public static long[] getLine(int n) {
        if (n == 1) {
            int[] ints = {1};
            return new long[]{1};
        }
        if (n == 2) {
            return new long[]{1, 2, 1};
        }
        long[] prev = getLine(n - 1); // 前一行
        long[] curr = new long[prev.length + 1];
        for (int i = 0; i < curr.length; i++) {
            if (i == 0 || i == curr.length - 1) {
                curr[i] = 1; // 第一个和最后一个元素都是1
            } else {
                curr[i] = prev[i - 1] + prev[i];
            }
        }
        return curr;
    }

    public static void main(String[] args) {
        here:
        // label
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < getLine(i + 1).length; j++) {
                if (getLine(i + 1)[j] < 0) {
                    System.out.println(i + 1);
                    break here;
                }
                System.out.print(getLine(i + 1)[j] + " ");
            }
            System.out.println();
        }

    }

}
