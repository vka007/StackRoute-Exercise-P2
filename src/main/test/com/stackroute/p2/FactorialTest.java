package com.stackroute.p2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    Factorial ob;

    @Before
    public void setUp() throws Exception {

        ob = new Factorial();
    }

    @After
    public void tearDown() throws Exception {

        ob = null;
    }

    @Test
    public void factorialWithintandLongTest1()
    {
        String result=ob.printIntFactorials();
        assertEquals("\n1\n2\n6\n24\n120\n720\n5040\n40320\n362880\n3628800\n39916800\n479001600\nout of range",result);
    }
    @Test
    public void factorialWithintandLongTest2()
    {
        String result=ob.printLongFactorials();
        assertEquals("\n1\n2\n6\n24\n120\n720\n5040\n40320\n362880\n3628800\n39916800\n479001600\n6227020800\n87178291200\n1307674368000\n20922789888000\n355687428096000\n6402373705728000\n121645100408832000\n2432902008176640000\nout of range",result);
    }
}