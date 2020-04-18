package java8.jodaTimeAPI;

import java.time.*;

/**
 * Created by Ashutosh Ranjan on 18-04-2020.
 */
public class DateTimeDemo2 {

    public static void main(String[] args) {
        //Period, Year, ZoneId

        //Period
        LocalDate birthday = LocalDate.of(1993,2,2);
        LocalDate today = LocalDate.now();

        Period p = Period.between(birthday, today);
        System.out.printf("Your age is %d years %d months %d days",p.getYears(),p.getMonths(),p.getDays());

        LocalDate deathday =  LocalDate.of(1993+60,2,2);
        Period p1 = Period.between(today, deathday);
        int d= p1.getDays()+p1.getMonths()*30+p1.getYears()*365;
        System.out.printf("\nYou will be on the earth only %d days... Hurry up to do more important things!",d);

        //Year
        int year =2024;
        Year y = Year.of(year);
        if(y.isLeap()){
            System.out.printf("\n%d year is Leap year.", year);
            System.out.println(year & 3);
            System.out.println(year % 100);
            System.out.println(year % 400);

        }
        else
            System.out.printf("\n%d year is not a Leap year.", year);


        //ZoneId
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("Default ZoneId: "+zoneId); //Asia/Calcutta
        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime dt = ZonedDateTime.now(la);
        System.out.println("Current Date Time in EST "+dt);
    }

}
