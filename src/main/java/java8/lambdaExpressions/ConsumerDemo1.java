package java8.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Ashutosh Ranjan on 12-04-2020.
 */
public class ConsumerDemo1 {

    public static void main(String args[]){

        Consumer<Integer> consumer = (i)->System.out.println("Value ="+i);
        consumer.accept(20);

        //WAP to display movie info

        List<Movie> ll= new ArrayList<Movie>();
        ll.add(new Movie("RHTDM", "Madhavan", "Dia Mirza"));
        ll.add(new Movie("Bagwan", "Amitabh", "Hema Malini"));
        Consumer<Movie> consumer1 = (movie) -> {System.out.println("Movie Name: "+movie.getName());
                                                System.out.println("Actor Name: "+movie.getActor());
                                                System.out.println("Actress Name: "+movie.getActress());

        };

        for(Movie m:  ll){
            consumer1.accept(m);

        }

    }


}
