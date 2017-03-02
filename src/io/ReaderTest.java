package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**中文
 * Created by Administrator on 2016/12/27.
 */
public class ReaderTest {
    public static void main(String[] args) throws FileNotFoundException {
        Reader reader=null;
        try {
            reader = new FileReader("src/io/ReaderTest.java");
            int i;
            while ((i=reader.read())!=-1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null) {

                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        try(Reader reader1=new FileReader("src/io/InputStreamTest.java")) {
            int i;
            while ((i = reader1.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
