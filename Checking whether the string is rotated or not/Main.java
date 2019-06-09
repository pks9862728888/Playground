import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      StringBuilder str = new StringBuilder(in.nextLine());
      String rot_str = in.nextLine();
      
      str.append(str);
      if(str.toString().contains(rot_str))
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}