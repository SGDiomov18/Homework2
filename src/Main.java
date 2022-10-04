
import java.util.*;


public class Main {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);


        System.out.println("\n--- Welcome to the Data Type calculator ---");
        System.out.println("\n       Choose 1 of the 5 options:");
        System.out.println("\n -1- Int");
        System.out.println(" -2- Double");
        System.out.println(" -3- Float");
        System.out.println(" -4- Byte");
        System.out.println(" -5- Boolean");


        int OptionNumber = scan.nextInt();


        if(OptionNumber == 1)
        {
            System.out.println("\na = ");
            Functions.getIntFirstNumber();

            System.out.println("b = ");
            Functions.getIntSecondNumber();
            Functions.Option1();


        }
        else if(OptionNumber == 2)
        {
            System.out.println("\na = ");
            Functions.getDoubleFirstNumber();

            System.out.println("b = ");
            Functions.getDoubleSecondNumber();
            Functions.Option2();
        }
        else if(OptionNumber == 3)
        {
            System.out.println("\na = ");
            Functions.getFloatFirstNumber();

            System.out.println("b = ");
            Functions.getFloatSecondNumber();
            Functions.Option3();
        }

        else if(OptionNumber == 4)
        {
            System.out.println("\na = ");
            Functions.getByteFirstNumber();

            System.out.println("b = ");
            Functions.getByteSecondNumber();
            Functions.Option4();
        }

        else if(OptionNumber == 5)
        {
            System.out.println("\na = ");
            Functions.getByteFirstNumber();

            System.out.println("b = ");
            Functions.getByteSecondNumber();
            Functions.Option4();
        }

    }
}