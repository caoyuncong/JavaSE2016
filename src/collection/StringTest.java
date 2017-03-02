package collection;

/**
 * Created by Administrator on 2016/12/19 0019.
 */
public class StringTest {
    public static void main(String[] args) {
//        String strings="hello" ;
        String strings=new String("hello");
//        public char charAt(int 4){
//
//        }
        System.out.println(strings.charAt(2));
        String strings2=new String("how are you");
        System.out.println(strings.concat(strings2));
        System.out.println(strings.contains("o"));
        System.out.println(strings.endsWith("o"));
        String strings3 = new String("hello");
        System.out.println(strings.equals(strings3));
        System.out.println(strings.getBytes());
        System.out.println(strings.indexOf("l"));
        String strings4=new String("");
        System.out.println(strings4.isEmpty());
        System.out.println(strings2.lastIndexOf("o"));
        System.out.println(strings2.length());
        System.out.println(strings2.matches("[abc]"));

        char c=126;
        System.out.println(c);
        String s2 = "aaa";
        String s3 = new String("AAA"); // new 新建 另一个 地址
        System.out.println(s2 == s3); // == 比较的是地址
        System.out.println(s3.equalsIgnoreCase(s2)); // IgnoreCase  忽略大小写
        byte[] bytes=s2.getBytes();
        for (byte b : bytes) {
            System.out.println(b);
        }


    }
//    public String testUpperCase(String origin){
//        return"";
//    }

}
