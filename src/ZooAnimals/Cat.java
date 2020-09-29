package ZooAnimals;


public class Cat extends Feline
{
	private EatStrategy strategy;
	
	public Cat(String name, EatStrategy strategy)
	{
		super(name + " the Cat");
		this.strategy = strategy;
	}
	public Cat(String name) 
	{
		super(name + " the Cat");
	}
	
	public void eat()
    {
    	System.out.print(getName() + " " + strategy.eat());
	}
}
