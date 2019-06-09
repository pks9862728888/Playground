import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    
    int start_idx = str.length() / 2;
    int k = 1;
    for(int row = 1; row <= str.length(); row++)
    {
      // Printing white spaces
      for(int sp = 1; sp <= str.length() - row; sp++)
         System.out.print(" ");
      
      // Printing characters
      if(row <= start_idx + 1)
        System.out.print(str.substring(start_idx, start_idx + row));
      else
      {
      	System.out.print(str.substring(start_idx, str.length()));
        System.out.print(str.substring(0, k++));
      }
     
      System.out.println();
    }
  }
}