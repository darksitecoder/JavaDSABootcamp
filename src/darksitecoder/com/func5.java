//Write a function to find if a number is a palindrome or not. Take number as a parameter.

package darksitecoder.com;

import java.util.Scanner;

public class func5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");

        int num = input.nextInt();
        Palindrome(num);
    }

    static void Palindrome(int num)
    {
        int remind, sum = 0, temp;
        temp = num;
        while (num>0)
        {
            remind = num % 10;
            sum = (sum*10) + remind;
            num = num / 10;
        }
        if (temp == sum)
        {
            System.out.println("Your number is Palindrome");
        }
        else {
            System.out.println("Your number is not Palindrome");
        }
    }
}
