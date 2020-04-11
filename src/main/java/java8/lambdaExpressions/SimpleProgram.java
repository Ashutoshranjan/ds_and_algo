package java8.lambdaExpressions;

/**
 * Created by Ashutosh Ranjan on 11-04-2020.
 */
public class SimpleProgram {

    int x=10;

    public void m2(){
        int y=20;
        Interf i = ()->{

            x=888;
           //y=999;
            System.out.println(x);
            System.out.println(y);
        };
        i.m1();
    }
    public static void main(String args[]){

        SimpleProgram sp = new SimpleProgram();
        sp.m2();
       /* Interf i=()->System.out.println("Hello");
        i.m1();*/

       /* Interf i = (a,b)->System.out.println("Sum = "+(a+b));
       i.sum(12,23);*/

       /*Interf i = (s-> System.out.println(s.length());
       i.getLength("Lambda Expressions");
        */
        /*  Interf i = s -> s.length();
       System.out.println(i.getLength("java 8 new features"));
        */

    }




}
