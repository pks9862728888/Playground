import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[]) throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String splitString[] = br.readLine().split(",| |and|or");
      
      // Printing splitted pattern
      for(String str : splitString)
      {
        System.out.println(str);
      }
    }
}