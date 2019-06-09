import java.util.Scanner;
class Main
{
  public static void main(String args[]) 
  {
    Scanner in = new Scanner(System.in);
    // Getting required inputs
    StringBuilder str = new StringBuilder(in.nextLine());
    int key = in.nextInt();
    
    // Decoding string
    for(int i = 0; i < str.length(); i++)
    {
      char ch = str.charAt(i);
      if(ch >= 'a' && ch <= 'z')
      {
        if(ch - 'a' - key >= 0)
          ch = (char)(ch - key);
        else
          ch = (char)('z' - (key - (ch - 'a')) + 1);
        str.setCharAt(i, ch);
      }
      else if(ch >= 'A' && ch <= 'Z')
      {
        if(ch - 'A' - key >= 0)
          ch = (char)(ch - key);
        else
          ch = (char)('Z' - (key - (ch - 'A')) + 1);
        str.setCharAt(i, ch);
      }
    }
    
    // Printing decoded string
    System.out.println(str);
  }
}