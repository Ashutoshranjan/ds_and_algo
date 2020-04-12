package java8.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Ashutosh Ranjan on 11-04-2020.
 */
public class PredicateDemo2 {
    //WAP to display name starting with 'A'
    //WAP to remove null and empty String
    public static void main(String[] args){
        //WAP to display name starting with 'A'
        String[] names = {"Ashutosh", "Ranjan", "Ashu", "Rana"};
        Predicate<String> p= (s)->s.charAt(0)=='A';
        for(String s: names){
            if(p.test(s)){
                System.out.println(s);
            }
        }

        //WAP to remove null and empty String
        String[] str={"Hello","", null, "World", "Java", "" };
        Predicate<String> p1 = s->s!=null&&s.length()!=0;
        List<String> list = new ArrayList<String>();
        for(String s: str){
            if(p1.test(s)){
                list.add(s);
            }
        }

        System.out.println(list);

    }


}
