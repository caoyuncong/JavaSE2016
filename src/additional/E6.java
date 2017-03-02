package additional;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Administrator on 2017/1/3.
 */
/*定义类 Employee，包含如下字段：姓名，性别，销售额。此类要求包含无参构造方法，全参构造方法，所有字段的 get 和 set 方法，初始化如下几个 Employee 对象：

        张三,男,88907
        李四,男,76895
        王五,男,8900
        周六,男,90000
        赵七,女,79989
        将上述对象存储到 HashMap 集合中，要求使用泛型
        公司要求按照"销售额"计提奖金，提取标准：8 万元(不含)以下按 20% 提取；8 万元以上按 25% 提取
        请计算所有人员应发奖金，结果取整数，并按如下格式打印：
        姓名  性别  销售额  计提百分比  奖金额
        xxx   x     xxxx   xx%        xxxx*/
public class E6 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("张三", '男', 88907);
        Employee employee2 = new Employee("李四", '男', 76895);
        Employee employee3 = new Employee("王五",'男',8900);
        Employee employee4 = new Employee("周六",'男',90000);
        Employee employee5 = new Employee("赵七",'女',79989);
        Map<Employee, Integer> map = new HashMap<>();
        map.put(employee1,1);
        map.put(employee2,2);
        map.put(employee3,3);
        map.put(employee4,4);
        map.put(employee5,5);
//        Iterator<Integer> iterator = map.values().iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            System.out.println(next);
//        }
        for (Employee employee : map.keySet()) {
            System.out.println("姓名\t" +"性别\t"+"销售额\t");
            System.out.println( employee.getName()+"\t"+employee.getSex()+"\t\t"+employee.getSaleroom());
        }


    }
}
class Employee{
    private String name;
    private char sex;
    private int saleroom;

    public Employee() {
    }

    public Employee(String name, char sex, int saleroom) {
        this.name = name;
        this.sex = sex;
        this.saleroom = saleroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getSaleroom() {
        return saleroom;
    }

    public void setSaleroom(int saleroom) {
        this.saleroom = saleroom;
    }

//    @Override
//    public String toString() {
//        return
//                "姓名" +"\n"+ name +
//                "性别" + sex +"\t"+
//                "销售额" + saleroom
//                ;
//    }
}
