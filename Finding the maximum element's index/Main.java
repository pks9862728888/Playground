import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    
    for(int idx = 0; idx < n ; idx++)
      list[idx] = in.nextInt();
    
    int max_element = list[0], index = list[0];
    
    for(int idx = 0; idx < n; idx++)
      if(list[idx] > max_element)
      {
        max_element = list[idx];
        index = idx;
      }
    
    System.out.println(index);
    
  }
}