package darksitecoder.com;

import java.util.Scanner;

public class CurrencyConverter
{
    public static void main(String[] args)
    {
        System.out.print("Please enter your USD currency $");
        Scanner input = new Scanner(System.in);
        int usd = input.nextInt();
        System.out.println("Your total amount in Indian rupee is "+(usd * 73.68)+"₹");
    }
}
