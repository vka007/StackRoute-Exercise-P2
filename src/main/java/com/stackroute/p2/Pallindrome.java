package com.stackroute.p2;

import java.util.Scanner;

public class Pallindrome {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String query = scanner.nextLine();

        String Result = reverseString(query);
        System.out.println(Result);

    }

    public static String reverseString(String query)
    {
        String Result = "";

        for (int i=query.length()-1;i>=0;i--)
        {
            Result = Result+query.charAt(i);
        }

        if(query.equals(Result))
        {
            return "It is pallindrome";
        }
        else
        {
            return "It is not pallindrome";
        }

    }
}
