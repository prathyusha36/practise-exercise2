package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.PowerOfFour;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    PowerOfFour number;
    @Before
    public void setUp() throws Exception {
        number=new PowerOfFour();
        System.out.println("before");
    }
    @After
    public void tearDown() throws Exception {
        number=null;
        System.out.println("after");
    }

    @Test
    public void checkWhetherNumberIsPowerOfFour() {
        String result=number.checkWhetherNumberIsPowerOfFour(256);
        assertEquals("is a power of 4",result);
    }
    @Test
    public void checkWhetherNumberIsNotPowerOfFour() {
        String result=number.checkWhetherNumberIsPowerOfFour(345);
        assertEquals("not a power of 4",result);
    }
}