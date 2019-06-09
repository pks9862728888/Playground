import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeSet set = new TreeSet();
      
      // Getting inputs and printing the duplicate elements
      String str[] = br.readLine().split(",");
      System.out.println("Duplicate Entry is:");
      for(String s: str)
      {
        // Adding elements to set
        Boolean duplicate = set.add(s);
        
        // Printing duplicate elements
        if (duplicate == false )
        {
        	System.out.println(s);
        }
      }
      
      // Printing the tree set
      System.out.println("TreeSet is : " + set);
    }
}