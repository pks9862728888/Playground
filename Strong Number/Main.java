import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int sum = 0, n_copy = num;
      while(num>0)
      {
        int last_digit = num % 10;
        num /= 10;
        
        // Finding factorial of last digit
        int fact = 1;
        for(; last_digit > 0; last_digit--)
          fact *= last_digit;
        
        // Finding sum of factorial of digits
        sum += fact;
      }
      
      // Checking Strong number
      if(sum == n_copy)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}