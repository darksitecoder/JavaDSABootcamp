package darksitecoder.com;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        System.out.print("Please enter 2 values: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b =input.nextInt();
        System.out.print("Please enter your operator(+, -, *, /):");
        char c = input.next().charAt(0);
        if (c == '+')
        {
            System.out.println("Addition of your two number is "+(a+b));
        }
        else if (c == '-')
        {
            System.out.println("Subtraction of your two number is "+(a-b));
        }
        else if (c == '*')
        {
            System.out.println("Multiplication of your two number is "+(a*b));
        }
        else if (c == '/')
        {
            System.out.println("Division of your two number is "+(a/b));
        }
    }
}
