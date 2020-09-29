package ZooAnimals;

public class Shark extends Chondrichthyes
{
	private EatStrategy strategy;
	
	public Shark(String name, EatStrategy strategy)
	{
		super(name + " the Shark");
		this.strategy = strategy;
	}
    public Shark(String name)
    {
        super(name + " the Shark");
    }
    public void eat()
    {
		System.out.print(getName() + " " + strategy.eat());
	}

}
