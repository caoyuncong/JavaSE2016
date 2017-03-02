package basic;

/**
 * Created by Administrator on 2016/12/5.
 */
public class CharTest {
    public static void main(String[] args) {
        char c1 = 1;//1.
        char c2 = 'a';//2  a - 97 basic.A - 65
        char c3 = '\123';
        char c4='\u9fbb';//unicode [\u4E00,\u9FBB]
        char c5='\t';// 5 t - tab
        System.out.println(c1);
        System.out.println((int)c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.print(c5);
        System.out.println("test");
        System.out.println((int)'中');//中对应的char值
        System.out.println("a");//ln 表示的单词line
        System.out.println("b");

    }
}
