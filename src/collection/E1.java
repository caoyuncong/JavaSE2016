package collection;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by Administrator on 2016/12/30.
 */
// 编写一个学生类，
// 将学生的姓名，年龄，性别分别保存到
// HashSet，ArrayList， Hashtable 中，
// 并利用迭代器 Iterator 将姓名，年龄，性别打印出来
public class E1 {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        ArrayList<Student> arrayList = new ArrayList<>();
        Hashtable<Integer, Student> hashtable = new Hashtable<>();

        for (int i = 0; i <10; i++) {
            Student student = new Student("name" + i, 18 + i, "male");
            hashSet.add(student);
            arrayList.add(student);
            hashtable.put(i, student);
        }
        Iterator<Student> iterator1=hashSet.iterator();
        while (iterator1.hasNext()) {
            Student next = iterator1.next();
            System.out.println(next);
        }
        System.out.println("---");
        for (Student student : hashSet) {
            System.out.println(student);
        }
        System.out.println("-----------");
        Iterator<Student> iterator2=arrayList.iterator();
        while (iterator2.hasNext()) {
            Student next = iterator2.next();
            System.out.println(next);
        }
        System.out.println("-----");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("------------");
        Iterator<Student> iterator3=hashtable.values().iterator();
        while (iterator3.hasNext()) {
            Student next = iterator3.next();
            System.out.println(next);

        }
    }

}

class Student {
    private String name;
    private int age;
    private String gender;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
