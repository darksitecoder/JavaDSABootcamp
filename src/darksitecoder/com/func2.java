//Define a program to find out whether a given number is even or odd.

package darksitecoder.com;

import java.util.Scanner;
public class func2 {
    public static void main(String[] args)
    {
            Scanner input = new Scanner(System.in);

            System.out.println("Please enter your value");

            int num = input.nextInt();

            if (num%2 == 0)
            {
                System.out.println(num + " is even number.");
            }
            else {
                System.out.println(num + " is odd number.");
            }
    }
}
