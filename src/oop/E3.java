package oop;

/**
 * Created by Administrator on 2016/12/28.
 */
// 定义一个人类，包含姓名、性别、年龄等信息。所有的变量必须私有。
// 其他类只能通过该类的方法获取和修改。
// 实例化一个人类，试着通过该类的方法修改实例化的人的信息
public class E3 {
    public static void main(String[] args) {
        Person person = new Person("zjamh", 30, '男');
        System.out.println(person);
        person.setName("lili");
        System.out.println(person);

        Person person1 = new Person("tester");
        System.out.println("person1 = " + person1); // soutv + Tab

        Person person2=new Person("tester",'男');
        System.out.println("person2 = " + person2);
        // live templates
        System.err.println("error..."); // serr + Tab
        int x = 1;
        int y = 1;
    }
}
// 修改上次写的人类，使它有多个构造函数
// 可以用姓名构造一个人，也可以用姓名，性别构造一个人
class Person {
    private String name;
    private int age;
    private char sex; // gender

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "E3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
// 继承人类编写一个学生类，测试继承过来的属性和方法，并提供其它构造方法，并做如下试验：
//使用人类的构造方法参数格式去实例化一个学生
// 删除人类中不带参数的构造方法，观察学生类还能不能使用，
// 思考一下如果人类只有带参的构造方法，学生类应如何继承人类
//在学生类的构造方法中调用人类的构造方法
//在学生类的构造方法中先写一行其它代码，再去调用人类的构造方法
//在学生类的某一个构造方法里同时去调用学生类与人类的构造方法
class Educant extends Person{
    private String studentNumber;
    private int score;

    public static void main(String[] args) {
        Educant educant = new Educant("lili", 16, '男',"666665599", 96);
        System.out.println(educant.getName());
    }
    public Educant(String studentNumber, int score) {
        super();
        this.studentNumber = studentNumber;
        this.score = score;
    }

    public Educant(String name, int age, char sex, String studentNumber, int score) {
        super(name, age, sex);
//        Educant(studentNumber,score);
    }

    public Educant(String name) {
        super(name);
    }

    public Educant(String name, char sex) {
        super(name, sex);
    }

    public Educant(String name, int age, char sex) {
        super(name, age, sex);
    }
}