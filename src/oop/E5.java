package oop;

/**
 * Created by Administrator on 2016/12/28.
 */
// 定义一个学生类，包含三个属性（学号，姓名，成绩）均为私有的，
// 分别给这三个属性定义两个方法，一个设置它的值，另一个获得它的值。
// 然后在一个测试类里试着调用
public class E5 {
    public static void main(String[] args) {
        Student student=new Student("Lili",56,"5896647fkiflg");
//        System.out.println(student.getName());
//        System.out.println(student.getScore());
//        System.out.println(student.getSno());
        System.out.println(student);
    }
}

class Student{
    private String name;
    private double score;
    private String sno;

    public Student(String name, double score, String sno) {
        this.name = name;
        this.score = score;
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    @Override
    public String toString() {
        return "E5{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", sno='" + sno + '\'' +
                '}';
    }
}