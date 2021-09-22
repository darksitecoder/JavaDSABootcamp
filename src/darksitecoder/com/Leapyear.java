package darksitecoder.com;

import java.util.Scanner;

// Q = Input a year and find whether it is a leap year or not.
public class Leapyear
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year:");

        int year = input.nextInt();

        if(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
        {
            System.out.println("It is a leap Year");
        }
        else
        {
            System.out.println("It is not a leap year");
        }

    }
}
