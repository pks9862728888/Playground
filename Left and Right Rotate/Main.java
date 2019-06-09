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
    int no_of_rotation = in.nextInt();
    
    // Counting number of even and odd elements
    int odd_count = 0, even_count = 0;
    for(int i = 0; i < arr_size; i++)
      if((i + 1) % 2 != 0)
        odd_count++;
      else
        even_count++;
    
    // Creating even and odd arrays
    int even[] = new int[even_count];
    int odd[] = new int[odd_count];
    
    odd_count = 0;
    even_count = 0;
    for(int i = 0; i < arr_size; i++)
      if((i + 1) % 2 != 0)
        odd[odd_count++] = arr[i];
      else
        even[even_count++] = arr[i];
    
    // Right shifting even array
    int temp;
    for(int i = 0; i < no_of_rotation; i++)
    {
      temp = even[0];
      for(int j = 0; j < even_count - 1; j++)
        even[j] = even[j +  1];
      even[even_count - 1] = temp;
    }
    
    // Left shifting odd arr
    for(int i = 0; i < no_of_rotation; i++)
    {
      temp = odd[odd_count - 1];
      for(int j = odd_count - 1; j > 0; j--)
        odd[j] = odd[j -  1];
      odd[0] = temp;
    }
    
    // Combining both arrays
    odd_count = 0;
    even_count = 0;
    for(int i = 0; i < arr_size; i++)
      if((i + 1) % 2 != 0)
        arr[i] = odd[odd_count++];
      else
        arr[i] = even[even_count++];
    
    // Displaying result
      for(int i = 0; i < arr_size; i++)
      	System.out.print(arr[i] + " ");
  	}
}