public class Main
{
	public static void main(String[] args)
    {
      Customers customerObj1 = new Customers(1001, "Saakshi", 9000000000L, "Bangalore", "16-Jul-1990", 'F', "Lakme Kajal, Salwar");
      Customers customerObj2 = new Customers(1008, "Rahul", 9000000001L, "Chennai", "27-Jan-1992", 'M', "T-Shirt, Jeans");
      Suppliers supplierObj1 = new Suppliers(7901, "ABC Traders", 8000000000L, "Mumbai", 10, "Paid", 4.75f);
      Suppliers supplierObj2 = new Suppliers(7972, "XYZ Enterprises", 8000000900L, "Kolkata", 7, "Unpaid", 4.35f);
      customerObj1.displayProfileDetails();
      customerObj2.displayProfileDetails();
      supplierObj1.displayProfileDetails();
      supplierObj2.displayProfileDetails();
      customerObj1.editAddress("Coimbatore");
      supplierObj1.editAddress("Delhi");
      customerObj1.placeOrder();
      supplierObj1.increaseStockLevel(5);
      supplierObj2.increaseStockLevel(10);
    }
}

class Users
{
  public int id;
  public String name;
  public long mobileNumber;
  public String address;

  public Users(int id, String name, long mobileNumber, String address)
  {
    this.id = id;
    this.name = name;
    this.mobileNumber = mobileNumber;
    this.address = address;
  }
  public void editAddress(String newAddress)
  {
    System.out.println(name + ", " + this.address);
    this.address = newAddress;
    System.out.println(name + ", " + this.address);
  }
}

class Customers extends Users
{
    private String dateOfBirth;
    private char gender;
    private String orderHistory;
    public Customers(int id, String name, long mobileNumber, String shippingAddress, String dateOfBirth, char gender, String orderHistory)
    {
    super(id, name, mobileNumber, shippingAddress);
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
    this.orderHistory = orderHistory;
    }

    public void placeOrder()
    {
    System.out.println("Order placed successfully!");
    }

    public void displayProfileDetails()
    {
    System.out.println(name + ", " + mobileNumber);
    }
}

class Suppliers extends Users
{
    private int itemsStock;
    private String paymentStatus;
    private float feedbackRating;

    public Suppliers(int id, String name, long mobileNumber, String billingAddress, int itemsStock, String paymentStatus, float feedbackRating)
    {
    super(id, name, mobileNumber, billingAddress);
    this.itemsStock = itemsStock;
    this.paymentStatus = paymentStatus;
    this.feedbackRating = feedbackRating;
    }

    public void increaseStockLevel(int newStockIncrement)
    {
    this.itemsStock += newStockIncrement;
    System.out.println(name + ", " + this.itemsStock);
    }

    public void displayProfileDetails()
    {
    System.out.println(name + ", " + mobileNumber);
    }

}
