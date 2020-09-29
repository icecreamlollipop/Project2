package ZooAnimals;

public class Ray extends Chondrichthyes
{
	private EatStrategy strategy;
	
	public Ray(String name, EatStrategy strategy)
	{
		super(name + " the Ray");
		this.strategy = strategy;
	}
    public Ray(String name)
    {
        super(name + " the Ray");
    }
    public void eat()
    {
		System.out.print(getName() + " " + strategy.eat());
	}
}
