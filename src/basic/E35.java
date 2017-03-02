package basic;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

/**
 * Created by Administrator on 2016/12/26.
 */
// 输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，
// 输出数组。
public class E35 {
    public static void main(String[] args) {
        int[] ints = {-1, 0, 3000, -1000, 2, 100};
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < ints[minIndex]) {
                minIndex = i;
            }
            if (ints[i] > ints[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println(Arrays.toString(ints));

        int temp = ints[0];
        ints[0] = ints[maxIndex];
        ints[maxIndex]=temp;

        temp = ints[ints.length - 1];
        ints[ints.length - 1] = ints[minIndex];
        ints[minIndex]=temp;

        System.out.println(Arrays.toString(ints));

    }
}