import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int current_number = 0, previous_number = 0;
    while(n > 0)
    {
      current_number = n % 10;
      if(n/10 == 0)
        break;
      else
        previous_number = current_number;
      n /= 10;
    }
    System.out.println(previous_number);
  }
}