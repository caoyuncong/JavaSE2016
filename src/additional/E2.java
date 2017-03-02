package additional;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/30.
 */
/*项目根目录下已存在文件 data.txt，文件中存放用户名和密码，中间用逗号分隔，如：
        jack,1234
        tom,4567
        程序启动时：提示用户输入登录名和登录密码
        键盘录入用户名和密码
        在 data.txt 中获取用户名和密码，
        验证键盘录入的用户名和密码是否和 data.txt 中用户名密码匹配：
        是，控制台提示登录成功，并结束程序；否，控制台提示登录失败，并结束程序*/
public class E2 {
//    private static String userName;
//    private static String password;

    public static void main(String[] args) {
        try(
                BufferedWriter writer=new BufferedWriter(new FileWriter("c:/data.txt"));
                BufferedReader reader=new BufferedReader(new FileReader("c:/data.txt"))
                ) {
            writer.write("jack,1234\n");
            writer.write("tom,4567");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName=scanner.nextLine();
        System.out.println("请输入登录密码：");
        String password=scanner.nextLine();


    }
}
