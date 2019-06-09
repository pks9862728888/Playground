import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      // Getting required inputs
      int n = in.nextInt();
      int k = in.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = in.nextInt();

      // Printing frequency of each element
      for(int num = 1; num <= k; num++)
      {
        int frequency = 0;
        for(int idx = 0; idx < n; idx++)
          if(arr[idx] == num)
            frequency++;
        System.out.println(num + " " + frequency);
      }

    }
}
