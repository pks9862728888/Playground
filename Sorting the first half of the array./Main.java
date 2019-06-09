import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    // Getting required inputs
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++)
      arr[i] = in.nextInt();
    
    // Sorting first half of the array
    int mid = n / 2;
    for(int i = 0; i < mid - 1; i++)
    {
      for(int j = 0; j < mid - i - 1; j++)
      {
        if(arr[j] > arr[j+1])
        {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    
    // Printing sorted array
    for(int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
  }
}