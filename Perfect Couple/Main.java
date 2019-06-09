import java.util.Scanner;
class Main
{
    public static void main(String args[]) 
    {
      Scanner in = new Scanner(System.in);
      
      // Declaring variables and getting required inputs
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for (int i = 0; i < arr_size; i++)
        arr[i] = in.nextInt();
      int value = in.nextInt();
      
      // Searching pairs
      for (int index_1 = 0; index_1 < arr_size - 1; index_1++)
        for (int index_2 = index_1 + 1; index_2 < arr_size; index_2++)
        {
          if (arr[index_1] + arr[index_2] == value)
            System.out.println(arr[index_1] + ", " + arr[index_2]);
        }
    }
}