package io;

import javax.print.attribute.standard.OrientationRequested;
import java.io.*;
import java.net.URL;

/**
 * Created by Administrator on 2017/1/2.
 */
public class DownloadTest {
    private static final String LINK = "http://jiandan.net/tag/tech/page/";
    private static final String CONTAIN = "data-original";
    private static final String FROM = "data-original=\"";
    private static final String TO = "\"width";
    private static int counter;

    private static void saveImageUrls() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("data/image/liks"));
        for (int i = 0; i < 14; i++) {
            URL url = new URL(LINK + (i + 1));
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(CONTAIN)) {
                    String imageURL = line.substring(line.indexOf(FROM) + FROM.length(), line.indexOf(TO));
                    if ((imageURL.startsWith("//"))) {
                        imageURL = "http:" + imageURL;
                    } else if (!imageURL.startsWith("http")) {
                        imageURL = "http://" + imageURL;
                    }
                    writer.write(imageURL + "\n");
                }
            }
            reader.close();
        }
        writer.close();
    }
}
