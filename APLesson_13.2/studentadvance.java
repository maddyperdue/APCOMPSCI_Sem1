public class studentadvance extends advance
{
	public studentadvance(int d)
	{
		super(d);
	}
	
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return "\nSerial #: " + getSerialNo() +
				"\nPrice: " + getPrice() +
				"\n(STUDENT ID REQUIRED)";
	}
}