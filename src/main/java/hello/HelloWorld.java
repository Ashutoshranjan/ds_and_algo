package hello;

import java.util.BitSet;
/**
 * Created by Ashutosh Ranjan on 05-04-2020.
 */
public class HelloWorld {

    public static void main(String args[]){
        System.out.println("Hello World");
        //Problem of 100 rooms
        /*There are 100 doors in a row that are all initially closed.

        You make 100 passes by the doors.

        The first time through, visit every door and  toggle  the door  (if the door is closed,  open it;   if it is open,  close it).

        The second time, only visit every 2nd door   (door #2, #4, #6, ...),   and toggle it.

                The third time, visit every 3rd door   (door #3, #6, #9, ...), etc,   until you only visit the 100th door.


        Task
        Answer the question:   what state are the doors in after the last pass?   Which are open, which are closed?
        */

                final int n = 100;
        BitSet a = new BitSet(n);
                for (int i = 1; i <= n; i++) {
                    for (int j = i - 1; j < n; j += i) {
                        a.flip(j);
                    }
                }
                a.stream().map(i -> i + 1).forEachOrdered(System.out::println);
    }

    public String hello(String str){
        return str;
    }
}


