package darksitecoder.com;

import java.util.Scanner;

// Q = Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class Track_The_Number
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = 4;
        int a = 0;
        int sum = 0;
        while (a != x) {

            System.out.print("Please enter a number: ");
            a = input.nextInt();
            sum = sum+a;
        }
        System.out.println(sum);
    }
}
