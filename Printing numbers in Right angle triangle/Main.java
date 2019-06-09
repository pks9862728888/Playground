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
        for(int curr_col = 1; curr_col <= curr_row; curr_col++)
          System.out.print(count);
        count++;
        System.out.println();
      }
	}
}