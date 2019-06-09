import java.io.*;
import java.lang.*;
import java.util.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeSet set = new TreeSet();
      
      // Getting the required inputs and storing it in set
      String str[] = br.readLine().split(",");
      for(String s : str)
      {
        set.add(s);
      }
      
      // Printing the set before deleting
      System.out.println(set);
      
      // Removing last element and printing set after removing
      for(int i = set.size() - 1; i >= 0; i--)
      {
        set.remove(set.last());
        System.out.println(set);
      }
      
      // Closing the buffered reader object
      br.close();
    }
}