package darksitecoder.com;

import java.util.Scanner;

class Billing
{
    String CName;
    int ProductId;
    int ProductPrice;
    void Customer()
    {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter your name: ");
       CName = input.nextLine();
       System.out.print("Enter your Product ID: ");
       ProductId = input.nextInt();
       System.out.print("Enter your Product Price: ");
       ProductPrice = input.nextInt();
        System.out.print("Enter date of order: ");
        int[] arr = new int[3];
        for (int i = 0; i<3; i++) {
            arr[i] = input.nextInt();
        }
        for (int j = 0; j<3; j++)
        {
             arr[0] = arr[0] + 5;
            System.out.print(arr[j]+"/");
        }
        System.out.println();
       System.out.println("Enter your Product Type(Food = f, Electronics = e, Luxury = l): ");
       char ProductType = input.next().charAt(0);

        System.out.println("Your billing is :");
        if (ProductType == 'f') {
            System.out.println("Your total is:" + (ProductPrice+((ProductPrice * 5) / 100)) + " with GSt");
        }
        else if (ProductType == 'e') {
            System.out.println("Your total is:" + (ProductPrice+((ProductPrice * 18) / 100)) + " with GSt");
        }
        else if (ProductType == 'l'){
            System.out.println("Your total is:" + (ProductPrice+((ProductPrice * 12) / 100)) +" with GSt");
        }

   }
}


public class Bill extends Billing
{
    public static void main(String[] args)
    {
        Billing b = new Billing();
        b.Customer();
    }
}
