package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Administrator on 2016/12/27.
 */
public class BufferedReaderTest {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader("src/io/BufferedReaderTest.java"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
