package ZooAnimals;

public class Lion extends Feline
{
	private EatStrategy strategy;
	
	public Lion(String name, EatStrategy strategy)
	{
		super(name + " the Lion");
		this.strategy = strategy;
	}
	public Lion(String name) 
	{
		super(name + " the Lion");
	}
	
	public void makeNoise()
	{
		System.out.println(getName() + "heaves a mighty roar!");
	}
	public void eat()
    {
		System.out.print(getName() + " " + strategy.eat());
	}
}
