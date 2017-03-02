package io;

import java.io.*;

/**
 * Created by Administrator on 2016/12/27.
 */
public class BufferedInputStreamAndBufferedOutputStreamTest {
    public static void main(String[] args) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("F:/KuGou2012/KuGou.exe"));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("F:/new.exe"))) {
            int i;
            long start = System.currentTimeMillis();
            while ((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(i);
            }
            System.out.println((System.currentTimeMillis() - start) / 1000 + "seconds.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
