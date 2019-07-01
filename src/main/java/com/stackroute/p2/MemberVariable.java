package com.stackroute.p2;

public class MemberVariable {

   Member ob = new Member();

    public void Init(String Name, int Age, double Salary)
    {
        //Member ob = new Member();
        ob.Name = Name;
        ob.Age = Age;
        ob.Salary = Salary;
    }


    public String Display()
    {
        //return "Member Name: \n" + ob.Name+"Member Age: \n"+ob.Age+"Member Salary: "+ob.Salary;

        return "Member Name: " + ob.Name+" Member Age: "+ob.Age+" Member Salary: "+ob.Salary;

    }
}
