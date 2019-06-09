import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    // Getting required inputs
    String str = in.nextLine();
    double n = 0.0;
    
    // Converting string to float
    Boolean decimal_reached_flag = false;
    int divisor_after_decimal = 10;
    for(int i = 0; i < str.length(); i++)
    {
      char ch = str.charAt(i);
      if(ch == '.')
      {
        decimal_reached_flag = true;
        continue;
      }
      
      if(ch >= '0' && ch <= '9' && decimal_reached_flag == false)
        n = n*10 + ch - '0';
      else if(ch >= '0' && ch <= '9' && decimal_reached_flag == true)
      {
        double temp = ch - '0';
        n = n + temp/divisor_after_decimal;
        divisor_after_decimal = divisor_after_decimal * 10;
      }
    }
    
    // Printing output
    System.out.printf("%.6f", n);
  }
}