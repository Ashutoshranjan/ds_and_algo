package java8.lambdaExpressions;

import java.util.function.Predicate;

/**
 * Created by Ashutosh Ranjan on 11-04-2020.
 */
public class PredicateJoiningDemo {

    //Predicate Joining
    //p1 => Is given number greater than 10
    //p2 => Is even number
    //p3 => Is divisible by 3


    public static void main(String[] args){
        Predicate<Integer> p1 = (i)->i>10;
        Predicate<Integer> p2 = (i)->i%2==0;
        Predicate<Integer> p3 = (i)->i%3==0;
        System.out.println(p1.test(12));
        System.out.println(p2.test(12));
        System.out.println(p3.test(12));
        System.out.println(p1.and(p2).and(p3).test(12));
        System.out.println(p1.negate().test(3));
        System.out.println(p1.or(p2).or(p3).test(3));
        System.out.println(p1.test(12));
        //isEqual() method
        Predicate<String> p4= Predicate.isEqual("ASHUTOSH");
        System.out.println(p4.test("Ashu"));  //false
        System.out.println(p4.test("ASHUTOSH")); //true

    }


}
