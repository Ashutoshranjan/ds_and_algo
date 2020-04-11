package java8.lambdaExpressions;

import java.util.*;

/**
 * Created by Ashutosh Ranjan on 11-04-2020.
 */
public class SortingTreeSet {

    public static void main(String args[]){
        //Sorting TreeSet in descending order with Lambda Expression
        TreeSet<Integer> treeSet = new TreeSet<Integer>((i1, i2 )-> (i1<i2)?1:(i1>i2)?-1:0);
        treeSet.add(23);
        treeSet.add(27);
        treeSet.add(35);
        treeSet.add(103);
        treeSet.add(103);
        treeSet.add(103);
        treeSet.add(72);
        treeSet.add(98);
        treeSet.add(13);
        treeSet.add(3);
        System.out.println(treeSet);

        //TreeMap sorting based on key
        Map<Integer, String> treeMap = new TreeMap<Integer, String>((i1, i2 )-> (i1<i2)?1:(i1>i2)?-1:0);
        treeMap.put(100, "Zebra");
        treeMap.put(10, "Dog");
        treeMap.put(45, "Cat");
        treeMap.put(70, "Rat");
        treeMap.put(500, "Lion");
        System.out.println(treeMap);

    }
}
