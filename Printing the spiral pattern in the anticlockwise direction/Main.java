import java.util.Scanner;
class Main
{
     public static void main(String args[])
  {
       Scanner in = new Scanner(System.in);
       // Getting required inputs
       int n = in.nextInt();
       int arr[][] = new int[n][n];

       // Making spiral pattern
       make_spiral(arr, n);

       // Printing elements spirally
       for(int row = 0; row < n; row++)
       {
         for(int col = 0; col < n; col++)
         {
           System.out.print(arr[row][col] + " ");
         }
         System.out.println();
       }
  }

  public static void make_spiral(int arr[][], int n)
  {
    int val = 1;
    int min_row = 0;
    int max_row = n - 1;
    int min_col = 0;
    int max_col = n - 1;

    while(min_row <= max_row && min_col <= max_col)
    {
      // For right to left
      for(int i = max_col; i >= min_col; i--)
        arr[min_row][i] = val++;

      // For top to bottom
      for(int i = min_row + 1; i <= max_row; i++)
        arr[i][min_col] = val++;

      // For left to right
      for(int i = min_col + 1; i <= max_col; i++)
        arr[max_row][i] = val++;

      // For bottom to top
      for(int i = max_row - 1; i >= min_row + 1; i--)
        arr[i][max_row] = val++;

      // After one spiral sweep counter-clockwise
      // updating row and column
      min_row++;
      min_col++;
      max_row--;
      max_col--;
    }
  }
}
