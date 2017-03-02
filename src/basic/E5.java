package basic;

import java.util.Scanner;


//利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
public class E5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input grade：");
        int grade=scanner.nextInt();

//        String grade=scanner.nextLine();//>= 不能应用于String
        System.out.println((grade >= 90) ? "basic.A" : ((grade >= 60 && grade <= 89) ? "basic.B" : "basic.C"));

    }


}
