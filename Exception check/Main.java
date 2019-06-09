import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int input;
     
     try
     {
       try
       {
       input = in.nextInt();
       System.out.println(input);
       }
       catch (Exception a)
       {
       throw new InputMismatchException();
       }
     }
     catch(InputMismatchException e)
     {
      System.out.println("Input Mismatch Exception occurred");
     }
     
     // Closing Scanner object
     in.close();
   }
}