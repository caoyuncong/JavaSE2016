package collection;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Administrator on 2016/12/22 0022.
 */
public class TreeSetTest2 {
    public static void main(String[] args) {
        Set<Human> set = new TreeSet<>();
        set.add(new Human("lisi", 19));
        set.add(new Human("zhangsan", 18));
        System.out.println(set.size());
        for (Human human : set) {
            System.out.println(human);
        }

    }
}
class Human implements Comparable<Human>{
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Human o) {
        return age-o.age;
    }

    @Override // 重写了Object类的toString()
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}