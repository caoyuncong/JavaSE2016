import sun.text.resources.cldr.ia.FormatData_ia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/**
 * Created by Administrator on 2017/2/7.
 */
public class Exercise {
    public static void main(String[] args) {
        String names[] = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        List planets=new ArrayList();
        for (int i = 0, n = names.length; i < n; i++) {
            planets.add(names[i]);
        }
        ListIterator lit=planets.listIterator();
        String s;
        lit.next();
        lit.next();
        s=(String) lit.next();
        lit.remove();
        lit.next();
        lit.next();
        lit.next();
        lit.add(s);
        lit.next();
        lit.previous();
        lit.previous();
        s = (String) lit.previous();
        lit.remove();
        lit.next();
        lit.next();
        lit.add(s);
        Iterator it=planets.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}