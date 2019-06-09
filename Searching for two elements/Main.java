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
      int search_elem_1 = in.nextInt();
      int search_elem_2 = in.nextInt();
      int elem_1_index = -1, elem_2_index = -1;
      
      // Searching for element in array and finding their index
      for(int idx = 0; idx < arr_size; idx++)
      {
        if(arr[idx] == search_elem_1)
          elem_1_index = idx;
        if(arr[idx] == search_elem_2)
          elem_2_index = idx;
      }
      
      // Displaying outputs
      System.out.println(elem_1_index);
      System.out.println(elem_2_index);
    }
}