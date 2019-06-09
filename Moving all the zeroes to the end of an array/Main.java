import java.util.Scanner;
class Main
{
    public static void main(String args[]) 
    {
      Scanner in = new Scanner(System.in);
      
      // Getting inputs
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i = 0; i < arr_size; i++)
        arr[i] = in.nextInt();
      
      // Removing zeros from original array
      int num_count = 0;
      int temp_arr[] = new int[arr_size];
      for(int i = 0; i < arr_size; i++)
        if(arr[i] != 0)
          temp_arr[num_count++] = arr[i];
      
      // Adding zeros in end in original array
      int count_num = 0;
      for(int i = 0; i < arr_size; i++)
        if(count_num < num_count)
        {
          arr[i] = temp_arr[i];
          count_num++;
        }
      	else
          arr[i] = 0;
      
      // Displaying output
      for(int i = 0; i < arr_size; i++)
        System.out.print(arr[i] + " ");
    }
}