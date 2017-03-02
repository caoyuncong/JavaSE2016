package exception;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/26.
 */
public class CheckedExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {
        // RuntimeException = bug
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a file name with path: ");
        String file = scanner.nextLine();
//        try {
//            RandomAccessFile randomAccessFile = new RandomAccessFile("Hello.java","rw");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        RandomAccessFile randomAccessFile = new RandomAccessFile("text.txt","rw");
    }
}
