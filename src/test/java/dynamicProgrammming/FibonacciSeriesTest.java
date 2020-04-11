package dynamicProgrammming;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ashutosh Ranjan on 05-04-2020.
 */
public class FibonacciSeriesTest {

    private FibonacciSeries fibonacciSeries;

    @Before
    public void setUp(){
        fibonacciSeries = new FibonacciSeries();
    }

    @Test
    public void fs_recursionTest(){
        Assert.assertEquals(0, fibonacciSeries.fs_recursion(0));
        Assert.assertEquals(1, fibonacciSeries.fs_recursion(1));
        Assert.assertEquals(2, fibonacciSeries.fs_recursion(3));
        Assert.assertEquals(5, fibonacciSeries.fs_recursion(5));
        Assert.assertEquals(34, fibonacciSeries.fs_recursion(9));
    }

    @Test
    public void fs_dpTest(){
        Assert.assertEquals(1, fibonacciSeries.fs_recursion(2));
        Assert.assertEquals(3, fibonacciSeries.fs_recursion(4));
        Assert.assertEquals(8, fibonacciSeries.fs_recursion(6));
        Assert.assertEquals(34, fibonacciSeries.fs_recursion(9));
    }

}
