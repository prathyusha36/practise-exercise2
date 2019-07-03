package main.java.com.stackroute.pe2;
/*
An other class named MemberVariable that creates an instance of the Member class, initialises its
member variables, and then displays the value of each member variable.
 */
public class MemberVariable {
    Member member=new Member();
    public String printValues(String name,int age,double salary)
    {
        member.name=name;
        member.age=age;
        member.salary=salary;
        return "Members name:"+member.name+"\n"+"Members age:"+member.age+"\n"+"members salary:"+member.salary;
    }

}
