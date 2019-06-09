import java.util.Scanner;
class Main
{
	public static void main(String[] args) 
  	{ 
      Scanner in = new Scanner(System.in);
      StringBuilder sb = new StringBuilder(in.nextLine());
      String replace = in.nextLine();
      String new_word = in.nextLine();
      
      if(sb.toString().contains(replace))
      {
        int start_index = sb.indexOf(replace);
        int end_index = start_index + replace.length();
        sb.replace(start_index, end_index, new_word);
        System.out.println(sb);
      }
    }
}