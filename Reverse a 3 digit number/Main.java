import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int num, rev_no, rem;
    num = in.nextInt();
    rem = num % 10;
    num = num / 10;
    rev_no = rem;
    rem = num % 10;
    num = num / 10;
    rev_no = rev_no * 10 + rem;
    rem = num % 10;
    rev_no = rev_no * 10 + rem;
    System.out.println(rev_no);
  }
}