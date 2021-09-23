package darksitecoder.com;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args)
    {
        System.out.print("Please enter your name: ");
        Scanner input = new Scanner(System.in);

        String a = input.nextLine();

        System.out.println("Hello " +a+ " Welcome to our program.");
    }
}
