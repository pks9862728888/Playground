import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num, digit;
      num = in.nextInt();
      digit = num/100;
      System.out.println(digit);
	}
}