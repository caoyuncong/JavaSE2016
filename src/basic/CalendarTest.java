package basic;

import java.util.Calendar;

/**
 * Created by Administrator on 2016/12/16.
 */
public class CalendarTest {
    private static final int YEAR=2017;

    private static void printMonth(int month) {
        System.out.println("\n\n\t\t" + YEAR + "年" + (month + 1) + "月");
        System.out.println("一\t"+"二\t"+"三\t"+"四\t"+"五\t"+"六\t"+"日\t");
        Calendar calendar=Calendar.getInstance();
        calendar.set(YEAR,month,1);
        int dayOfWeek=calendar.get(Calendar.DAY_OF_WEEK);
        for(int i=0;i<(5+dayOfWeek)%7;i++) {
            System.out.println("\t");
        }
        int daysOfMonth=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 0; i < daysOfMonth; i++) {
            System.out.printf("%2d",i+1);
            System.out.println("\t");
            if ((i + 1 + (5 + dayOfWeek) % 7) % 7 == 0) {
                System.out.println();
            }
        }
    }

}
