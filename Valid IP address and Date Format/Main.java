import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*; 
public class Main
{
	
	public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      String ip = in.nextLine();
      String date = in.nextLine();
      
      System.out.println(ip + " is valid? " + 
                         Pattern.matches("\\d+.\\d+.\\d+.\\d+", ip));
      System.out.println("Is " + date + " a valid date format? " + 
                         Pattern.matches("\\d+/\\d+/\\d\\d\\d\\d", date));
    }
}