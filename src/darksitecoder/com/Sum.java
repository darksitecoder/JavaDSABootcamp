package darksitecoder.com;

import java.util.Scanner;

// Q = Take two numbers and print the sum of both.
public class Sum
{
    public static void main(String[] args)
    {
        System.out.print("Enter two numbers : ");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println( a + b );
    }
}

