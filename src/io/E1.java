package io;


import java.io.*;

/**
 * Created by Administrator on 2016/12/27.
 */
// 编写一个程序，在D盘根目录下创建一个以自己名称命名的文件夹
// 并在该文件夹下创建一个以自己名称命名的文本文件。
public class E1 {
    public static void main(String[] args) {
        File file = new File("d:/caoyuncong");
        file.mkdir();
        file = new File("d:/caoyuncong/caoyuncong.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}