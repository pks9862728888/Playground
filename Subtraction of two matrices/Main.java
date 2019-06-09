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
    int matrix3[][] = new int[row_size][col_size];
    get_input(matrix1, row_size, col_size, in);
    get_input(matrix2, row_size, col_size, in);
    
    // Finding subtraction
    for(int row = 0; row < row_size; row++)
      for(int col = 0; col < col_size; col++)
        matrix3[row][col] = matrix1[row][col] - matrix2[row][col];
    
    // Printing the result
    for(int row = 0; row < row_size; row++)
    {
      for(int col = 0; col < col_size; col++)
      {
        System.out.print(matrix3[row][col] + " ");
      }
      System.out.println();
    }
  }
  public static void get_input(int matrix[][], int row_size, int col_size, Scanner in)
  {
    for(int row = 0; row < row_size; row++)
      for(int col = 0; col < col_size; col++)
        matrix[row][col] = in.nextInt();
  }
}