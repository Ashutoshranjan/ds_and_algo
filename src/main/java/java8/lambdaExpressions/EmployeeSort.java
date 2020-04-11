package java8.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Ashutosh Ranjan on 11-04-2020.
 */
public class EmployeeSort {

    public static void main(String args[]){
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(2,"Ashu"));
        list.add(new Employee(3,"Ashutosh"));
        list.add(new Employee(1,"Ranjan"));
        list.add(new Employee(5,"Ashutosh Ranjan"));

        System.out.println("Before Sorting: "+list);
        Collections.sort(list, (e1, e2)->(e1.getId()<e2.getId())?-1:(e1.getId()>e2.getId())?1:0);
        System.out.println("After Sorting: "+list);
    }




}
