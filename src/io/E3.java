package io;

import java.io.*;

/**
 * Created by Administrator on 2016/12/29.
 */
// 编写程序向文本文件中写入自己的信息
// 格式为：姓名：XXX 性别：X 年龄：XX 班级：XXX，
// 将该信息读出后显示的屏幕上后把文件删除
public class E3 {
    public static void main(String[] args) {
        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter("data/info"));
                BufferedReader reader= new BufferedReader(new FileReader("data/info"))
        ) {
            writer.write("name:tester...\n");
            writer.write("age:19...\n");
            writer.write("class:001... ");

            writer.flush(); // close(); 隐式调用flush();

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
