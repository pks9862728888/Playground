import java.util.Scanner;
class Main
{
  public static void main (String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    
    // Calling function to find square of number
    int sq = square(n);
    
    System.out.println(sq);
  }
  
  public static int square(int num)
  {
    return num*num;
  }
}