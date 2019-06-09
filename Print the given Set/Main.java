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
      String strNumbers[] = br.readLine().split(",");
      
      for(String s: strNumbers)
      {
        set.add(s);
      }
      
      // Printing the required output
      System.out.println(set);
      
      // Closing buffered reader object
      br.close();
    }
}