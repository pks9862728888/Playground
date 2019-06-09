import java.util.Scanner;
class Main
{
  public static void main (String[] args)
  {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    
    // Calling function
    int sum = sum_all_before(num);
    
    System.out.println(sum);
  }
  
  public static int sum_all_before(int n)
  {
    int sum = 0;
    
    for(int i = 1 ; i <= n; i++)
      sum += i;
    return sum;
  }
}