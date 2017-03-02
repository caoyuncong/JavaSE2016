package basic;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/8.
 */
//类=域+方法
//class=field+method
    //域   与   变量的定义相同，在
public class Human extends Object implements Serializable{ // Alt + 7
    //有相同的特征或属性
   // name sex
    String name;
    int age;
    char gender;  //性别：男  女
    double height;
    double weight;
    boolean isMarried;
    Human(){//构造方法  构造器  constructor
            //与类同名
          //   没有返回类型
    }

    public Human(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Human(String name, int age, char gender, double height, double weight, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.isMarried = isMarried;
    }

    // 有相同的行为或功能
    //run smile look
    // Ctrl + Shift + '+' / '-'
    String study(int i, String s){//形式参数
        System.out.println(name+"study...");
        return s+i;
    }

    void work(){
        study(1, "");//实际参数   invoke method
        System.out.println("work...");
        for (int i = 0; i < 10; i++) {
            if (height > 1.8) {
                return;
            }
        }
        System.out.println("....");
    }
    int work1(){
        study(1, "");
        for (int i = 0; i < 10; i++) {
            if (height > 1.8) {
                return 1;
            }
        }
       return 100;
    }
    int age(){
        return 9;
    }
    String method(){
        return null;
    }//String 是类 ，属于引用数据类型  null是引用数据类型的直接量
       //对象/实例/实例对象 instance
      //具体的
      //  类来生成
       //new 创建或生成一个类的对象，总是调用类的构造方法
         //   . 调用域或方法
    public static void main(String[] args) {
        Human human=new Human("张三", 5, '男',1.8, 56.0,false );
        //对象  类是创建对象的模板 变量 human new       //Ctrl+p(parameter)
        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.height);
        System.out.println(human.isMarried);
        human.work();
        human.study(1,"");
        System.out.println(human.work1());
        System.out.println(human.study(1,""));

    }
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
