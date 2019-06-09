import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int ch = in.nextInt();
      
      switch(ch)
      {
        case 1:
          int side = in.nextInt();
          System.out.println(side * side);
          break;
        case 2:
          int length = in.nextInt();
          int breadth = in.nextInt();
          System.out.println(length * breadth);
          break;
        case 3:
          int base = in.nextInt();
          int height = in.nextInt();
          System.out.println(0.5 * base * height);
          break;
        case 4:
          int radius = in.nextInt();
          System.out.println(3.14 * radius * radius);
      }
    }
}