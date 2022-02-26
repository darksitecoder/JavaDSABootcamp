//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

package darksitecoder.com;

import java.util.Scanner;
public class func1 {
    public static void main(String[] args)
    {
        dif();
    }

    static void dif()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first value: ");
        int first = input.nextInt();

        System.out.println("Please enter your first value: ");
        int second = input.nextInt();

        System.out.println("Please enter your first value: ");
        int third = input.nextInt();

        if (first > second && first >third)

        {
            System.out.println(first+" is larger");
        }
        else if (second > first && second > third)
        {
            System.out.println(second + " is larger");
        }
        else
        {
            System.out.println(third + " is larger");
        }
    }
}
