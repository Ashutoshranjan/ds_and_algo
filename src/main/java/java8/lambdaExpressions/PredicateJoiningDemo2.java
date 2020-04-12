package java8.lambdaExpressions;

import java.util.function.Predicate;

/**
 * Created by Ashutosh Ranjan on 11-04-2020.
 */
public class PredicateJoiningDemo2 {

    //Predicate Joining
    //p1 => Is given number greater than 10
    //p2 => Is even number

   public static void m1(Predicate<Integer> p, int[] x){
        for(int i: x){
            if(p.test(i)){
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args){
        int[] arr= {10, 5, 15, 20, 30, 55};
        Predicate<Integer> p1 = (i)->i>10;
        Predicate<Integer> p2 = (i)->i%2==0;
        System.out.println("The numbers greater than 10 are:");
        m1(p1, arr);
        System.out.println("The even numbers are:");
        m1(p2, arr);
        System.out.println("The numbers not greater than 10 are:");
        m1(p1.negate(), arr);
        System.out.println("The numbers greater than 10 and even are:");
        m1(p1.and(p2), arr);
        System.out.println("The numbers greater than 10 or even are:");
        m1(p1.or(p2), arr);
    }
}
