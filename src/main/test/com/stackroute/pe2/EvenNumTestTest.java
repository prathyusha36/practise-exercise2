package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.EvenNumTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTest number;

    @Before
    public void setUp() throws Exception {
        number=new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
        number=null;
    }
    @Test
    public void checkNumberIsEvenOrNot() {
        boolean result=number.isEven(6);
        assertEquals(true,result);
    }
    @Test
    public void checkNumberIsNotEven() {
        boolean result=number.isEven(7);
        assertEquals(false,result);
    }
}