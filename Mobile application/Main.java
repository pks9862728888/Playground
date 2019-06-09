class MyModel1 
{
  private String model = "MyModel 1";
  private int camera = 2;
  private String lock = "No lock";
  public int display = 5;
  
  public MyModel1()
  {
    System.out.println("Features of " + model);
    System.out.println("Camera mega pixels: " + camera);
  }
}
class MyModel2 extends MyModel1 
{
  private String model = "MyModel 2";
  private int camera = 5;
  public String lock = "Fingerprint";
  
  public MyModel2()
  {
    System.out.println("Features of " + model);
    System.out.println("Camera mega pixels: " + camera);
    System.out.println("Lock mechanism: " + lock);
    System.out.println("Display size: " + display);
  }
}
class MyModel2T extends MyModel2 
{
  private String model = "MyModel 2T";
  private int camera = 16;
  private int display = 6;
  
  public MyModel2T()
  {
  	System.out.println("Features of " + model);
    System.out.println("Camera mega pixels: " + camera);
    System.out.println("Lock mechanism: " + lock);
    System.out.println("Display size: " + display);
  }
}
public class Main 
{
    public static void main(String[] args) 
    {
      MyModel2T ob = new MyModel2T();
    }
}