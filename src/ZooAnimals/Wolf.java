package ZooAnimals;

public class Wolf extends Canine
{
	private EatStrategy strategy;
	
	public Wolf(String name, EatStrategy strategy)
	{
		super(name + " the Wolf");
		this.strategy = strategy;
	}
	public Wolf(String name) 
	{ 
		super(name + " the Wolf");
	}
	
	public void makeNoise()
	{
		System.out.println(getName() + " makes a loud grumble as if it wants to eviscerate an animal.");
	}
	public void eat()
    {
		System.out.print(getName() + " " + strategy.eat());
	}
}
