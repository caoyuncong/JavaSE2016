package io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Administrator on 2016/12/27.
 */
public class FileTest {
    public static void main(String[] args) {
        File file=new File("data/test");
        System.out.println(file.isFile());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        file = new File("data/text");
        System.out.println(file.isDirectory());

        file=new File("data/text");
//        try {
//            System.out.println(file.createNewFile());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println( file.delete());
//        file.deleteOnExit();
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getParentFile());
        System.out.println(file.getPath());
        System.out.println(file.getTotalSpace());
        // 214749409280/1024/1024/1024=200 C盘的容量
        System.out.println(file.length());
        System.out.println(file.getUsableSpace());
        // 178289713152/1024/1024/1024=166 C盘可用于此虚拟机的字节数
        System.out.println(file.isAbsolute());
        // 测试此抽象路径名是否为绝对路径名。
        System.out.println(file.isHidden());
        // 测试此抽象路径名指定的文件是否是一个隐藏文件。
        System.out.println(new Date(file.lastModified()));
        // 返回此抽象路径名表示的文件最后一次被修改的时间。
        file = new File("data");
        for (String s : file.list()) {
            System.out.println(s);
        }
        for (File file1 : file.listFiles()) {
            System.out.println(file1.length());
        }
        for (File file1 : file.listRoots()) {
            System.out.println(file1.getName());
        }
        file = new File("data/testDir");
        System.out.println(file.mkdir()); // 创建此抽象路径名指定的目录
        // 当且仅当已创建目录时，返回 true；否则返回 false
        file=new File("data/dir1/dir2/dir3");
        System.out.println(file.mkdirs()); //  创建此抽象路径名指定的目录，
        // 包括所有必需但不存在的父目录。
        // 当且仅当已创建目录以及所有必需的父目录时，返回 true；否则返回 false

        file = new File("data/test");
        file.renameTo(new File("data/test_new.txt"));
        file = new File("data/test_new.txt");
        System.out.println(new Date(file.lastModified()));
        file.setLastModified((2147483647L));
        System.out.println(new Date(file.lastModified()));
        file.setReadable(false);
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        file.setReadOnly();
        System.out.println(file.canWrite());
        file.setWritable(true);
        System.out.println(file.canWrite());
    }
}
