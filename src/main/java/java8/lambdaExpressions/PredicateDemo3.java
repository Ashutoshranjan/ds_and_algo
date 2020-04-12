package java8.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Ashutosh Ranjan on 11-04-2020.
 */
public class PredicateDemo3 {
    //WAP to check Software Engineer is allowed inside pub or not
    //Criteria: should be above 18 years and have gf

    public static void main(String[] args){
        List<Engineer> list = new ArrayList<Engineer>();
        list.add(new Engineer("Ashutosh", 25, true));
        list.add(new Engineer("Amber", 25, false));
        list.add(new Engineer("Ashu", 27, false));
        list.add(new Engineer("Rahul", 17, true));
        list.add(new Engineer("Abhinaw", 16, false));

        Predicate<Engineer> p = (e)->e.getAge()>=18&&e.isHasGf()==true;
        for(Engineer e: list) {
            if(p.test(e)){
            System.out.println(e.getName());
            }
        }
    }


}
