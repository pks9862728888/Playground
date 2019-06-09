import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    
    // Getting required inputs
    int row_size = in.nextInt();
    int col_size = in.nextInt();
    int matrix1[][] = new int[row_size][col_size];
    int matrix2[][] = new int[row_size][col_size];
    get_input(matrix1, row_size, col_size, in);
    get_input(matrix2, row_size, col_size, in);
    
    // Checking whether identical or not
    Boolean is_identical = true;
    for(int row = 0; row < row_size; row++)
    {
      for(int col = 0; col < col_size; col++)
      {
        if(matrix1[row][col] != matrix2[row][col])
        {
          is_identical = false;
          break;
        }
      }
      if(is_identical == false)
        break;
    }
    
    // Printing result
    if(is_identical == true)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
  public static void get_input(int matrix[][], int r, int c, Scanner in)
  {
    for(int row = 0; row < r; row++)
      for(int col = 0; col < c; col++)
        matrix[row][col] = in.nextInt();
  }
}