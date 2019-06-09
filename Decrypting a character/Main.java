import java.util.Scanner;
public class Main
{
    public static void main(String args[]) 
    {
      Scanner in = new Scanner(System.in);
      char ch = in.next().charAt(0);
      int key = in.nextInt();
      
      // Decripting characters
      if (ch >= 'a' && ch <= 'z')
      {
        int offset = ch - 'a';
        offset = (key - offset);
        ch = (char)('z' - offset + 1);
      }
      else if (ch >= 'A' && ch <= 'Z')
      {
        ch = (char)(ch - key);
      }
      
      System.out.println(ch);
    }
}