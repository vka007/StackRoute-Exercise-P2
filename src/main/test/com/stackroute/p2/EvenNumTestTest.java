package com.stackroute.p2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    EvenNumTest ob;

    @Before
    public void setUp() throws Exception {
    ob = new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
    ob = null;
    }

    @Test
    public void testEvenGetBooleanResultTrueIfItIsEven()
    {
        boolean Result = ob.isEven(12);
        assertEquals(true,Result);

    }

    @Test
    public void testEvenGetBooleanResultFalseIfItIsNotEven()
    {
        boolean Result = ob.isEven(21);
        assertEquals(false,Result);

    }
}