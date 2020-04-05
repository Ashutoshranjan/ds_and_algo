package dynamicProgrammming;

/**
 * Created by sssau on 05-04-2020.
 */
public class FibonacciSeries {

    //1 1 2 3 5
     int fs_recursion(int n){
        if(n<1){return 0;}
        if(n<=2){return 1;}
        return fs_recursion(n-1)+fs_recursion(n-2);
    }


    //n-1[]  array 0[1] 1[1] 2[]
    //
     int fs_dp(int n){
         int array[] = new int[n+2]; //including for index 0
         array[0]=0;
         array[1]=1;
         for(int i=2; i<n; i++){
             array[i]=array[i-1]+array[i-2];
         }
        return array[n];
    }

}
