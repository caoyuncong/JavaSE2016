package basic;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/6.
 */
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input grade level:");
        String level=sc.nextLine();
        switch(level){
            case "basic.A":
                System.out.println("[90,100]");;
                break;
            case "basic.B":
                System.out.println("[80,90)");
                break;
            case "basic.C":
                System.out.println("[60,80)");
                break;
            case "basic.D":
                System.out.println("[0,60)");
                break;
            default:
                System.out.println("error.");
                break;
        }
    }
}
