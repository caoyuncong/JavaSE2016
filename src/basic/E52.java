package basic;

/**
 * Created by Administrator on 2016/12/8.
 */
// 求解汉诺塔 n 圆盘移动步骤
// n: 当前要移动的盘子的个数
// src: 从 src 柱子
// with: 利用 with 柱子
// dest: 到 dest 柱子
public class E52 {
    int counter;
    void hanoi(int n, String src, String with, String dest) {
        if (n == 1) {
            System.out.println(src + " - " + dest);
            counter++;
            return;
        }
        hanoi(n - 1, src, dest, with);
        System.out.println(src + " - " + dest);
        counter++;
        hanoi(n - 1, with, src, dest);
    }

    public static void main(String[] args) {
        E52 e52 = new E52();
        e52.hanoi(3, "basic.A", "basic.B", "basic.C");
        System.out.println(e52.counter);
    }
}
