import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int l, b, area;
      l = in.nextInt();
      b = in.nextInt();
      area = l*b;
      System.out.println(area);
	}
}