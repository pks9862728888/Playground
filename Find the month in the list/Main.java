import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // Getting required inputs
      List<String> monthList = new ArrayList<String>();
      String str[] = br.readLine().split(",");
      for(String s : str)
      {
        monthList.add(s);
      }
      String month = br.readLine();
      
      // Printing output
      System.out.println(monthList);
      System.out.println("Size of the linked list: " + monthList.size());
      System.out.println("Is LinkedList empty? " + monthList.isEmpty());
      System.out.println("Does LinkedList contains " + month + "?");
      System.out.println(monthList.contains(month));
    }
}