package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Administrator on 2016/12/27.
 */
public class WriterTest {
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("data/test")) {
            writer.write("中文");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
