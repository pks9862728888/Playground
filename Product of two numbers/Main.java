import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num1, num2, prod;
      num1 = in.nextInt();
      num2 = in.nextInt();
      prod = num1 * num2;
      System.out.println(prod);
	}
}