import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    // Getting required inputs
    int arr_size = in.nextInt();
    int arr_input[] = new int[arr_size];
    for(int i = 0; i < arr_size; i++)
      arr_input[i] = in.nextInt();
    
    // Finding max frequency element
    int max_freq_element = arr_input[0];
    int max_freq = 0;
    for(int i = 0; i < arr_size; i++)
    {
      int curr_freq = 0;
      // Counting frequency of each element
      for(int j = 0; j < arr_size; j++)
        if(arr_input[i] == arr_input[j])
          curr_freq++;
      
      // Finding max frequency element
      if(curr_freq > max_freq)
      {
        max_freq = curr_freq;
        max_freq_element = arr_input[i];
      }
    }
    
    // Printing max frequency element
    System.out.println(max_freq_element);
    
  }
}