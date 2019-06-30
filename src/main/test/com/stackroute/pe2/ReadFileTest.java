package main.test.com.stackroute.pe2;

import main.java.com.stackroute.pe2.ReadFile;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class ReadFileTest {

    ReadFile f;
    @Before
    public void setUp() throws Exception
    {
        f = new ReadFile();
    }

    @After
    public void tearDown() throws Exception
    {
        f = null;
    }

    @Test
    public void checkReadFileAndPrint()
    {
        String str = f.checkReadFile(new File("file.txt"));
        assertEquals("MY NAME IS PRATHYUSHA",str);
    }
}