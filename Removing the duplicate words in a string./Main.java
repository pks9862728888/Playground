import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    // Getting required inputs
    String str0 = in.nextLine();
    String str_list[] = str0.split(" ");
    StringBuilder str = new StringBuilder("");
    
    // Removing duplicates
    for(int i = 0; i < str_list.length; i++)
    {
      Boolean repeated_flag = false;
      for(int j = 0; j < i; j++)
      {
        if(str_list[i].equals(str_list[j]))
           {
             repeated_flag = true;
             break;
           }
      }
      if(repeated_flag == false)
           str.append(str_list[i] + " ");
    }  
    System.out.println(str);
  }
}