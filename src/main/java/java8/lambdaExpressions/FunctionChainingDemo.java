package java8.lambdaExpressions;

import java.util.function.Function;

/**
 * Created by Ashutosh Ranjan on 11-04-2020.
 */
public class FunctionChainingDemo {


    public static void main(String[] args){
        //Take String as an i/p and convert it to Upper case and print only 4 characters
        Function<String, String> f1 = (s)->s.toUpperCase();
        Function<String,String> f2 = (s)->s.substring(0,8);
        System.out.println(f1.andThen(f2).apply("Ashutosh Ranjan"));
        System.out.println(f1.compose(f2).apply("Ashutosh Ranjan"));

        //Add two numbers and then find cube of that number
        Function<Integer, Integer> function1 = (i)->i+i;
        Function<Integer, Integer> function2 = (i)->i*i*i;

        System.out.println(function1.andThen(function2).apply(10));
        System.out.println(function1.compose(function2).apply(10));

    }
}
