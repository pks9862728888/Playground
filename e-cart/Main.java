//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  public void setPrice(int price)
  {
    this.price = price;
  }
  public int getPrice()
  {
    return this.price;
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  public void setProduct(String product)
  {
    this.product = product;
  }
  public void setQuantity(int quantity)
  {
    this.quantity = quantity;
  }
  public String getProduct()
  {
    return this.product;
  }
  public int getQuantity()
  {
    return this.quantity;
  }
}

class Bill
{
  //implement your logic to calculate total price
  public Bill(Item i, Customer c)
  {
    int price = i.getPrice() * c.getQuantity();
    System.out.println("Total Price is : " + price);
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    Item i = new Item();
    Customer c = new Customer();
    c.setProduct(in.nextLine());
    i.setPrice(Integer.parseInt(in.nextLine()));
    c.setQuantity(Integer.parseInt(in.nextLine()));
    Bill obj = new Bill(i, c);
  }
}