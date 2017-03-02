package collection;

import java.util.Vector;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
public class DynamicArrayTest { // 动态  -> 模拟向量
    private static final int INIT_CAPACITY = 10;

    private String[] strings;
    private int currentSize;
    private int currentCapacity;

    public DynamicArrayTest() {
        strings = new String[INIT_CAPACITY];
        currentSize = 0;
        currentCapacity = INIT_CAPACITY;
    }

    public DynamicArrayTest(int intCapacity) {
        strings = new String[intCapacity];
        currentSize = 0;
        currentCapacity = intCapacity;
    }

    public void add(String string) {
        // TODO: 判断容量是否足够？ 不够-增加一倍的容量
        if (currentSize == currentCapacity) {
            grow();
        }
        strings[currentSize] = string;
        currentSize++;
    }

    private void grow() { // 右键
        System.out.println("grow...");
        currentCapacity *= 2;
        String[] newStrings = new String[currentCapacity];
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(strings, 0, newStrings, 0, strings.length);
//            for (int i = 0; i <strings.length ; i++) {
//                strings[i]=newStrings[i];
//            }
        strings = newStrings;
    }


    public String get(int index) {
        if (index >= currentSize) {
            System.out.println("error.");
            System.exit(0);
        }
        return strings[index];
    }

    public int size() {
        return currentSize;
    }

    public int capacity() {
        return currentCapacity;
    }

   /* public static void main(String[] args) {
        DynamicArrayTest dynamicArray = new DynamicArrayTest(100);
        for (int i = 0; i < 100; i++) {
            dynamicArray.add("teat...");
        }
        dynamicArray.add("hi");*/
//        System.out.println(dynamicArray.get(0));
       /* System.out.println(dynamicArray.size());
        System.out.println(dynamicArray.capacity()); // 模拟 向量 Vector 返回当前容量*/
//        DynamicArray dynamicArray = new DynamicArray(100);
//        for (int i = 0; i < 100; i++) {
//            dynamicArray.add("test...");
//        }
//        dynamicArray.add("hi1");
//        System.out.println(dynamicArray.size());
//        System.out.println(dynamicArray.capacity());
////        System.out.println(dynamicArray.get(1));
   public static void main(String[] args) {
       DynamicArrayTest array1 = new DynamicArrayTest();
       for (int i = 0; i < 100; i++) {
           array1.add("test...");
       }
       DynamicArrayTest array2 = new DynamicArrayTest(100);
       for (int i = 0; i < 100; i++) {
           array2.add("test...");
       }

   }

}
