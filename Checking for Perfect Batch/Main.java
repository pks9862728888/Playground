import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    
    // Getting inputs
    int n = in.nextInt();
    int list[] = new int[n];
    
    for(int idx = 0; idx < n ; idx++)
      list[idx] = in.nextInt();
    
    int current_batch_sum = 0, previous_batch_sum = 0;
    int perfect_flag = 1;
    
    // Code for checking perfect batch
    for(int idx = 0; idx < n ; idx++)
    {
      current_batch_sum += list[idx];
      if((idx + 1) % 3 == 0)
      {
        if(idx == 2)
        {
          previous_batch_sum = current_batch_sum;
          current_batch_sum = 0;
          continue;
        }
        else
        {
          if(previous_batch_sum != current_batch_sum)
          {
            perfect_flag = 0;
            break;
          }
          else
          {
            previous_batch_sum = current_batch_sum;
          	current_batch_sum = 0;
          }
        }
      }
    }
    if(perfect_flag == 1)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}