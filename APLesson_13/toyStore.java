import java.util.ArrayList;
public class toyStore
{
<<<<<<< HEAD
	
	private ArrayList<toy> toyList;
	
	//constructors
	public toyStore()
	{
		this.toyList = new ArrayList<toy>();
	}
	
	public toyStore(String tl)
	{

		loadToys(tl);
	}
	
	
	public void loadToys(String ts)
	{
		int x = 1;
		ArrayList<String>toys = new ArrayList<String>(Arrays.asList(ts.split(" ")));
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 2);
			toy object = new toy(getThatToy(name));
			if(getThatToy(name) == "")
			{
				if(type.equals("Car"))
				{
					Car a = new Car("corvette");
					toyList.add(a);
				}
				
				else if(type.equals("AF"))
				{
					AFigure b = new AFigure("power ranger");
					toyList.add(b);
				}
			}
			else
			{
				x++
				toylist.get(i).setCount(x);
			}
		}
=======
	public static void main(String[]args)
	{
		ArrayList<toy> toyList = new ArrayList<toy>();
	}

	public toyStore()
	{
		loadToys();
	}
	
	public toyStore(ArrayList<toy>)
	{
		loadToys(toy);
	}
	
	public String loadToys(String ts)
	{
		
>>>>>>> origin/master
	}
	
	public String getThatToy(String nm)
	{
<<<<<<< HEAD
		for(int i = 0; i<toys.size(); i+=2)
		{
			if(toylist.get(i).getName().equals(nm))
			{
				return toylist.get(i).getName();
			}
			else
				return "";
		}
=======
		
>>>>>>> origin/master
	}
	
	public String getMostFrequentToy()
	{
<<<<<<< HEAD
		String name;
		int max = Integer.MIN_VALUE
		for(int i = 0; i<toys.size(); i+=2)
		{
			if (max < count)
		}
=======
		
>>>>>>> origin/master
	}
	
	public String getMostFrequentType()
	{
		new int cars = 0;
		new int figures = 0;
		
		for //each toy in toylist
		if(car
			cars++;
		if(AF
			figures++;
	}
	
	public String toString()
	{
		return toyList;
	}
}
// same it's going