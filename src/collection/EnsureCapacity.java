package collection;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/12/23 0023.
 */
public class EnsureCapacity {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            strings.add(String.valueOf(i));
        }
        boolean b=true;
        if (b) {
            strings.ensureCapacity(10000+strings.size());
            for (int i = 0; i < 10000; i++) {
                strings.add(String.valueOf(i));
            }
        } else {
            // ...
        }
    }
}
