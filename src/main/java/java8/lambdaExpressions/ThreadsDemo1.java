package java8.lambdaExpressions;

/**
 * Created by sssau on 11-04-2020.
 */
public class ThreadsDemo1 implements Runnable{
    //Creating Threads without using lambda Expressions

    public void run(){
        for(int i=1; i<11; i++){
            System.out.println("Child Thread");
        }
    }

    public static void main(String args[]){

        Runnable runnable = new ThreadsDemo1();
        Thread t1 = new Thread(runnable);
        t1.start();
        for(int i=1; i<11; i++){
            System.out.println("Main Thread");
        }

    }

}
