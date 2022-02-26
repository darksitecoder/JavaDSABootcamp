package darksitecoder.com;

import java.util.Scanner;

public class AreaofRectangle
{
    public static void main(String[] args)
    {
        System.out.println("Please enter Length and Breadth of Rectangle: ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int breadth = input.nextInt();

        System.out.println("Area of Rectangle "+length*breadth);




    }
}
