import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    // Getting required inputs
    StringBuilder str = new StringBuilder(in.nextLine());
    StringBuilder temp_word = new StringBuilder("");
    StringBuilder temp_str = new StringBuilder("");
    
    // Reversing each word in string
    for(int i = 0; i < str.length(); i++)
    {
      char ch = str.charAt(i);
      if(ch != ' ')
        temp_word.append(ch);
      if(ch == ' ' || i == str.length() - 1)
      {
        temp_str.append(temp_word.reverse() + " ");
        temp_word.setLength(0);
      }
    }
    
    // Changing the original string
    str.setLength(0);
    str.append(temp_str);
    
    // Printing the reversed words of string
    System.out.println(str);
  }
}