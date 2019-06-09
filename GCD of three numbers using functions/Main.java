import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int num3 = in.nextInt();
  
    int gcd = find_gcd(num1, num2);
    gcd = find_gcd(gcd, num3);
  
    System.out.println(gcd);
  }
  
  public static int find_gcd(int n1, int n2)
  {
    int min_no, factor;
    if(n1 > n2)
      min_no = n2;
    else 
      min_no = n1;
    for(factor = min_no; factor > 0; factor--)
      if(n1 % factor == 0 && n2 % factor == 0)
        break;
    return factor;
  }
}
