package io;

import java.io.*;

/**
 * Created by Administrator on 2017/1/2.
 */
// 编写程序，能将C盘的某一文件复制到D盘
public class E6 {
    public static void main(String[] args) {
        File file = new File("src/io/E6.java");
        try (
                BufferedReader reader = new BufferedReader(new FileReader(file));
                BufferedWriter writer=new BufferedWriter(new FileWriter(("data/E6.java")))
        ) {
           String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
