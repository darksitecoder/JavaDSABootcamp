//Write a program to print the factorial of a number by defining a method named 'Factorial'.
//Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
//4! = 1 * 2 * 3 * 4 = 24
//3! = 3 * 2 * 1 = 6
//2! = 2 * 1 = 2
//Also,
//1! = 1
//0! = 1

package darksitecoder.com;

import java.util.Scanner;
public class func4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your number: ");
        int n = input.nextInt();

        Factorial(n);
    }

    static void Factorial(int n)
    {
        int s=1;
        for (int i = 1; i <=n; i++)
        {
            s = s * i;

        }
        System.out.println(s+" is your Factorial");
    }
}
