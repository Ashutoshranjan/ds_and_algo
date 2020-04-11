package java8.lambdaExpressions;

import java.util.Comparator;

/**
 * Created by sssau on 11-04-2020.
 */
public class MyComparator1 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        int i1= (Integer)o1;
        int i2= (Integer)o2;

        if(i1<i2){return 1;}
        else if(i1>i2){return -1;}
        return 0;
    }
}
