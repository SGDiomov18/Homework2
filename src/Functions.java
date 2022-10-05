
import java.util.*;
public class Functions {

  private static int IntFirstNumber;
  private static int IntSecondNumber;


  private static double DoubleFirstNumber;
  private static double DoubleSecondNumber;


  private static float FloatFirstNumber;
  private static float FloatSecondNumber;


  private static byte ByteFirstNumber;
  private static byte ByteSecondNumber;


  private static boolean BooleanFirstNumber;
  private static boolean BooleanSecondNumber;


  static Scanner scan = new Scanner(System.in);

    public static int getIntFirstNumber() {

        IntFirstNumber= scan.nextInt();
        return IntFirstNumber;
    }

    public static int getIntSecondNumber() {
        IntSecondNumber= scan.nextInt();
        return IntSecondNumber;
    }


    public static double getDoubleFirstNumber() {

        DoubleFirstNumber= scan.nextDouble();
        return DoubleFirstNumber;
    }

    public static double getDoubleSecondNumber() {
        DoubleSecondNumber= scan.nextDouble();
        return  DoubleSecondNumber;
    }


    public static float getFloatFirstNumber() {

        FloatFirstNumber= scan.nextFloat();
        return FloatFirstNumber;
    }

    public static float getFloatSecondNumber() {

        FloatSecondNumber= scan.nextFloat();
        return FloatSecondNumber;
    }


    public static byte getByteFirstNumber() {

        ByteFirstNumber= scan.nextByte();
        return ByteFirstNumber;
    }

    public static byte getByteSecondNumber() {
        ByteSecondNumber= scan.nextByte();
        return ByteSecondNumber;
    }


    public static boolean getBooleanFirstNumber() {

        BooleanFirstNumber= scan.nextBoolean();
        return BooleanFirstNumber;
    }

    public static boolean getBooleanSecondNumber() {
        BooleanSecondNumber= scan.nextBoolean();
        return BooleanSecondNumber;
    }

    public static void OptionDev1(){

        System.out.println("Result: " + (IntFirstNumber / IntSecondNumber));
}
    public static void OptionDev2(){

        System.out.println("Result: " + (DoubleFirstNumber / DoubleSecondNumber));
    }

    public static void OptionDev3(){

        System.out.println("Result: " + (FloatFirstNumber / FloatSecondNumber));
    }

    public static void OptionDev4(){

        System.out.println("Result: " + (ByteFirstNumber / ByteSecondNumber));
    }




    public static void OptionMulti1(){

        System.out.println("Result: " + (IntFirstNumber * IntSecondNumber));
    }
    public static void OptionMulti2(){

        System.out.println("Result: " + (DoubleFirstNumber * DoubleSecondNumber));
    }

    public static void OptionMulti3(){

        System.out.println("Result: " + (FloatFirstNumber * FloatSecondNumber));
    }

    public static void OptionMulti4(){

        System.out.println("Result: " + (ByteFirstNumber * ByteSecondNumber));
    }

    public static void OptionMulti5(){

        System.out.println("Result: " + (BooleanFirstNumber | BooleanSecondNumber));
    }



}
