import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/2/17.
 */
public class InputStreamTest {
    public static void main(String[] args) {
        try (InputStream inputStream=new FileInputStream("c:/new.txt")) {
            inputStream.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

