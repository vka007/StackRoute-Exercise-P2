package com.stackroute.p2;

public class PowerOfFour {

    public static String checkPower(int Number)                 //method body
    {
        double test=0;
        int flag =0,i=1;

        if(Number==0 || Number<0)                               //check valid input
        {
            return "The number is not a power of four";
        }
        else
        {
             while(test<Number)                             //check for power
                {
                    test = Math.pow(4,i);i++;
                    if((int)test == Number)
                    {
                        flag =1;
                        return "The number is a power of four";
                    }
                }
        }

        if(flag==0)                                                 //return message if not in power
        {      return "The number is not a power of four";}

        return null;
    }
}
