package darksitecoder.com;

import java.util.Scanner;

public class AreaofTriangle
{
    public static void main(String[] args)
    {
        System.out.print("Please enter base and the height of your triangle: ");
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int height = input.nextInt();
        System.out.println("Area of Triangle "+0.5*(base * height));
    }
}
