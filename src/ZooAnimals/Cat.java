package ZooAnimals;


public class Cat extends Feline implements EatStrategy
{
	private String strategy;
	
	public Cat(String name, String strategy)
	{
		this.name = name;
		this.strategy = strategy;
	}
	public Cat(String name) 
	{
		super(name + " the Cat");
	}
	public void eat()
    {
    	System.out.println(getName() + " " + this.strategy);
	}
}
