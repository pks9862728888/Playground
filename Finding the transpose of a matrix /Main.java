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
    
    // Finding transpose of matrix
    int t_matrix[][] = new int[col_size][row_size];
    for(int row = 0; row < row_size; row++)
      for(int col = 0; col < col_size; col++)
        t_matrix[col][row] = matrix[row][col];
    
    // Printing the result
    for(int col = 0; col < col_size; col++)
    {
      for(int row = 0; row < row_size; row++)
      {
        System.out.print(t_matrix[row][col] + " ");
      }
      System.out.println();
    }
    
  }
}