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
    
    // Printing upper traingular elements
    int row = 0;
    int col = 0;
    int seed_c = 0;
    for(int i = 0; i < row_size * col_size; i++)
    {
      if(col >= row)
      {
        System.out.print(matrix[row][col] + " ");
        if(row == 0 && col == col_size - 1)
        break;
      }
      row++;
      col++;
      if(col == col_size && row == row_size)
      {
        row = 0;
        col = ++seed_c;
      }
      else if(col == col_size && row != row_size)
      {
        row = 0;
        if(col >= col_size)
          col = col_size - 1;
      }
    }
  }
}