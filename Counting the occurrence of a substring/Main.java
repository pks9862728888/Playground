import java.util.Scanner;
class Main
{
  public static void main(String args[]) 
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String substr = in.nextLine();
    int count_occur = 0;
    int substr_length = substr.length();
    
    // Counting number of occurence
    for(int i = 0; i < str.length() - substr_length + 1; i++)
    {
      if((str.substring(i, i + substr_length)).contains(substr))
        count_occur++;
    }
    System.out.println(count_occur);
  } 
}