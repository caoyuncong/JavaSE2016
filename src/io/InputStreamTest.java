package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2016/12/27.
 */
public class InputStreamTest {
    public static void main(String[] args) throws FileNotFoundException {

       /* try {
            InputStream inputStream=new FileInputStream("c:/text.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
        InputStream inputStream=null;
        try {
            inputStream = new FileInputStream("src/io/InputStreamTest.java");
//            int i=inputStream.read();
            int i;
//            while (i != -1) {
            while ((i=inputStream.read())!=-1){
                System.out.print((char)i);
//                i=inputStream.read();
            }
//            System.out.println(1/0);
//            inputStream.close(); // 放在此处可能执行不了，so 放在finally中
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream!=null) { // 如果inputStream为空，出现空指令异常
                try {
                    inputStream.close(); // NPE
                } catch (IOException e) {
                    e.printStackTrace();
                }
                /////////


            }

        }
        try (InputStream inputStream1=new FileInputStream("src/io/InputStreamTest.java")) {
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.println((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
