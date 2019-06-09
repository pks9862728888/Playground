import java.util.Scanner;
class Main
{
  public static void main (String[] args)
  {
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
      
    print_prime(number);
  }
  
  public static void print_prime(int n)
  {
    for(int curr_num = 2; curr_num <= n; curr_num++)
    {
      // Checking for prime number
      int count = 0;
      for(int num = 2; num <= curr_num/2; num++)
        if(curr_num % num == 0)
        {
          count += 1;
          break;
        }
      if(count == 0)
        System.out.println(curr_num);
    }
  }
}