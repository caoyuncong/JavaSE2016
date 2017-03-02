package basic;

/**
 * Created by Administrator on 2016/12/7.
 */
//            x
//           xxx
//          xxxxx
//         xxxxxxx

//          xxxxx
//           xxx
//            x
//          要求只使用以下三种语句
//          1. System.out.print(" ")
//          2. System.out.print("x");
//          3. System.out.println("x")
public class E19 {
    //    public static void main(String[] args) {
//        for (int i = 0; i < 4; i++) {
//            // 1.
//            for (int j = 0; j < 3 - i; j++) {
//                System.out.print(" ");
//            }
//            // 2.
//            for (int k = 0; k < i * 2; k++) {
//                System.out.print("*");
//            }
//            // 3.
//            System.out.println("*");
//        }
    private static final int N = 77;

    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < N / 2 + 1; i++) {
//            // 1.
//            for (int j = 0; j < N / 2 - i; j++) {
////                Thread.sleep(1000);
//                System.out.print(" ");
//            }
//            // 2.
//            for (int k = 0; k < i * 2; k++) {
////                Thread.sleep(1000);
//                System.out.print("*");
//            }
//            // 3.
////            Thread.sleep(1000);
//            System.out.println("*");
//        }
//        for (int i = 0; i < N / 2; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < (N - 3) - (2 * i); k++) {
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < ((i < N / 2 + 1) ? (N / 2 - i) : (i - N / 2)); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < ((i < N / 2 + 1) ? (i * 2) : ((N - 3) - (2 * i - N - 2))); k++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }


}

