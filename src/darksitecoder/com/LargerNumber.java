package darksitecoder.com;

import java.util.Scanner;

public class LargerNumber
{
    public static void main(String[] args)
    {
        System.out.print("Please enter two values: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a>b)
        {
            System.out.println(a+ " is larger number");
        }
        else
        {
            System.out.println(b+ " is larger number");
        }
    }
}
