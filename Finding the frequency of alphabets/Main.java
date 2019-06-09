import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String str = in.nextLine().toLowerCase();
      int char_count[] = new int[26];
      
      // Initializing frequency
      for(int i = 0; i < 26; i++)
        char_count[i] = 0;
      
      // Counting char
      for(int i = 0; i < str.length(); i++)
        if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
          char_count[(int)(str.charAt(i) - 'a')]++;
      
      // Printing char frequency
      for(int i = 0; i < str.length(); i++)
        if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
        {
          int print_flag = 1;
          
          for(int j = 0; j < i; j++)
            if(str.charAt(j) == str.charAt(i))
              print_flag = 0;
          
          if(print_flag == 1)
          {
            System.out.print(str.charAt(i));
            System.out.print(char_count[(int)(str.charAt(i) - 'a')]);
            System.out.print(" ");
          }
        }
    }
}