package java8.lambdaExpressions;

import java.util.function.Consumer;

/**
 * Created by Ashutosh Ranjan on 12-04-2020.
 */
public class ConsumerChaining {

    public static void main(String args[]){
        Consumer<Movie1> c1 = m->System.out.println("Movie: "+m.name+" is ready to release.");
        Consumer<Movie1> c2 = m->System.out.println("Movie: "+m.name+" is "+m.result);
        Consumer<Movie1> c3 = m->System.out.println("Movie: "+m.name+" information stored in db.");
        Consumer<Movie1> chainedC = c1.andThen(c2).andThen(c3);

        Movie1 m1 = new Movie1("Bahubali", "Super Hit");
        chainedC.accept(m1);
    }


}
