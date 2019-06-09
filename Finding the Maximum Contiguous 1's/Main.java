import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      // Getting required inputs
      int arr_size = in.nextInt();
      int arr_elements[] = new int[arr_size];
      for(int i = 0; i < arr_size; i++)
        arr_elements[i] = in.nextInt();
      
      // Finding maximum contiguous sum of elements
      int max_contiguous = 0;
      int curr_contiguous = 0;
      for(int i = 0; i < arr_size; i++)
      {
        if(i != 0 && arr_elements[i] != arr_elements[i-1])
        {
          if(curr_contiguous > max_contiguous)
          {
            max_contiguous = curr_contiguous;
            curr_contiguous = 0;
          }
          else
          {
            curr_contiguous = 0;
          }
        }
        curr_contiguous++;
        
        if(i == arr_size - 1)
          if(curr_contiguous > max_contiguous)
            max_contiguous = curr_contiguous;
      }
      
      // Printing max contiguous count
      System.out.println(max_contiguous);
    }
}