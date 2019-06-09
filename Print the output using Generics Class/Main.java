import java.util.*;
public class Main<T> 
{
    T var;
    public static void main(String[] args) 
    {
    	Scanner in = new Scanner(System.in);
        
        // Getting inputs
    	Main<Integer> intValue = new Main<Integer>();
    	intValue.var = Integer.parseInt(in.nextLine());
        Main<String> strValue = new Main<String>();
    	strValue.var = in.nextLine();
        Main<Float> floatValue = new Main<Float>();
    	floatValue.var = Float.parseFloat(in.nextLine());
    	
        // Printing required values
    	if(Integer.class.isInstance(intValue.var))
    	{
    		System.out.println("Integer Value: " + intValue.var);
    	}
        if(String.class.isInstance(strValue.var))
    	{
    		System.out.println("String Value: " + strValue.var);
    	}
        if(Float.class.isInstance(floatValue.var))
    	{
    		System.out.println("Float value: " + floatValue.var);
    	}
    		
    	in.close();
    }
}