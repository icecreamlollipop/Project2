package ZooAnimals;

public class Hippo extends Pachyderm
{
	private EatStrategy strategy;
	
	public Hippo(String name, EatStrategy strategy)
	{
		super(name + " the Hippo");
		this.strategy = strategy;
	}
    public Hippo(String name)
    {
        super(name + " the Hippo");
    }
    public void eat()
    {
		System.out.print(getName() + " " + strategy.eat());
	}
}
