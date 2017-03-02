package basic;

/**
 * Created by Administrator on 2016/12/16.
 */
public class ObjectTest {
    // hashcode
    // equals
    // toString
    private Integer id;
    private String name;
    private int age;
    private boolean married;
    private double height;

    public ObjectTest(Integer id, String name, int age, boolean married, double height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.married = married;
        this.height = height;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof ObjectTest)) return false;
//
//        ObjectTest that = (ObjectTest) o;
//
//        return id != null ? id.equals(that.id) : that.id == null;
//    }
//
//    @Override
//    public int hashCode() {
//        return id != null ? id.hashCode() : 0;
//    }
//
//    @Override
//    public String toString() {
//        return "ObjectTest{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", married=" + married +
//                ", height=" + height +
//                '}';
//    }

    public static void main(String[] args) {
        ObjectTest objectTest=new ObjectTest(1,"zhangsan",18,false,1.7d);
        System.out.println(objectTest.hashCode());
        System.out.println(Integer.toHexString(objectTest.hashCode()));
        System.out.println(objectTest);// .toString()
    }

}
