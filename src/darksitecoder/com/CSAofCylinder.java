package darksitecoder.com;

import java.util.Scanner;

public class CSAofCylinder
{
    public static void main(String[] args)
    {
        System.out.print("Please enter radius and height of Cylinder :");
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        int height = input.nextInt();
        System.out.println("CSA : "+2*3.14*radius*height);
    }
}
