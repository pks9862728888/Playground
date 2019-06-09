import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String str = in.nextLine().toLowerCase();
      int char_count[] = new int[26];
      
      // Initializing frequency to 0
      for(int i = 0; i < 26; i++)
        char_count[i] = 0;
      
      // Finding frequency of each character
      for(int i = 0; i < str.length(); i++)
        if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
          char_count[(int)(str.charAt(i) - 'a')]++;
      
      // Finding missing alphabets
      for(int i = 0; i < 26; i++)
        if(char_count[i] == 0)
          System.out.print((char)('a' + i) + " ");
    }
}