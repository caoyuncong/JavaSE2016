package io;

import java.io.File;

/**
 * Created by Administrator on 2017/1/2.
 */
// 编写程序，列出某一目录下的所有的JAVA文件
public class E5 {
    public static void main(String[] args) {
        File file = new File("src/io");
        for (String s : file.list()) {
            String extension = s.substring(s.lastIndexOf(".") + 1);
            if (extension.equalsIgnoreCase("java")) {
                System.out.println(s);
            }
        }
    }
}
