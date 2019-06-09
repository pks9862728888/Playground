import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      // Getting inputs
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int idx = 0; idx < n; idx++)
        arr[idx] = in.nextInt();
      
      // Printing missing elements
      for(int i = 1; i <= n; i++)
      {
        int contained = 0;
        for(int j = 0; j < n ;j++)
          if(arr[j] == i)
          {
            contained++;
            break;
          }
        if(contained == 0)
          System.out.println(i);
      }
    }
}