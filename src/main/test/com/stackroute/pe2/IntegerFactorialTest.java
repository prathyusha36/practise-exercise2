package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.IntegerFactorial;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerFactorialTest {
    IntegerFactorial f1;
    @Before
    public void setUp()  {
        f1 = new IntegerFactorial();
    }

    @After
    public void tearDown() throws Exception {
        f1 = null;
    }

    @Test
    public void getFactorial1Success() {
        String actualStr = f1.getFactorial(2);
        String expectedStr = "The factorial of 1 is 1\n" + "The factorial of 2 is 2";
        assertEquals(expectedStr,actualStr);
    }

    @Test
    public void getFactorial2Success() {
        String actualStr = f1.getFactorial(4);
        String expectedStr = "The factorial of 1 is 1\n" + "The factorial of 2 is 2\n" + "The factorial of 3 is 6\n" + "The factorial of 4 is 24";
        assertEquals(actualStr,expectedStr);
    }

}