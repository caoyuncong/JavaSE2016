package io;

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrator on 2016/12/28.
 */
public class URLTest {
    public static void main(String[] args) throws IOException {
//
//        URL url = new URL("http://jandan.net/tag/nasa");
//        BufferedReader reader=new BufferedReader(new InputStreamReader(url.openStream())

        URL url = new URL("");
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}