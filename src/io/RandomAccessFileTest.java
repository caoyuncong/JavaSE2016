package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 2016/12/27.
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("data/raf", "rw")) {
            for (int i = 0; i < 10; i++) {
                randomAccessFile.writeInt(i);
            }
            randomAccessFile.seek(4 * 5); //  pos position
            System.out.println(randomAccessFile.readInt()); // End Of File
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
