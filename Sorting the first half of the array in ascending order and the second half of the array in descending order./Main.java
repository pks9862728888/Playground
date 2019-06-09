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
    int mid = n/2;
    
    // Sorting first half in ascending order
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
    
    // Sorting second half in descending order
    for(int i = mid; i < n - 1; i++)
    {
      for(int j = mid; j < n - 1; j++)
      {
        if(arr[j] < arr[j+1])
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