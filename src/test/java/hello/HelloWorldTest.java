package hello;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by Ashutosh Ranjan on 05-04-2020.
 */
public class HelloWorldTest {

    private HelloWorld hw;

    @Before
    public void SetUp(){
        hw= new HelloWorld();
    }

    @Test
    public void helloTest(){
    Assert.assertEquals("Hello World", hw.hello("Hello World"));
    }
}
