import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main 
{
  public static void main(String a[]) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // Getting required inputs
    String userName = br.readLine();
    String email = br.readLine();
    String password = br.readLine();
    
    // Printing required information
    System.out.println("Is " + userName + " a valid user name? " + 
                    Pattern.matches("\\w+", userName));
    System.out.println("Is " + email + " a valid email address? " + 
                    Pattern.matches("[a-z0-9_]+@[a-z.]+", email));
    System.out.println("Is " + password + " a valid password? " + 
                    Pattern.matches("[a-zA-Z0-9@#$%]+", password));
  }
}