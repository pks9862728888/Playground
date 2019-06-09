import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    // Getting required inputs
    int row_size = in.nextInt();
    int col_size = in.nextInt();
    int matrix[][] = new int[row_size][col_size];
    for(int row = 0; row < row_size; row++)
      for(int col = 0; col < col_size; col++)
        matrix[row][col] = in.nextInt();

    // Performing 90 degrees counter-clockwise rotation
    for(int row = row_size - 1; row >= 0; row--)
    {
      for(int col = 0; col < col_size; col++)
      {
      	System.out.print(matrix[col][row] + " ");
      }
      System.out.println();
    }
  }
}
