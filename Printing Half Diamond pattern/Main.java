import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int max_rows = in.nextInt();
      for(int curr_row = 1; curr_row <= max_rows; curr_row++)
      {
        // For printing spaces
        for(int space = 1; space <= max_rows - curr_row; space++)
          System.out.print(" ");
        
        // For printing *
        for(int curr_col = 1; curr_col <= 2*curr_row - 1; curr_col++)
          System.out.print("*");
        
        System.out.println();
      }
	}
}