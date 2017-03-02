package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Administrator on 2016/12/27.
 */
public class OutputStreamTest {
    public static void main(String[] args) {
        try (OutputStream outputStream=new FileOutputStream("c:/new.txt")) {
            outputStream.write(97);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
