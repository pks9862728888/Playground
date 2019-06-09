import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int factorial = 1;
      for(; num > 0; num--)
        factorial *= num;
      System.out.println(factorial);
	}
}