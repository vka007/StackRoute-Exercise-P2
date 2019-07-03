package com.stackroute.p2;

public class Factorial
{
    public String printIntFactorials(){                         //method body
        int i = 1;
        int fn = 1;
        String output = "";
        while (true) {                                      //calculate factorial & check range for Int
            output = output + "\n" + fn;
            if (Integer.MAX_VALUE / fn < (i + 1)) {
                output = output + "\nout of range";
                break;
            }
            i++;
            fn *= i;
        }
        return output;
    }

    public String printLongFactorials() {                       //method body

        String output="";
        long i  = 1L;
        long fn = 1L;
        while (true)                                        //calculate factorial & check range for Int
        {   output=output+"\n"+fn;

            if (Long.MAX_VALUE / fn < (i+1)) {
                output=output+"\nout of range";
                break;
            }
            i++;
            fn *= i;
        }
        return output;
    }

}

