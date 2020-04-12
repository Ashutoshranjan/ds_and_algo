package java8.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Ashutosh Ranjan on 11-04-2020.
 */
public class PredicateDemo {

    public static void main(String[] args){

        //Number greater than 10 or not
        Predicate<Integer> predicate = (i)->i>10;
        System.out.println(predicate.test(11)); //true
        System.out.println(predicate.test(10)); //false
        System.out.println(predicate.test(12)); //true
        // System.out.println(predicate.test("asdd")); //CE

        //String length greater than or equal to 5
        Predicate<String> p1 = (i)->i.length()>=5;
        System.out.println(p1.test("Ashutosh")); //true
        System.out.println(p1.test("Demo")); //false
        System.out.println(p1.test("Ranjan")); //true

        //Check Collection is empty or not
        Predicate<Collection> p2 = (i)->i.isEmpty();
        List<Integer> ll1 = new ArrayList<Integer>();
        ll1.add(5);
        List<Integer> ll2 = new ArrayList<Integer>();
        System.out.println(p2.test(ll1));//false
        System.out.println(p2.test(ll2));//true

    }


}
