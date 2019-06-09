import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
      
      // Getting input and inserting values in map
      System.out.print("Enter the number of values to be inserted in map:");
      int size = Integer.parseInt(br.readLine());
      System.out.println(size);
      for(int i = 0; i < size; i++)
      {
        String key = br.readLine();
        int value = Integer.parseInt(br.readLine());
        map.put(key, value);
      }
      
      // Printing the map after inserting values
      System.out.println(map);
      
      // Getting input and removing the entry
      System.out.print("Enter the index to be removed:");
      String removeIndex = br.readLine();
      System.out.println(removeIndex);
      map.remove(removeIndex);
      
      // Printing the map after removing the entry
      System.out.println(map);
      
      // Printing the size of map
      System.out.println("Size of map is : " + map.size());
    }
}