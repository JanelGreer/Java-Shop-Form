
public class Pet {
	
	//Declare variables
	private String petName;
	private String petType;
	private double petAge;
	private double petWeight;

	//Setters and Getters
	public void setPetName(String pn)
	{
		petName = pn;
	}
	public void setPetType(String pt)
	{
		petType = pt;
	}
	public void setPetAge(double pa)
	{
		petAge = pa;
	}
	public void setPetWeight(double pw)
	{
		petWeight = pw;
	}
	public String getPetName()
	{
		return petName;
	}
	public String getPetType()
	{
		return petType;
	}
	public double getPetAge()
	{
		return petAge;
	}
	public double getPetWeight()
	{
		return petWeight;
	}
}

