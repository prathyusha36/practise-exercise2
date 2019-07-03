package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.Palindrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
   Palindrome object;
    @Before
    public void setUp() throws Exception {
        object=new Palindrome();
        System.out.println("before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
        object=null;
    }

    @Test
    public void checkForPalindromeForString() {
        String word=object.checkForPalindrome("madam");
        assertEquals("is a palindrome",word);
    }
    @Test
    public void checkForPalindromeForNumber() {
        String word=object.checkForPalindrome("12321");
        assertEquals("is a palindrome",word);
    }
    @Test
    public void checkForNotPalindromeForString() {
        String word=object.checkForPalindrome("prathyusha");
        assertEquals("is not a palindrome",word);
    }
    @Test
    public void givenEmptyStringShouldReturnError() {
        String word=object.checkForPalindrome(" ");
        assertEquals("error",word);
    }
}