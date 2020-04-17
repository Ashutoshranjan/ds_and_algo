package java8.lambdaExpressions;

import java.util.Date;
import java.util.function.Supplier;

/**
 * Created by Ashutosh Ranjan on 12-04-2020.
 */
public class SupplierDemo {

    public static void main(String args[]){

        Supplier<Date> supplier = ()->new Date();
        System.out.println(supplier.get());

        //Get random name by using Supplier
        Supplier<String> s = ()->{
            String[] s1= {"Sunny","Jimmy","Chimmy","Summy"};
            int x=(int)(Math.random()*4);
            return s1[x];
        };
        System.out.println(s.get());

        //Get 6 digit OTP


    }

}
