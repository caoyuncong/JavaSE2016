package oop;

import java.util.Calendar;

/**
 * Created by Administrator on 2016/12/29.
 */
//构造一个日期类，包含年、月、日的属性和以下构造方法：
//不带参数     包含年月日三个参数
//  yyyy-MM-dd 格式的字符串
//  提供存取日期的方法，实例化一个该类后，
// 输入一个日期，可以计算出该日期是当年的第几天，
// 要求计算天数的方法由日期类提供， 可直接通过该类的实例去调用
//
//         SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
//        calendar=get(Calendar.DAY_OF_YEAR) ; // 获得这个年的第几天
public class E8 {
    public static void main(String[] args) {
        String string = "2016-12-30";
        System.out.println(string.lastIndexOf(50)); // [0,65535] 2
        Date date = new Date(string);
        System.out.println(string + "是" + date.getYear() + "年的第" + date.getDaysOfYear() + "天。");
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
    }
}

class Date { // java.util.Date 不同包
    private int year;
    private int month;
    private int day;

    public Date() {
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date(String data) {
        // yyyy-MM-dd
        String[] strings = data.split("-");
        year = Integer.valueOf(strings[0]);
        month = Integer.valueOf(strings[1]);
        day = Integer.valueOf(strings[2]);
    }

    public int getDaysOfYear() {
        int sum=0;
        int[] ints = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < getMonth() - 1; i++) {
            sum += ints[i];
        }
        return sum + ((isLeapYear() ? 1 : 0) + getDay());
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isLeapYear() {
        return ((getYear() % 400 == 0) || ((getYear() % 4 == 0) && (getYear() % 100 != 0)));
    }
}