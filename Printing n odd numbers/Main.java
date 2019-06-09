import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count = 0;
      for(int i = 1; ; i++)
      {
        if(i % 2 == 1)
        {
          System.out.println(i);
          count++;
        }
        if(count == n)
          break;
      }
	}
}