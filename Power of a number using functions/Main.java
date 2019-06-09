import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int exponent = in.nextInt();
    
    // Calling function to calculate power
    int power = power_of_num(base, exponent);
    
    System.out.println(power);
  }
  
  public static int power_of_num(int base, int exponent)
  {
    int product = 1;
    for (int count = 1; count <= exponent; count++)
      product *= base;
    return product;
  }
}