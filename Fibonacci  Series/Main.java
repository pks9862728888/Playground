import java.io.*;
class Fibonacci extends Thread
{
	int limit;
    public Fibonacci(int limit)
    {
    	this.limit = limit;
    }
    public void run()
    {
        System.out.print("The Fibonacci series is :");
        if(this.limit == 1)
       {
        System.out.print("0");
       }
       else if(this.limit == 2)
       {
       	System.out.print("0 1");
       }
       else
       {
       	 int a = 0;
         int b = 1;
         if(this.limit == 1)
         {
        	 System.out.print(a);
         }
         else if(this.limit == 2)
         {
        	 System.out.print(a + " " + b);
         }
         else
         {
        	 System.out.print(a + " " + b);
        	 for(int i = 3; i <= this.limit; i++)
        	 {
        		 int c = a + b;
        		 System.out.print(" " + c);
        		 a = b;
        		 b = c;
        	 }
         }
       }
    }
}
class Main
{
     public static void main(String[] args) 
     {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the limit for Fibonacci: ");
       int limit_fib = 0;
       try
       {
       limit_fib = Integer.parseInt(br.readLine());
       }
       catch(IOException e)
       {
         System.out.println("Exception occurred");
         System.exit(1);
       }
       finally
       {
         System.out.println(limit_fib);
         if(limit_fib <= 0)
         {
           System.out.println("Exception occurred");
           System.exit(1);
         }
       }
       Fibonacci ob = new Fibonacci(limit_fib);
       ob.start();
     }
}