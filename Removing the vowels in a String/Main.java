import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    StringBuilder str = new StringBuilder(in.nextLine());
    
    // Removing vowels
    for(int i = 0; i < str.length(); i++)
    {
      char temp_char = str.charAt(i);
      if(temp_char >= 'A' && temp_char <= 'Z')
        temp_char = (char)(temp_char - 'a' + 'A');
      if(temp_char == 'a' || temp_char == 'e' || temp_char == 'i' || temp_char == 'o' || temp_char == 'u')
      {
        str.delete(i, i+1);
        i--;
      }
    }
    
    System.out.println(str);
  }
}