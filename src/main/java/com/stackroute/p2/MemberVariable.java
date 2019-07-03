package com.stackroute.p2;

public class MemberVariable {

   Member ob = new Member();

    public void Init(String Name, int Age, double Salary)               //variable instantiate method
    {
        ob.Name = Name;
        ob.Age = Age;
        ob.Salary = Salary;
    }


    public String Display()                                             //method body
    {

        if(ob.Age<0 || ob.Salary<0 )                                //check valid or invalid input
        {
            return "Wrong input";
        }
        else
        {
            return "Member Name: " + ob.Name + " Member Age: " + ob.Age + " Member Salary: " + ob.Salary;
        }
    }
}
