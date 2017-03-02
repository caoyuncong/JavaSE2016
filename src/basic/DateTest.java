package basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2016/12/16.
 */
////Calendar.set(year + 1900, month, date)
// 或 GregorianCalendar(year + 1900, month, date) 取代。
public class DateTest {
    public static void main(String[] args) {
//        Date date = new Date(1000000L);
//        Date date=new Date(116,2,15);
        System.out.println(new Date().getTime());

        // 2016-12-16 11:48:08
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 11, 16, 12, 0, 1);
        System.out.println(calendar.getTime());
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));


    }

}
