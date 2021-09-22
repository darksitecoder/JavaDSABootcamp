package darksitecoder.com;

import java.util.Scanner;

// Q = Take a number as input and print the multiplication table for it.
public class Multiplication_Table
{
    public static void main(String[] args)
    {
        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(a * i);
        }
    }
}
