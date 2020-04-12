package java8.lambdaExpressions;

import java.util.function.Function;

/**
 * Created by Ashutosh Ranjan on 11-04-2020.
 */
public class FunctionDemo {
    //Function can return any return type

    public static void main(String[] args){

        //Find length of String
        Function<String, Integer> f = s ->s.length();
        System.out.println(f.apply("Ashutosh")); //8
        System.out.println(f.apply("Ashu")); //4

        //Find square of int
        Function<Integer, Integer> f2 = i->i*i;
        System.out.println(f2.apply(10));
        System.out.println(f2.apply(12));

        //Remove spaces from given String
       String str = "This is DS and ALGO";
       Function<String, String> f3 = (s)->s.replaceAll(" ","");
       System.out.println(f3.apply(str));



    }

}
