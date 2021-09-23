package darksitecoder.com;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args)
    {
        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        if (num%2 == 0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
}
