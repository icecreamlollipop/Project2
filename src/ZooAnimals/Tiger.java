package ZooAnimals;

public class Tiger extends Feline
{
	private EatStrategy strategy;
	
	public Tiger(String name, EatStrategy strategy)
	{
		super(name + " the Tiger");
		this.strategy = strategy;
	}
	public Tiger(String name) 
	{
		super(name + " the Tiger");
	}
	public void eat()
    {
		System.out.print(getName() + " " + strategy.eat());
	}
}
