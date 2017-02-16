import java.util.ArrayList;
import java.util.Arrays;

public class toyStore
{
	
	ArrayList<toy> toyList;
	
	//constructors
	public toyStore()
	{
		this.toyList = new ArrayList<toy>();
	}
	
	public toyStore(String ts)
	{
		loadToys(ts);
	}
	
	
	public void loadToys(String ts)
	{
		
		toyList = new ArrayList<toy>();
		ArrayList<String>toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			toy t = getThatToy(name);
			String type = toys.get(i + 1);
			if(t == null)
			{
				if(type.equals("Car"))
				{
					toyList.add(new Car(name));
				}
				
				if(type.equals("AF"))
				{
					toyList.add(new AFigure(name));
				}
			}
			else
			{
				t.setCount(t.getCount()+1);
			}
		}
	}
	
	public toy getThatToy(String nm)
	{
		for(toy t : toyList)
		{
			if(t.getName().equals(nm))
			{
				return t;
			}
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(toy t : toyList)
		{
			if (max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;

	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(toy t : toyList)
		{
			if(t.getType().equals("Car"))
			cars++;
			if(t.getType().equals("Action Figure"))
			figures++;
		}
		
		if(cars>figures)
			return "Cars";
		if(figures>cars)
			return "Action Figures";
		else
			return "Equal amounts of action figures and cars!";
	}
	
	public String toString()
	{
		String result = "";
		for(toy t : toyList)
		{
			result += "" + t;
		}
		return "\nToys in stock...\n" + result + "\n";
	}
}