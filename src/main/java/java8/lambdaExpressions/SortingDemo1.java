package java8.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sssau on 11-04-2020.
 */
public class SortingDemo1 {
    //Sorting list in descending order without Lambda Expression

    public static void main(String args[]){
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(92);
        list.add(29);
        list.add(45);
        list.add(89);
        list.add(19);

        System.out.println("Unsorted List "+list);
        Collections.sort(list);
        System.out.println("Sorted List (Ascending Order) "+list);

        //Customized Sorting
        Collections.sort(list, new MyComparator1());
        System.out.println("Sorted List (Descending Order) "+list);
    }

}
