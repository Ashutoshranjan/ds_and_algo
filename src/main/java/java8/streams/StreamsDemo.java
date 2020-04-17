package java8.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Ashutosh Ranjan on 17-04-2020.
 */
public class StreamsDemo {

public static void main(String args[]){

    List<Integer> list = new ArrayList<Integer>();
    list.add(12);list.add(21);list.add(22);list.add(25);list.add(102);
    List<Integer> list1 =list.stream().filter(i->i%2==0).collect(Collectors.toList());
    System.out.println(list);
    System.out.println(list1);

    List<Integer> list2 =list.stream().map(i->i*2).collect(Collectors.toList());
    System.out.println(list2);

    List<Integer> list3 =list.stream().filter(i->i%2==0).map(i->i*2).collect(Collectors.toList());
    System.out.println(list3);

    List<String> list4 = new ArrayList<String>();
    list4.add("Ashutosh");list4.add("Ranjan");list4.add("Rana");list4.add("Ashu");
    System.out.println(list4);

    //collect()
    List<String> list5 =list4.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
    System.out.println();

    //count()
    long a = list4.stream().filter(i->i.length()>5).count();
    System.out.println("Count of names greater than 5 chars is "+a);

    //sorted()
    List<String> list6 =list4.stream().sorted().collect(Collectors.toList());
    System.out.println("sorted list "+list6);

    //sorted(Comparator c)
    List<String> list7 =list4.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
    System.out.println("sorted list DESC "+list6);

    //get()
    //min() collection should be sorted or sort it
    int min = list.stream().min((i1,i2)->i1.compareTo(i2)).get();
    System.out.println("Min "+min);

    //max() collection should be sorted
    int max = list.stream().max((i1,i2)->i1.compareTo(i2)).get();
    System.out.println("Max "+max);

    //forEach()
    System.out.println("List contents: ");
    //list.stream().forEach(s->System.out.println(s));
    list.stream().forEach(System.out::println);

    //toArray()
    System.out.println("Array contents: ");
    Integer[] array = list.stream().toArray(Integer[]::new);
    for(Integer x:array){
        System.out.println(x);
    }

    //Stream.of()
    System.out.println("Stream.of(): ");
    Stream<Integer> s = Stream.of(9,99,999,999);
    s.forEach(System.out::println);

    Double[] d = {10.1,20.0,30.9, 2.0};
    Stream<Double> s1= Stream.of(d);
    s1.forEach(System.out::println);

}

}


