
import java.util.*;


public class Main {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);


        System.out.println("\n--- Welcome to the Data Type calculator ---");
        System.out.println("\n             Choose action: ");
        System.out.println("\n-1- Multiplication");
        System.out.println("-2- Division");

        int ActionTypeNumber = scan.nextInt();



        if(ActionTypeNumber == 1)
        {
            System.out.println("\n             Choose action: ");
            System.out.println("\n -1- Int");
            System.out.println(" -2- Double");
            System.out.println(" -3- Float");
            System.out.println(" -4- Byte");
            System.out.println(" -5- Boolean");
            System.out.println(" -6- Short");
            System.out.println(" -7- Long");

            int DataTypeNumber = scan.nextInt();

            if (DataTypeNumber == 1)
            {
                System.out.println("\na = ");
                Functions.getIntFirstNumber();

                System.out.println("b = ");
                Functions.getIntSecondNumber();

                Functions.OptionMulti1();


            }
            else if(DataTypeNumber == 2)
            {
                System.out.println("\na = ");
                Functions.getDoubleFirstNumber();

                System.out.println("b = ");
                Functions.getDoubleSecondNumber();

                Functions.OptionMulti2();
            }
            else if(DataTypeNumber == 3)
            {
                System.out.println("\na = ");
                Functions.getFloatFirstNumber();

                System.out.println("b = ");
                Functions.getFloatSecondNumber();

                Functions.OptionMulti3();
            }

            else if(DataTypeNumber == 4)
            {
                System.out.println("\na = ");
                Functions.getByteFirstNumber();

                System.out.println("b = ");
                Functions.getByteSecondNumber();

                Functions.OptionMulti4();
            }

            else if(DataTypeNumber == 5)
            {
                System.out.println("\na = ");
                Functions.getByteFirstNumber();

                System.out.println("b = ");
                Functions.getByteSecondNumber();

                Functions.OptionMulti5();
            }

            else if(DataTypeNumber == 6)
            {
                System.out.println("\na = ");
                Functions.getShortFirstNumber();

                System.out.println("\na = ");
                Functions.getShortSecondNumber();

                Functions.OptionMulti6();
            }

            else if(DataTypeNumber == 7)
            {
                System.out.println("\na = ");
                Functions.getLongFirstNumber();

                System.out.println("\na = ");
                Functions.getLongSecondNumber();

                Functions.OptionMulti7();

            }


        }

        if(ActionTypeNumber == 2)
        {
            System.out.println("\n             Choose action: ");
            System.out.println("\n -1- Int");
            System.out.println(" -2- Double");
            System.out.println(" -3- Float");
            System.out.println(" -4- Byte");
            System.out.println(" -5- Short");
            System.out.println(" -6- Long");


            int DataTypeNumber = scan.nextInt();

            if (DataTypeNumber == 1)
            {
                System.out.println("\na = ");
                Functions.getIntFirstNumber();

                System.out.println("b = ");
                Functions.getIntSecondNumber();
                Functions.OptionDev1();


            }
            else if(DataTypeNumber == 2)
            {
                System.out.println("\na = ");
                Functions.getDoubleFirstNumber();

                System.out.println("b = ");
                Functions.getDoubleSecondNumber();
                Functions.OptionDev2();
            }
            else if(DataTypeNumber == 3)
            {
                System.out.println("\na = ");
                Functions.getFloatFirstNumber();

                System.out.println("b = ");
                Functions.getFloatSecondNumber();
                Functions.OptionDev3();
            }

            else if(DataTypeNumber == 4)
            {
                System.out.println("\na = ");
                Functions.getByteFirstNumber();

                System.out.println("b = ");
                Functions.getByteSecondNumber();
                Functions.OptionDev4();
            }


            else if(DataTypeNumber == 5)
            {
                System.out.println("\na = ");
                Functions.getLongFirstNumber();

                System.out.println("b = ");
                Functions.getLongSecondNumber();
                Functions.OptionDev5();
            }


            else if(DataTypeNumber == 6)
            {
                System.out.println("\na = ");
                Functions.getLongFirstNumber();

                System.out.println("b = ");
                Functions.getLongSecondNumber();
                Functions.OptionDev6();
            }



        }



    }
}