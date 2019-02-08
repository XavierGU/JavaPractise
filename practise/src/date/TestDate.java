package date;


import java.util.Date;

public class TestDate {
/*    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("当前时间：");
        System.out.println(d1);
        System.out.println();
        Date d2 = new Date(5000);
        System.out.println("从1970年1月1日 早上8点0分0秒 开始经历了5秒的时间");
        System.out.println(d2);
    }*/
/*public static void main(String[] args) {
    Date now = new Date();
    System.out.println("现在时间："+now.toString());
    System.out.println("当前时间getTime()返回的值是："+now.getTime());
    Date zero = new Date(100000);
    System.out.println("用0作为构造方法，得到的日期是:"+zero);
}*/
public static void main(String[] args) {
    long second = 1000;
    long minute = second*60;
    long hour = minute*60;
    long day = hour*24;
    long year = day*365;
    long year1995Start = (1995-1970)*year;
    long leapYear = (1995-1970)/4*day;
    year1995Start+=leapYear;
    long eightHour = hour*8;
    year1995Start-=eightHour;
    Date Dstart = new Date(year1995Start);
    System.out.println("1995的第一天"+Dstart);
    long year1995End = year1995Start+year-1;
    Date dEnd = new Date(year1995End);
    System.out.println("1995的最后一天"+dEnd);

    long ramdomTime = (long)(Math.random()*(year-1)+year1995Start);
    Date dRamdom = new Date(ramdomTime);
    System.out.println(dRamdom);
}
}
