package additional;

import java.io.*;

/**
 * Created by Administrator on 2017/1/2.
 */
/*在本地 E:/numbers.txt 添加如下两行数据：

        89,90,77,87,66,54,328,890,99
        65,72,12,77,2,96,54,27,89
        编写程序读取此文件中的所有数字，
        并将重复的数字只保留一个写入另一个文件 E:/result.txt 中，
        每个数字中间用逗号隔开；最后一个数字后不能有逗号*/
public class E4 {
    public static void main(String[] args) {
        try(
                BufferedWriter writer=new BufferedWriter(new FileWriter("E:/numbers.txt"));
                BufferedReader reader=new BufferedReader(new FileReader("E:/numbers.txt"))
        ) {
            writer.write("89,90,77,87,66,54,328,890,99"+"\n");
            writer.write("65,72,12,77,2,96,54,27,89");
            int i;
            while ((i = reader.read()) != -1) {
                    writer.write(i);
                System.out.print(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//int i;
//long start = System.currentTimeMillis();
//            while ((i = inputStream.read()) != -1) {
//                    outputStream.write(i);
//                    }
// int i;
//            while ((i=reader.read())!=-1){
//                    System.out.print((char)i);
//                    }