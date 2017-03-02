package io;

import java.io.*;

/**
 * Created by Administrator on 2016/12/27.
 */
public class InputStreamOutputStreamTest {
    public static void main(String[] args) {
        try(
                InputStream inputStream=new FileInputStream("E:/JiaKa/伽卡他卡电子教室学生端15.8.exe");
                OutputStream outputStream=new FileOutputStream("E:/J.exe")
                ) {
            int i;
            long start = System.currentTimeMillis();
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println((System.currentTimeMillis() - start) / 1000 + " seconds.");
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
