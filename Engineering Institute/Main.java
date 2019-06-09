//import required packages
import java.util.Scanner;
class Faculty
{
  private int baseSalary;
  public void salary()
  {
    Scanner in = new Scanner(System.in);
    this.baseSalary = in.nextInt();
  }
  public int getBaseSalary()
  {
    return this.baseSalary;
  }
}
class CSE extends Faculty
{
  private int baseSalary;
  public CSE(Faculty ob1)
  {
  baseSalary = ob1.getBaseSalary();
  }
  public void salary()
  {
    int salary = 3000 + this.baseSalary;
    System.out.println("CSE Faculty: " + salary);
  }
}
class IT extends Faculty
{
  private int baseSalary;
  public IT(Faculty ob1)
  {
  baseSalary = ob1.getBaseSalary();
  }
  public void salary()
  {
    int salary = 5000 + this.baseSalary;
    System.out.println("IT Faculty: " + salary);
  }
}
class ECE
{
  private int baseSalary;
  public ECE(Faculty ob1)
  {
  baseSalary = ob1.getBaseSalary();
  }
  public void salary()
  {
    int salary = 4500 + this.baseSalary;
    System.out.println("ECE Faculty: " + salary);
  }
}

class Main
{
  public static void main(String[] args)
  {
    Faculty ob = new Faculty();
    ob.salary();
    System.out.println("Base Salary: " + ob.getBaseSalary());
    CSE ob1 = new CSE(ob);
    ob1.salary();
    IT ob2 = new IT(ob);
    ob2.salary();
    ECE ob3 = new ECE(ob);
    ob3.salary();
  }
}