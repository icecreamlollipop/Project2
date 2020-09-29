package ZooAnimals;

public class Lynx extends Feline
{
	private EatStrategy strategy;
	
	public Lynx(String name, EatStrategy strategy)
	{
		super(name + " the Lynx");
		this.strategy = strategy;
	}
	public Lynx(String name) 
	{
		super(name + " the Lynx");
	}
	public void eat()
    {
		System.out.print(getName() + " " + strategy.eat());
	}
}
