package java8.lambdaExpressions;

/**
 * Created by Ashutosh Ranjan on 11-04-2020.
 */
public class ThreadsDemo2 {
    //Creating Threads using Lambda Expressions
    public static void main(String args[]){

        Runnable runnable = ()->{
            for(int i=0; i<10; i++){
            System.out.println("Child Thread");
            }
        };
        Thread t = new Thread(runnable);
        t.start();
        for(int i=0; i<10; i++) {
            System.out.println("Main Thread");
        }
    }

}
