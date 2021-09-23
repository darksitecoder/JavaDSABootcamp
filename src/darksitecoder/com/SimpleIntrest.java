package darksitecoder.com;

import java.util.Scanner;

public class SimpleIntrest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Principal value: ");
        int p = input.nextInt();
        System.out.print("Please enter Rate of interest: ");
        float r = input.nextFloat();
        System.out.print("Please enter time (in years): ");
        float t = input.nextFloat();

        float si = p * r * t;

        System.out.println("Your Simple interest is "+si);
    }
}
