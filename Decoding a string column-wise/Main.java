import java.util.Scanner;
class Main
{
  public static void main(String args[]) 
  {
    Scanner in = new Scanner(System.in);
    // Getting required inputs
    StringBuilder str = new StringBuilder(in.nextLine());
    int col_count = in.nextInt();
    
    // Removing white spaces
    for(int i = 0; i < str.length(); i++)
      if(str.charAt(i) == ' ')
        str.delete(i, i+1);
    
    // Finding row count
    int row_count;
    int str_len = str.length();
    if(str_len  % col_count == 0)
      row_count = str_len / col_count;
    else
      row_count = str_len / col_count + 1;
    
    // Forming double dimentional array
    char letters[][] = new char[row_count][col_count];
    
    // Putting characters in Double dimensional array
    int row = 0;
    int col = 0;
    for(int i = 0; i < row_count * col_count; i++)
    {
      if(i < str_len)
      	letters[row][col] = str.charAt(i);
      else
        letters[row][col] = 'X';

      if(row % 2 == 0 && col == col_count - 1 || row % 2 == 1 && col == 0)
        row++;
      else
      {
        if(row % 2 == 0)
        col++;
      else
        col--;
      }
    }
    
    // Forming the decoded string
    str.setLength(0);
    for(col = 0; col < col_count; col++)
    {
      for(row = 0; row < row_count; row++)
      {
        str.append(letters[row][col]);
      }
    }
    
    // Printing decoded string
    System.out.println(str);
    
  }
}