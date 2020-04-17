package java8.jodaTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Created by Ashutosh Ranjan on 17-04-2020.
 */
public class DateTimeDemo {
    public static void main(String[] args) {
        //LocalDate
        LocalDate date = LocalDate.now();
        System.out.println("Date: "+date);

        int dd=date.getDayOfMonth();
        int mm=date.getMonthValue();
        int yyyy=date.getYear();
        String month = date.getMonth().toString();
        System.out.println(dd+" "+mm+" "+yyyy+"  "+month);

        //LocalTime
        LocalTime time = LocalTime.now();
        int h=time.getHour();
        int m=time.getMinute();
        int s=time.getSecond();
        int n=time.getNano();
        System.out.println(h+":"+m+":"+s+":"+n);

        //LocalDateTime
        LocalDateTime dateTime= LocalDateTime.now();
        System.out.println("Date Time: "+dateTime);
        int dd1=dateTime.getDayOfMonth();
        int mm1=dateTime.getMonthValue();
        int yyyy1=dateTime.getYear();
        int h1=dateTime.getHour();
        int m1=dateTime.getMinute();
        int s1=dateTime.getSecond();
        int n1=dateTime.getNano();

        System.out.println(dd1+"-"+mm1+"-"+yyyy1+" "+h1+":"+m1+":"+s1+":"+n1);
        System.out.printf("\n %d:%d:%d:%d",h1,m1,s1,n1);



    }
}

