
public class ServiceQuote 
{
	//Declare variables
	private double service;
	private double medication;
	final double SALES_TAX = .0925;
	
	//Setters and Getters
	public void setService(double s)
	{
		service = s;
	}
	public void setMedication(double m)
	{
		medication = m;
	}
	public double getService()
	{
		return service;
	}
	public double getMedication()
	{
		return medication;
	}

	//Calculate Tax
	public double getTaxAmount()
	{
		double subTotal = getService() + getMedication();
		double taxAmount = subTotal * SALES_TAX;
		return taxAmount;
		
	}//Calculate Total
	public double getTotal()
	{
		double total =  getService() + getMedication() + getTaxAmount();
		return total;
	}
	
}
