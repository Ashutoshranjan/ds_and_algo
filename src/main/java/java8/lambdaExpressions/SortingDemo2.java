package java8.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by sssau on 11-04-2020.
 */
public class SortingDemo2 {
//Sorting list in descending order with Lambda Expression

    public static void main(String args[]){
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(90);
        list.add(29);
        list.add(45);
        list.add(89);
        list.add(19);

        System.out.println("Unsorted List "+list);
        Collections.sort(list);
        System.out.println("Sorted List (Ascending Order) "+list);

        //Customized Sorting


       /* Comparator<Integer> comparator = (o1, o2) -> {
            int i1=(Integer)o1;
            int i2=(Integer)o2;
            if(i1<i2){return 1;}
            if(i1>i2){return -1;}
            return 0;
        };

        Collections.sort(list, comparator);
       */

        Collections.sort(list, (I1, I2) -> (I1<I2)?1:(I1>I2)?-1:0);

       System.out.println("Sorted List (Descending Order) "+list);


    }
}
