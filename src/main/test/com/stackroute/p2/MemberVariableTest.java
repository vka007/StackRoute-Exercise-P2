package com.stackroute.p2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {

    MemberVariable ob ;

    @Before
    public void setUp() throws Exception {
    ob = new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
    ob = null;
    }

    @Test
    public void inputValuesAndCheckOutput()
    {
        ob.Init("Vineet",22,600000.0);
        String Result = ob.Display();

        assertEquals("Member Name: Vineet Member Age: 22 Member Salary: 600000.0",Result);
    }

    @Test
    public void inputValuesAndCheckOutputAgain()
    {
        ob.Init("Raj",23,50000.0);
        String Result = ob.Display();

        assertEquals("Member Name: Raj Member Age: 23 Member Salary: 50000.0",Result);
    }

    @Test
    public void checkInvalidInput()
    {
        ob.Init("Akash",-23,-56478);
        String Result = ob.Display();

        assertEquals("Wrong input",Result);
    }
}