import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    StringBuilder str = new StringBuilder(in.nextLine());
    StringBuilder str1 = new StringBuilder(in.nextLine());
    
    // Removing characters from first string which are persent in second
    for(int sc_idx = 0; sc_idx < str1.length(); sc_idx++)
    {
      for(int f_idx = 0; f_idx < str.length(); f_idx++)
      {
        if(str1.charAt(sc_idx) == str.charAt(f_idx))
        {
          str.delete(f_idx, f_idx + 1);
          f_idx--;
        }
      }
    }
    
    System.out.println(str);
  }
}