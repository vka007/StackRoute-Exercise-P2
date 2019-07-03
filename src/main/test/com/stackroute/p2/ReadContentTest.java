package com.stackroute.p2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.io.IOException;

public class ReadContentTest {

    ReadContent ob;

    @Before
    public void setUp() throws Exception {
        ob=new ReadContent();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void readFileFromDirectory() throws IOException {
        String result=ob.readFile("/home/vineetubuntu/stack-ibm/Test Assignment/assignment2/file.txt");

        assertEquals("HI THIS IS VINEET KUMAR AGRAWAL.",result);

    }
}