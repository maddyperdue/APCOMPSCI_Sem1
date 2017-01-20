public class inventory
{
	//instance variables
	private String manufacturer;
	private String name;
	private String category;
	private int UPC;
	private double price;
	
	//Default Constructor
	public inventory()
	{
		manufacturer = "";
		name = "";
		category = "";
		UPC = 0;
		price = 0;
	}
	
	//Constructors
	public inventory(String manu, String nm)
	{
		manufacturer = manu;
		name = nm;
		category = "Undefined";
		price = 0;
		UPC = (int)(Math.random()*1000000000) + 1;
	}
	
	public inventory(String manu, String nm, String cat, double prc)
	{
		manufacturer = manu;
		name = nm;
		category = cat;
		price = prc;
		UPC = (int)(Math.random()*1000000000) + 1;
	}
	
	//Modifier
	public void setProfile(String manu, String nm, String cat, double prc)
	{
		manufacturer = manu;
		name = nm;
		category = cat;
		price = prc;
		UPC = (int)(Math.random()*1000000000) + 1;
	}
	
	//Accessors
	public String toString()
	{
		return "Item info...\nItem Manufacturer: " + manufacturer +
							"\nItem Name : " + name +
							"\nItem Category: " + category +
							"\nUPC#: " + UPC +
							"\nItem Price: " + price;
	}
}