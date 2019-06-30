package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.MemberVariable;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {
    MemberVariable variable;
    @Before
    public void setUp() throws Exception {
        variable=new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
        variable=null;
    }
    @Test
    public void printDetailsOfMember() {
        String result = variable.printValues("prathyusha",22,50000);
        assertEquals("Members name:prathyusha"+"\n"+"Members age:22"+"\n"+"members salary:50000.0",result);
    }
}