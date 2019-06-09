import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    // Getting required inputs
    int n = in.nextInt();
    StringBuilder str = new StringBuilder("");
    
    // Converting negative interger to positive integer
    Boolean neg_flag = false;
    if(n < 0)
    {
      neg_flag = true;
      n = n - 2*n;
    }
   
    // Converting integer to string
    while(n>0)
    {
      char ch = (char)(n % 10 + '0');
      n /= 10;
      str.append(ch);
    }
    
    // Adding - if integer was negative
    if(neg_flag == true)
      str.append('-');
    
    str = str.reverse();
    
    // Printing the result
    System.out.println(str);
  }
}