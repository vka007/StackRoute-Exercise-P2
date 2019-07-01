package com.stackroute.p2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {

    PowerOfFour ob ;

    @Before
    public void setUp() throws Exception {
        ob = new PowerOfFour();
    }

    @After
    public void tearDown() throws Exception {

        ob= null;
    }

    @Test
    public void checkPowerOfFourIsTrue() {

        String Result = ob.checkPower(16);
        assertEquals("The number is a power of four",Result);
    }

    @Test
    public void checkPowerOfFourIsFalse() {

        String Result = ob.checkPower(211);
        assertEquals("The number is not a power of four",Result);
    }
}