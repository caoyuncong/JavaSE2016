package additional;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/1/16.
 */
//编程实现一个控制台打字测试，计算并输出正确率
public class E9 {
    //    如何使用System.out.println在控制台中打印颜色？
    private static final char[] alphabet = new char[52];
    private static final int NUMBER = 20;
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";

    private static String currentRandomString;

    static {
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('a' + i);
            alphabet[i + 26] = (char) ('A' + i);
        }
        currentRandomString = "";
    }

    private static void printRandomString() {
        Random random = new Random();
        for (int i = 0; i < NUMBER; i++) {
            currentRandomString += alphabet[random.nextInt(52)];
        }
        System.out.print(currentRandomString);
        System.out.println();
    }

    private static void check() {
        Scanner scanner = new Scanner(System.in);
        String answerString = scanner.nextLine();
        int minLength = Math.min(currentRandomString.length(), answerString.length());
        int correctCounter = 0;
        for (int i = 0; i < minLength; i++) {
            if (answerString.charAt(i) == currentRandomString.charAt(i)) {
                correctCounter++;
                System.out.print(ANSI_GREEN + answerString.charAt(i) + ANSI_RESET);
            } else {
                System.out.print(ANSI_RED + answerString.charAt(i) + ANSI_RESET);
            }
        }
        System.out.println();
        double length = currentRandomString.length();
        System.out.println("accuracy: " + (correctCounter / length) * 100 + "%");
    }

    public static void main(String[] args) {
        printRandomString();
        check();
    }
}
