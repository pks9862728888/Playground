import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      LinkedHashSet set = new LinkedHashSet();
      
      // Getting required inputs and storing in set
      String str[] = br.readLine().split(",");
      for(String s : str)
      {
        set.add(s);
      }
      
      // Printing the set after adding value
      System.out.println(set);
      
      // Getting the value to delete and deleting it
      System.out.print("Enter the value to be deleted: ");
      String delValue = br.readLine();
      set.remove(delValue);
      System.out.println(delValue);
      
      // Printing the set after deleting
      System.out.println(set);
      
      // Getting the value to be added in set
      System.out.print("Enter the value to be added: ");
      String addValue = br.readLine();
      set.add(addValue);
      System.out.println(addValue);
      
       // Printing the set after adding value
      System.out.println(set);
      
      // Closing the buffered reader object
      br.close();
    }
}