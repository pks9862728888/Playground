import java.util.Scanner;
class Main {
	public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      int num1, num2, num3, greatest;
      num1 = in.nextInt();
      num2 = in.nextInt();
      num3 = in.nextInt();
      if((num1>num2) & (num1>num3))
        greatest = num1;
      else if((num2>num1) & (num2>num3))
        greatest = num2;
      else
        greatest = num3;
      System.out.println(greatest);
    }
}