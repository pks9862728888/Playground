import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    // Getting required inputs
    int arr_size = in.nextInt();
    int arr_elements[] = new int[arr_size];
    for(int i = 0; i < arr_size; i++)
      arr_elements[i] = in.nextInt();
    
    // Finding maximum sum of subsequence
    int curr_sum = 0;
    int max_sum = 0;
    for(int i = 0; i < arr_size; i++)
    {
      if(i != 0 && arr_elements[i] < arr_elements[i-1])
      {
        if(curr_sum > max_sum)
        {
          max_sum = curr_sum;
          curr_sum = 0;
        }
      	else
        {
          curr_sum = 0;
        }
      }
      
      curr_sum += arr_elements[i];
      
      if (i == arr_size - 1)
        if(curr_sum > max_sum)
        {
          max_sum = curr_sum;
          curr_sum = 0;
        }
    }
    
    // Printing maximum sum of elements
    System.out.println(max_sum);
  }
}