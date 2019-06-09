import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeMap map = new TreeMap();
      
      // Getting input and inserting values into map
      System.out.print("Enter the number of values to be inserted in map:");
      int size = Integer.parseInt(br.readLine());
      System.out.println(size);
      for(int i = 0; i < size; i++)
      {
        String key = br.readLine();
        String value = br.readLine();
        map.put(key, value);
      }
      System.out.println(map);
      
      // Getting input and removing value from map
      System.out.print("Enter the index to be removed:");
      String removeIndex = br.readLine();
      System.out.println(removeIndex);
      if(!map.isEmpty() && map.containsKey(removeIndex))
      {
      	map.remove(removeIndex);
      }
      System.out.println(map);
      
      // Getting input and inserting value into map
      System.out.print("Enter the index to insert:");
      String insertIndex = br.readLine();
      System.out.println(insertIndex);
      System.out.print("Enter the value to be inserted:");
      String insertValue = br.readLine();
      System.out.println(insertValue);
      map.put(insertIndex, insertValue);
      System.out.println(map);
      
      // Closing buffered reader object
      br.close();
    }
}