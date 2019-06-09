import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num, sum;
      num = in.nextInt();
      sum = num/100 + num%10;
      System.out.println(sum);
	}
}