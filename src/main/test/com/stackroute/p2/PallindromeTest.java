package com.stackroute.p2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PallindromeTest {

    Pallindrome ob = null;

    @Before
    public void setUp() throws Exception {
        ob = new Pallindrome();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void takeStringAndCheckIfItIsPallindrome()
    {
        String Result = ob.reverseString("vineet");
        assertEquals("It is not pallindrome",Result);
    }

    @Test
    public void takeStringAndCheckIfItIsPallindromeAgain()
    {
        String Result = ob.reverseString("00stats00");
        assertEquals("It is pallindrome",Result);
    }
}