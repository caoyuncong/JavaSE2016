package io;

import java.io.*;

/**
 * Created by Administrator on 2016/12/27.
 */
public class TryWithResourcesTest {
    public static void main(String[] args) {
        for (String s : (new File("c:/").list())) {
            System.out.println(s);
        }
        try(InputStream inputStream=new FileInputStream("c:/text")) {
            System.out.println((char)inputStream.read());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
class MyFileInputStream extends FileInputStream{

    public MyFileInputStream(String name) throws FileNotFoundException {
        super(name);
    }

   /* @Override
    public void close() throws IOException {
        super.close();
        System.out.println("closed..."); // Ctrl+o
    }*/

}