package additional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/30.
 */
/*
随机生成 6 个 [0-15] 的数字，作为彩票的中奖号码，要求最终的中奖号码没有重复数字
键盘录入 6 个 [0-15] 的数字
比较录入的数字和中奖号码相同的个数：
小于3个，没有中奖
当3个一样，中三等奖
当4个一样，中二等奖
当5个一样，中一等奖
当全部一样，中特等奖
在控制台打印中奖结果，样式如下：
您的号码为 XX,XX,XX,XX,XX,XX，中了 X 等奖
或者
您的号码为 XX,XX,XX,XX,XX,XX，没有中奖
 */
public class E1 {
    private static Integer[] NUMBERS;
    private static Integer[] USER_NUMBERS;

    public static void main(String[] args) {
//        getUserNumbers();
        getRandomUserNumbers();
        initNumbers();
        int times=compare();
        printResult(times);

    }

    private static void getRandomUserNumbers() {
        USER_NUMBERS=initNumbers();
    }

    private static void printResult(int times) {
        String n="";
        if (times< 3) {
            System.out.println("您的号码为 " + Arrays.toString(USER_NUMBERS) + ",没有中奖");
            return;
        } else if (times == 3) {
            n = "三";
        } else if (times == 4) {
            n = "二";
        } else if (times == 5) {
            n = "一";
        } else {
            n = "特";
        }
        System.out.println("您的号码为 "+ Arrays.toString(USER_NUMBERS)+",中了"+n+"等奖");

    }
    private static int compare() {
        int times=0;
        for (int i = 0; i < USER_NUMBERS.length; i++) {
            for (int j = 0; j < NUMBERS.length; j++) {
                if (USER_NUMBERS[i] == NUMBERS[j]) {
                    times++;
                    break;
                }
            }
        }
        return times;
    }

    private static Integer[] initNumbers() {
        NUMBERS = new Integer[6];
        Random random = new Random();
        int counter=0;
        while (counter != 6) {
            Integer r=random.nextInt(16);
            if (!contains(r)) {
                NUMBERS[counter++]=r;
            }
        }
        System.out.println(Arrays.toString(NUMBERS));
        return NUMBERS;
    }

    private static boolean contains(Integer random) {
        for (Integer number : NUMBERS) {
            if (random.equals(number)) {
                return true;
            }
        }
        return false;
    }

//    private static void getUserNumbers() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("input 6 numbers,eg: 1 2 10 ...");
//        String input=scanner.nextLine();
//        USER_NUMBERS = new Integer[6];
//        for (int i = 0; i < USER_NUMBERS.length; i++) {
//            USER_NUMBERS[i] = Integer.valueOf(input.split(" ")[i]);
//        }
//    }

}
