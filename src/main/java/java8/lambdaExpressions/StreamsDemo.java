package java8.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Ashutosh Ranjan on 14-04-2020.
 */
public class StreamsDemo {

    public static void main(String args[]){


        List<Integer> list = new ArrayList<Integer>();
        list.add(2); list.add(3); list.add(89); list.add(90);
        List<Integer> evenList=list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(evenList);
    }

}
