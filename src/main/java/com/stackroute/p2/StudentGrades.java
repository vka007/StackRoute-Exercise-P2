package com.stackroute.p2;

public class StudentGrades {

    public static String readGradeInput(int NumberOfStudent, int[] NGrades) //method body
    {
        if(NumberOfStudent<0  || NumberOfStudent >100)      //condition to check for valid input
            return "Wrong Input";

        if(NGrades.length!=NumberOfStudent)                 //match length and student grades input
        {
            return "Wrong Input";
        }

        for (int i =0;i<NumberOfStudent;i++)                //check for valid marks input
        {
            if(NGrades[i]<0 || NGrades[i]>100)
            {
                return "Wrong Input";
            }
        }

        String Result="";

        double tot=0;

        for (int i =0;i<NumberOfStudent;i++)                // find tot grades
        {
            tot = tot + NGrades[i];
        }

        String avg = avg(tot,NumberOfStudent);                  //methods calls

        int min = min(NGrades,NumberOfStudent);
        int max = max(NGrades,NumberOfStudent);

        Result = "The average is "+avg+" The minimum is "+min+" The maximum is "+max;

        return Result;
    }

    public static String avg(double total,int N){           //avg method body

        String s="";
        return s+(total/N);
    }

    public static int min(int[] NGrades, int N)             //min method body
    {
        int min= NGrades[0];
        for (int i=1;i<N;i++)
        {
            if(NGrades[i]<min)
            {
                min = NGrades[i];
            }
        }

        return min;
    }

    public static int max(int[] NGrades, int N)                 //max method body
    {
        int max= NGrades[0];
        for (int i=1;i<N;i++)
        {
            if(NGrades[i]>max)
            {
                max = NGrades[i];
            }
        }

        return max;
    }


}
