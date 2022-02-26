package darksitecoder.com;

import java.util.Scanner;

public class AreaofCircle
{
    public static void main(String[] args)
    {
        System.out.print("PLease enter radius of circle: ");
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        input.close();
        System.out.println("Area of Circle is "+22/7*(radius * radius));
        
    }
}
