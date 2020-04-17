package java8.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Ashutosh Ranjan on 12-04-2020.
 */
public class StudentMarksheet {

    //Display Student information scored >=60                               =>Predicate to check condition, Consumer to print
    //if marks>=80 Grade A 60-80 Grade B. <60 Grade C           => Function

    public static void main(String args[]){

        Predicate<Student> predicate = s->s.marks>=60;
        Function<Student, String> function = s->{
            if(s.getMarks()>=80){return "A";}
            else if(s.getMarks()>=60){return  "B";}
            return  "C";
        };
        Consumer<Student> consumer = s->System.out.println("Name: "+s.getName()+", Marks:"+s.getMarks()+" Grade:"+function.apply(s));

        List<Student> ll = new ArrayList<Student>();
        ll.add(new Student("Ashutosh", 80));
        ll.add(new Student("Ashu", 50));
        ll.add(new Student("Ranjan", 70));

        for(Student s: ll){
            if(predicate.test(s)){
                consumer.accept(s);
            }
        }




    }



}
