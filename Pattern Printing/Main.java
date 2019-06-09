import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int row = in.nextInt();
      int col = in.nextInt();
      for(int r = 1; r <= row; r++)
      {
        int num = row;
        int update = 1;
        for(int c = 1; c <= col; c++)
        {
          System.out.print(num);
          if(update < r)
          {
            num--;
            update++;
          }
        }
        System.out.println();
      }
    }
}