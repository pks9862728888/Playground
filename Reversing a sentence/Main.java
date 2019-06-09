import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      StringBuilder str = new StringBuilder(in.nextLine());
      reverse_string(str, 0, str.length() - 1);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
      StringBuffer temp_str = new StringBuffer(" ");
      
      // Appending space in beginning
      temp_str.append(sb);
      sb.setLength(0);
      sb.append(temp_str);
      temp_str.setLength(0);
      
      // Reversing string
      for(int i = sb.length() - 1; i >= 0; i--)
      {
        if(sb.charAt(i) == ' ')
        {
          // Finding position of next space + 1
          int next_space = sb.length();
          for(int idx = i + 1; idx < sb.length() - 1; idx++)
            if(sb.charAt(idx) == ' ')
            {
              next_space = idx;
              break;
            }
          
          // Appending word to temp string
          temp_str.append(sb.substring(i, next_space));
        }
      }
      
      sb = new StringBuilder(temp_str.toString().trim());
      System.out.println(sb);
    }
}