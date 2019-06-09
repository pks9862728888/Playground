import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int idx = 0; idx < arr_size; idx++)
        arr[idx] = in.nextInt();
      
      boolean is_palindrome = true;
      int first_idx = 0;
      int last_idx = arr_size - 1;
      
      // Checking whether palindrome or not
      while(first_idx < last_idx)
      {
        if(arr[first_idx] == arr[last_idx])
        {
          first_idx++;
          last_idx--;
        }
        else
        {
          is_palindrome = false;
          break;
        }
      }
      
      if(is_palindrome == true)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}