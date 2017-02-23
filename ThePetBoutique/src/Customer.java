
public class Customer 
{
	//Declare variables
	private String customerName;
	private String address;
	private int phone;
	private String emailAddress;
	
	//Setters and Getters
	public void setName(String n)
	{
		customerName = n;
	}
	public void setAddress(String a)
	{
		address= a;
	}
	public void setPhone(int p)
	{
		phone = p;
	}
	public void setEmailAddress(String e)
	{
		emailAddress = e;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public String getAddress()
	{
		return address;
	}
	public int getPhone()
	{
		return phone;
	}
	public String getEmailAddress()
	{
		return emailAddress;
	}
}

