import java.util.Scanner;
class Main
{
    public static void main(String args[]) 
    {
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuffer reversed_str = new StringBuffer(str);
      int front = 0;
      int rear = str.length() - 1;
      
      // Reversing string
      while(front < rear)
      {
        char temp = reversed_str.charAt(front);
        reversed_str.setCharAt(front, reversed_str.charAt(rear));
        reversed_str.setCharAt(rear, temp);
        front++;
        rear--;
      }
      
      // Checking palindrome or not;
      if(str.equals(reversed_str.toString()))
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}