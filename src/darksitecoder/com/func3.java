//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//        Marks        Grade
//        91-100         AA
//        81-90          AB
//        71-80          BB
//        61-70          BC
//        51-60          CD
//        41-50          DD
//        <=40          Fail

        package darksitecoder.com;

import java.util.Scanner;
public class func3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();

        System.out.print("Please enter your marks: ");
        int marks = input.nextInt();

        grade(marks, name);
    }

    static void grade(int marks , String name)
    {
        if (marks > 91 && marks <100)
        {
            System.out.println(name+" got AA Grade");
        }
        else if (marks > 81 && marks <90)
        {
            System.out.println(name + " got AB Grade");
        }
        else if (marks > 71 && marks < 80)
        {
            System.out.println(name + " got BB Grade");
        }
        else if (marks > 61 && marks <70)
        {
            System.out.println(name + " got BC Grade");
        }else if (marks > 51 && marks <60)
        {
            System.out.println(name + " got CD Grade");
        }
        else if (marks > 41 && marks < 50)
        {
            System.out.println(name + " got DD Grade");
        }
        else if (marks <= 40)
        {
            System.out.println(name + " is fail");
        }

    }
}
