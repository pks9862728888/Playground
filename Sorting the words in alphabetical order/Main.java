import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    
    // Getting required inputs
    int arr_size = in.nextInt();
    String str_arr[] = new String[arr_size];
    String temp_flush = in.nextLine();
    for(int i = 0; i < arr_size; i++)
    {
      str_arr[i] = in.nextLine().toLowerCase();
    }
    
    // Sorting in alphabetical order
    for(int i = 0; i < arr_size - 1; i++)
    {
      for(int j = 0; j < arr_size - i - 1; j++)
      {
        if(str_arr[j].compareTo(str_arr[j+1]) > 0)
        {
          String temp_str = str_arr[j];
          str_arr[j] = str_arr[j+1];
          str_arr[j+1] = temp_str;
        }
      }
    }
    
    // Printing sorted array
    for(int i = 0; i < arr_size; i++)
      System.out.println(str_arr[i]);
    
  }
}