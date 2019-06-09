import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int max_rows = in.nextInt();
      int count = 1;
      for(int curr_row = 1; curr_row <= max_rows; curr_row++)
      {
        // For printing space
        for(int space = 1; space <= max_rows - curr_row; space++)
          System.out.print(" ");
        
        // For printing numbers
        for(int curr_col = 1; curr_col <= curr_row; curr_col++)
        {
          System.out.print(count + " ");
          count++;
        }
        
        if(count < 15)
          System.out.println();
      }
    }    
}