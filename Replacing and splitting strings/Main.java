import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      StringBuffer str1 = new StringBuffer(in.nextLine());
      String str2 = in.nextLine();
      int no_of_parts = in.nextInt();
      
      str1.setLength(0);
      str1.append(str2);
      String splitString[] = str1.toString().split(" ", no_of_parts);
      
      for(String str: splitString)
        System.out.println(str);
    }
}