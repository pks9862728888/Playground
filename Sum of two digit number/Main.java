import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num, sum;
      num = in.nextInt();
      sum = num/10 + num%10;
      System.out.println(sum);
	}
}