import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // Getting required inputs
      LinkedList<String> list = new LinkedList<String>();
      while(true)
      {
        Boolean exitFlag = false;
        System.out.println("Choose any one:\n"+
                           "1.Insert\n" +
                           "2.delete\n" +
                           "3.Display" +
                           "\n4.Exit");
        int choice = -1;
        try
        {
        	choice = Integer.parseInt(br.readLine());
        }
        catch(Exception e)
        {
          continue;
        }
        switch(choice)
        {
          case 1:
            String str[] = br.readLine().split(",");
            for(String s: str)
            {
              list.add(s);
            }
            break;
          case 2:
            System.out.print("Enter the index value to be deleted:");
            int delIndex = Integer.parseInt(br.readLine());
            list.remove(delIndex);
            System.out.println(delIndex);
            break;
          case 3:
            System.out.println(list);
            break;
          case 4:
            exitFlag = true;
            break;
        }
        // Exiting if user want to exit
        if(exitFlag == true)
          break;
      }
      br.close();
    }
}