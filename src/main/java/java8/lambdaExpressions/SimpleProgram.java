package java8.lambdaExpressions;

/**
 * Created by sssau on 11-04-2020.
 */
public class SimpleProgram {

    public static void main(String args[]){


       /* Interf i=()->System.out.println("Hello");
        i.m1();*/

       /* Interf i = (a,b)->System.out.println("Sum = "+(a+b));
       i.sum(12,23);*/

       /*Interf i = (s-> System.out.println(s.length());
       i.getLength("Lambda Expressions");
        */
       Interf i = s -> s.length();
       System.out.println(i.getLength("java 8 new features"));


    }

}
