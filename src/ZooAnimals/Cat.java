package ZooAnimals;


public class Cat extends Feline
{
	private EatStrategy strategy;
	
	public Cat(String name, EatStrategy strategy)
	{
		this.name = name;
		this.strategy = strategy;
	}
	public Cat(String name) 
	{
		super(name + " the Cat");
	}
	
	@Override
	public void eat()
    {
    	System.out.println(getName() + " " + this.strategy,eat());
	}
}
