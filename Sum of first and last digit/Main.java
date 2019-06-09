import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int original_number = n, sum = 0;
      while(n > 0)
      {
        if(n == original_number)
          sum += n%10;
        if(n/10 == 0)
          sum += n;
        n /= 10;
      }
      System.out.println(sum);
	}
}