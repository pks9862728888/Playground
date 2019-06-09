import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      
      // Getting required inputs
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int idx = 0; idx < arr_size; idx++)
        arr[idx] = in.nextInt();
      int largest = arr[0];
      
      // Finding largest number
      for(int idx = 0; idx < arr_size; idx++)
        if(arr[idx] > largest)
          largest = arr[idx];
      
      // Displaying output
      System.out.println(largest);
    }
}