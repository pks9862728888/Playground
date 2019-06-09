import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int n_copy = n;
      // Code to find the total number of digits
      int n_digits = 0;
      if(n == 0)
        n_digits = 1;
      else
      {
        while(n>0)
        {
          n_digits += 1;
          n /= 10;
        }
      }
      
      // Code to find sum raised to power of number of digits
      int sum = 0;
      n = n_copy;
      while(n>0)
      {
        sum += Math.pow(n % 10, n_digits);
        n /= 10;
      }
      
      // Code to check armstrong number
      if(sum == n_copy)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
      
	}
}