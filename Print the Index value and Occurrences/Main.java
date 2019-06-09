import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main 
{
    public static void main(String[] args) throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Pattern word = Pattern.compile(br.readLine());
      String str = br.readLine();
      Matcher matcher = word.matcher(str);
      
      int count = 0;
      while(matcher.find())
      {
        System.out.println("found: " + ++count + " " + ":" + " " + 
                           matcher.start() + " - " + matcher.end());
      }
      
      if(count == 0)
      {
        System.out.println("The given word is not present in the string");
      }
      else
      {
        System.out.println(count);
      }
    }
}