import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int arr_size = in.nextInt();
    int arr[] = new int[arr_size];
    for(int i = 0; i < arr_size; i++)
      arr[i] = in.nextInt();
    
    // Printing all strictly increasing sub sequence of length 2
    for(int i = 0; i < arr_size; i++)
    {
      int prev_max = 0;
      for(int j = i + 1; j < arr_size; j++)
      {
        if(arr[j] > arr[i] && arr[j] > prev_max)
        {
          System.out.println(arr[i] + "," + arr[j]);
          prev_max = arr[j];
        }
      }
    }
  }
}