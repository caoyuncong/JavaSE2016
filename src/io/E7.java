package io;

import java.io.*;

/**
 * Created by Administrator on 2017/1/2.
 */
//  创建一个文件夹，分别向该文件夹下复制几个图片，
// 文本文件和JAVA源程序
public class E7 {
    public static void main(String[] args) {
        try (
                BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("C:/Users/Administrator/IdeaProjects/bootstrap/img/TFBOYS.jpg"));
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("C:/Users/Administrator/IdeaProjects/TFBOYS.jpg"))
        ) {
            int i;
            while ((i=inputStream.read())!=-1){
                outputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
