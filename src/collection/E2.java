package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/30.
 */
/*
使用Map接口的实现类完成员工工资(姓名→工资)的摸拟：
        添加几条信息
        列出所有的员工姓名
        列出所有员工姓名及其工资
        删除名叫“Tom”的员工信息
        输出Jack的工资，并将其工资改为1500元
        将所有工资低于1000元的员工的工资上涨20%
*/
public class E2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Jack", 1200);
        map.put("Jerry", 800);
        map.put("Tom", 1000);
        map.remove("Tom");
        map.remove("Tom", 1200); // 键和值只有同时满足，才可删除
        for (String name : map.keySet()) {
            System.out.println(name);
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + "->" + stringIntegerEntry.getValue());
        }
        System.out.println(map.get("Jack"));
        map.put("Jack", 1500);
        System.out.println(map.get("Jack"));
        for (String s : map.keySet()) {
            if (map.get(s) < 1000) {
                map.put(s, (int)(map.get(s)*1.2));
            }
        }
        System.out.println(map.get("Jerry"));
    }
}
