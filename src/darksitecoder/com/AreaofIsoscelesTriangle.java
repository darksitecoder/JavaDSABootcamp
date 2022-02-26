package darksitecoder.com;

import java.util.Scanner;

public class AreaofIsoscelesTriangle
{
    public static void main(String[] args)
    {
        System.out.print("Please enter breadth and height ");
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        int breadth = input.nextInt();
        System.out.println("Area: "+0.5*(height * breadth));
    }
}
